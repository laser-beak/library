package jt.library.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created: Sep 4, 2010T7:07:47 PM
 *
 * @author ctapobep
 */
public class Starter {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/jt/library/model/entity/applicationContext-dao.xml");
    }
}
