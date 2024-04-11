package webapp.logout;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import javax.servlet.ServletException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class LogoutServletTest {

    // @Mock
    // private HttpServletRequest request;

    // @Mock
    // private HttpServletResponse response;

    // @Mock
    // private HttpSession session;

    // @Mock
    // private RequestDispatcher dispatcher;

    // @Before
    // public void setUp() {
    // MockitoAnnotations.openMocks(this);
    // }

    // @Test
    // public void testDoGet() throws ServletException, IOException {
    // // Mocking session and request
    // when(request.getSession()).thenReturn(session);

    // // Creating instance of LogoutServlet
    // LogoutServlet logoutServlet = new LogoutServlet();

    // // Mocking request dispatcher
    // when(request.getRequestDispatcher("/WEB-INF/views/login.jsp")).thenReturn(dispatcher);

    // // Calling doGet method
    // logoutServlet.doGet(request, response);

    // // Verifying that session is invalidated
    // verify(session).invalidate();

    // // Verifying that request dispatcher is called with the correct path
    // verify(dispatcher).forward(request, response);
    // }
}
