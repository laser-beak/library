package jt.library.webview;

import jt.library.model.dto.RegistrationDto;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class RegistrationController extends SimpleFormController {

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        return new RegistrationDto();
    }

    @Override
    protected Map referenceData(HttpServletRequest request) throws Exception {
        Map<String, Object> attributes = new HashMap<String, Object>(1);
        attributes.put("countries", getAllCountries());
        return attributes;
    }

    @Override
    protected ModelAndView onSubmit(Object command, BindException errors) throws Exception {
        RegistrationDto dto = (RegistrationDto) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("username", dto.getUsername());
        mv.addObject("country", dto.getCountry());
        return mv;
    }

    private Map<String, String> getAllCountries() {
        Map<String, String> map = new TreeMap<String, String>();
        Locale.setDefault(new Locale("en"));
        Locale[] locales = Locale.getAvailableLocales();
        for (int i = 0; i < locales.length; i++) {
            String country = locales[i].getDisplayCountry();
            map.put(country, country);
        }
        return map;
    }
}
