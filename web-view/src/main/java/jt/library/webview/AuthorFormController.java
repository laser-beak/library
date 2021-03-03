package jt.library.webview;

import jt.library.model.entity.Author;
import jt.library.service.AuthorService;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class AuthorFormController extends SimpleFormController {

    private AuthorService authorService;

    public AuthorFormController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        return new Author();
    }

    @Override
    protected ModelAndView onSubmit(Object command, BindException errors) throws Exception {
        Author author = (Author) command;
        authorService.saveOrUpdate(author);

        List<Author> authorList = authorService.getAll();

        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("authors", authorList);
        return mv;
    }
}
