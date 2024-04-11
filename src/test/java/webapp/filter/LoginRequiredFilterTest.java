package webapp.filter;

import static org.mockito.Mockito.*;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginRequiredFilterTest {

    // private LoginRequiredFilter filter;
    // private HttpServletRequest request;
    // private HttpServletResponse response;
    // private FilterChain chain;

    // @BeforeEach
    // public void setup() {
    // filter = new LoginRequiredFilter();
    // request = mock(HttpServletRequest.class);
    // response = mock(HttpServletResponse.class);
    // chain = mock(FilterChain.class);
    // }

    // @Test
    // public void testDoFilter_WithValidSession() throws IOException,
    // ServletException {
    // // Set up a valid session
    // when(request.getSession().getAttribute("name")).thenReturn("username");

    // // Forwarding request
    // filter.doFilter(request, response, chain);

    // // Verify that the filter chain is invoked
    // verify(chain).doFilter(request, response);
    // }

    // @Test
    // public void testDoFilter_WithoutValidSession() throws IOException,
    // ServletException {
    // // No valid session
    // when(request.getSession().getAttribute("name")).thenReturn(null);

    // // Mock RequestDispatcher
    // RequestDispatcher dispatcher = mock(RequestDispatcher.class);
    // when(request.getRequestDispatcher("/login.do")).thenReturn(dispatcher);

    // // Forwarding request
    // filter.doFilter(request, response, chain);

    // // Verify that forward method is called
    // verify(dispatcher).forward(request, response);
    // }
}
