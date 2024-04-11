package webapp.todo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddTodoServletTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run Chrome in headless mode
        options.addArguments("--disable-gpu"); // Disable GPU acceleration

        // Use relative path or environment variable for chromedriver
        String chromedriverPath = System.getenv("CHROMEDRIVER_PATH");
        if (chromedriverPath == null) {
            chromedriverPath = "chromedriver-win64/chromedriver.exe";
        }

        System.setProperty("webdriver.chrome.driver", chromedriverPath);
        driver = new ChromeDriver(options);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testAddTodo() {
        try {
            driver.get("http://localhost:8080/add-todo.do");

            // Enter description
            driver.findElement(By.name("newtodo")).sendKeys("Test Todo");

            // Enter category (if applicable)
            driver.findElement(By.name("category")).sendKeys("Test Category");

            // Submit the form
            driver.findElement(By.name("addtodo")).click();

            // Wait for the success message or confirmation of item addition
            // You can use WebDriverWait for this purpose

            // Assertion: Check if the added to-do item appears on the page
            assertTrue(driver.getPageSource().contains("Test Todo"),
                    "New to-do item not found on the page after addition.");
        } catch (Exception e) {
            // Handle any exceptions gracefully
            e.printStackTrace();
        }
    }
}
