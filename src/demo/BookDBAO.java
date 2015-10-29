package demo;

import java.awt.print.Book;
import java.util.ArrayList;

/**
 * Created by 142773A on 10/29/2015.
 */
public class BookDBAO {
    public BookDBAO() {
    }

    public BookDetails getBookDetails(String bookId){
        return createDummyBook(bookId);
    }

    private BookDetails createDummyBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.90f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }
    
}
