package com.example.tobi.springbootessential.Filter;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.http.HttpResponse;

//@Component
public class LoggingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {


        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(
            ServletRequest servletRequest,
            ServletResponse servletResponse,
            FilterChain Chain
    ) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        //요청정보로 감 <---- 들어오는
        System.out.println("request: " + request.getRequestURI());
        System.out.println("Request Method: " + request.getMethod());

        //필터 체인 계속해서 다음 필터 또는 서블릿으로 전달
        Chain.doFilter(request, response);

        //응답 상태 코드 로깅 <---- 나가는
        System.out.println("Response: " + response.getStatus());

    }

    @Override
    public void destroy() {
        //필터 종료시 처리(필요 시)

        Filter.super.destroy();
    }
}
