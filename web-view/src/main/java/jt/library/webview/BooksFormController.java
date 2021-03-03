package jt.library.webview;

import jt.library.model.entity.Book;
import jt.library.service.BookService;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class BooksFormController extends SimpleFormController {

    BookService bookService;

    public BooksFormController(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        return new Book();
    }

    @Override
    protected ModelAndView onSubmit(Object command, BindException errors) throws Exception {
        Book book = (Book) command;
        bookService.saveOrUpdate(book);

        List<Book> bookList = bookService.getAll();

        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("books", bookList);
        return mv;
    }
}
