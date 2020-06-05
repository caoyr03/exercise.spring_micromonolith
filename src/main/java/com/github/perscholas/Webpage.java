package com.github.perscholas;

import org.springframework.web.bind.annotation.*;

@RestController
public class Webpage {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String webpage() {
        return new FileReader("index.html").toString();
    }
}
