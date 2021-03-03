package jt.library.webview;

import jt.library.model.entity.Book;
import jt.library.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class BooksController extends MultiActionController {

    Logger logger = LoggerFactory.getLogger(BooksController.class);

    private BookService bookService;

    private List<Book> books;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
        books = bookService.getAll();
        ModelAndView modelAndView = new ModelAndView("book/list");
        modelAndView.addObject("books", books);
        return modelAndView;
    }

    public ModelAndView create(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("book/add/create");
        modelAndView.addObject("book", new Book());
        return modelAndView;
    }

}
