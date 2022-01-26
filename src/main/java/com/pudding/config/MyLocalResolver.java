package com.pudding.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocalResolver implements LocaleResolver {
    @Override  // 解析请求
    public Locale resolveLocale(HttpServletRequest request) {
        // 获取请求中的参数
        String language = request.getParameter("l");
        Locale locale = Locale.getDefault();  // 如果没有就用默认的
        // 如果不为空使用传过来的
        if (!StringUtils.isEmpty(language)) {
            String[] s = language.split("_");
            return new Locale(s[0], s[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
