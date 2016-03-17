package cc.catalysts.boot.sample.web.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Joel Colledge
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String main() {
        return "thymeleaf-page";
    }

    @RequestMapping(value = "/angular", method = RequestMethod.GET)
    ModelAndView angular() {
        Map<String, Object> model = new HashMap<>();
        return new ModelAndView("angular-page", model);
    }

}
