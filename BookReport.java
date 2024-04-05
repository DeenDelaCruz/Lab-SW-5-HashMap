import java.io.*;
import java.util.*;

public class BookReport {
    public static void main(String[] args) throws FileNotFoundException {
        BookDA bookDT = new BookDA();
        AuthorDA authorDT = new AuthorDA();

        HashMap<String, BookDetails> bookMap = bookDT.getBookMap();
        HashMap<String, AuthorDetails> authorMap = authorDT.getAuthorMap();

        for (Map.Entry<String, BookDetails> entry : bookMap.entrySet()) {
            
            BookDetails book = entry.getValue();
            System.out.println(book.getIsbn() + " " + book.getTitle());
            
            AuthorDetails author = authorMap.get(book.getAuthorName());
                System.out.println("\t" + author.getName() + " - " + author.getDesc());
        }
    }
}