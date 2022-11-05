package org.justsmile.web.view;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/index")
    String hello() {
        return "HelloWorld";
    }
}
