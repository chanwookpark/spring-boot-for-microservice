package spring.boot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chanwook on 2014. 4. 13..
 */
@RestController
@EnableAutoConfiguration
public class SampleWebController {

    @RequestMapping("/")
    String home(){
        return "Hello~ World~";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleWebController.class, args);
    }

}
