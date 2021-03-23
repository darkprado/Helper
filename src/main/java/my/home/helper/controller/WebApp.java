package my.home.helper.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RequestMapping("/")
@ConfigurationProperties(prefix = "web")
@RestController
public class WebApp {

    String welcome;

//    if not use prefix
//    public WebApp(@Value("${web.welcome}") String welcome) {
//        this.welcome = welcome;
//    }

    @GetMapping
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok(welcome);
    }

}
