package cc.catalysts.boot.sample.web.form;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * @author Joel Colledge
 */
@Controller
public class MainController {

    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(MainController.class);

    private final MessageSource messageSource;

    @Autowired
    public MainController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    ModelAndView main(HttpServletRequest request, HttpServletResponse response, @RequestParam(name = "lang", required = false) String lang) {
        Map<String, Object> model = new HashMap<>();
        if (lang != null) {
            Locale locale = StringUtils.parseLocaleString(lang);
            if (locale == null) {
                LOG.debug("Invalid locale string '{}'", lang);
            } else {
                LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
                localeResolver.setLocale(request, response, locale);

                model.put("localeSet", messageSource.getMessage("content.thymeleaf.localeSet", new Object[]{locale.toString()}, LocaleContextHolder.getLocale()));
            }
        }

        return new ModelAndView("thymeleaf-page", model);
    }

    @RequestMapping(value = "/angular", method = RequestMethod.GET)
    String angular() {
        return "angular-page";
    }

}
