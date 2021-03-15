package my.home.helper.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class FirstController {

//    @Value("${spring.datasource.test}")
//    String test;

    @GetMapping
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("test");
    }

}
