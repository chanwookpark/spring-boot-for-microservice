package spring.boot.sample.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chanwook on 2014. 4. 13..
 */
@RestController
public class SampleWebController {

    @RequestMapping("/")
    String home(){
        return "Hello~ World~";
    }
}
