package com;
import java.io.IOException;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
@WebFilter(filterName = "AuthenticationFilter", urlPatterns = {"/**"})
public class AuthenticationFilter implements Filter {
@Override
public void init(FilterConfig filterConfig) throws ServletException {
}
@Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
throws IOException, ServletException {
String username = request.getParameter("username");
String password = request.getParameter("password");
if (username == null || password == null) {
response.getWriter().println("Authentication failed. Please provide valid credentials.");
return;
}
if ("nehang".equals(username) && "password".equals(password)) {
chain.doFilter(request, response); // Proceed to the servlet
} else {
response.getWriter().println("Authentication failed. Please provide valid credentials.");
}
}
@Override
public void destroy() {
}
}