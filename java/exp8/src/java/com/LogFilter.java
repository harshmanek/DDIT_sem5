package com;
import java.io.IOException;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.util.Date;
public class LogFilter implements Filter {
@Override
public void init(FilterConfig filterConfig) throws ServletException {
}
@Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
throws IOException, ServletException {
String clientIP = request.getRemoteAddr();
System.out.println("Client IP: " + clientIP + ", Time: " + new Date());
chain.doFilter(request, response); // Proceed to the next filter or servlet
}
@Override
public void destroy() {
}
}