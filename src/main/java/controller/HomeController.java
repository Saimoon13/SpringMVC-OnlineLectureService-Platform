package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private static final Logger logger =
            LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/")
    public String test(){
        logger.info("아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아");

        return "discuss/newTopic";

    }
}