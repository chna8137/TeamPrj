package kopo.poly.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class MainController {

    @GetMapping("/index")
    public String index() throws Exception {
        log.info(this.getClass().getName() + ".index Start!");
        return "/index";
    }

    @GetMapping("/main")
    public String main() throws Exception {
        log.info(this.getClass().getName() + ".index Start!");
        return "/main";
    }
    @GetMapping("/test")
    public String good() throws Exception {
        log.info(this.getClass().getName() + ".good Start!");
        return "/test";
    }
//    @RequestMapping (value = "/list",method = {RequestMethod.GET, RequestMethod.POST})
//    public String notice() throws Exception {
//        log.info(this.getClass().getName() + ".good Start!");
//        return "/list";
//    }
}
