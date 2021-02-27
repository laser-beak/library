package jt.library.webview;

import jt.library.model.entity.Author;
import jt.library.service.AuthorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * created: Sep 4, 2010T7:39:11 PM
 *
 * @author ctapobep
 */
public class AuthorsController extends MultiActionController {

    Logger logger = LoggerFactory.getLogger(AuthorsController.class);

    private AuthorService authorService;

    public AuthorsController(AuthorService authorService) {
        this.authorService = authorService;
    }

    private List<Author> authors;

    /**
     * Вывод всех авторов
     *
     * @param request
     * @param response
     * @return
     */
    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
        logger.debug("Выполнен запрос достать всех авторов из таблицы!");
        authors = authorService.getAll();

        ModelAndView modelAndView = new ModelAndView("author/list");
        modelAndView.addObject("msg", "Контроллер - для страницы Авторов!");
        modelAndView.addObject("authors", authors);
        return modelAndView;
    }

    public ModelAndView edit(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("author/edit");
        return modelAndView;
    }

    public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("author/delete");
        return modelAndView;
    }

    public ModelAndView create(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("author/create");
        modelAndView.addObject("author", new Author());
        return modelAndView;
    }

    @RequestMapping(value="/submit",method = RequestMethod.POST)
    public String submit(@ModelAttribute("author") Author author,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("firstName", author.getFirstName());
        model.addAttribute("lastName", author.getLastName());
        return "authorView";
    }
}
