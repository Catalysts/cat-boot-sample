package cc.catalysts.boot.sample.web.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Joel Colledge
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String main() {
        return "thymeleaf-page";
    }

}
