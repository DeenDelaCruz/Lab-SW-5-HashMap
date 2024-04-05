import java.io.*;
import java.util.*;

public class BookDA {
    private HashMap<String, BookDetails> bookMap;

    public BookDA() throws FileNotFoundException {
        Scanner bookInfo = new Scanner(new FileReader("Book.csv"));

        bookMap = new HashMap<>();

        while(bookInfo.hasNext()){
            String rowBook = bookInfo.nextLine();
            String[] rowBookSpecific = rowBook.split(",");

            BookDetails book = new BookDetails();

            book.setIsbn(rowBookSpecific[0].trim());
            book.setTitle(rowBookSpecific[1].trim());
            book.setAuthorName(rowBookSpecific[2].trim());

            bookMap.put(book.getIsbn(), book);
        }
        bookInfo.close();
    }

    public HashMap<String, BookDetails> getBookMap(){
        return bookMap;
    }
}