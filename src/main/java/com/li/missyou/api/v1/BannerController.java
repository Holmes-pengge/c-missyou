package com.li.missyou.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class BannerController {
    @GetMapping("/test")
    public void test(HttpServletResponse response) throws IOException {
        response.getWriter().write("hello, lipeng!");
//        return "hello, lipeng!";
    }
}
