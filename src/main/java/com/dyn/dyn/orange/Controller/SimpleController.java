package com.dyn.dyn.orange.Controller;

import org.apache.log4j.Logger;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lordtemich on 12/5/17.
 */
@Controller
public class SimpleController {

    private static final Logger log=Logger.getLogger(SimpleController.class);
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("/")
    public String redirToList(){

        return "redirect:/product";
    }
    @RequestMapping("/product")
    public void prod(){
        log.info("INFO");
    }
}
