package com.hotnerds.badgeload;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetTest {

    @GetMapping("/test")
    public String getTest(){
        return "Test ongoing";
    }
}
