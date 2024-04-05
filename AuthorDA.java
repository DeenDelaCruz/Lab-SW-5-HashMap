import java.io.*;
import java.util.*;

public class AuthorDA {
    private HashMap<String, AuthorDetails> authorMap;

    public AuthorDA() throws FileNotFoundException {
        Scanner authorInfo = new Scanner(new FileReader("Author.csv"));

        authorMap = new HashMap<>();

        while(authorInfo.hasNext()){
            String rowAuthor = authorInfo.nextLine();
            String[] rowAuthorSpecific = rowAuthor.split(",");

            AuthorDetails author = new AuthorDetails();
            author.setName(rowAuthorSpecific[0].trim());
            author.setDesc(rowAuthorSpecific[1].trim());

            authorMap.put(author.getName(), author);
        }
        authorInfo.close();
    }

    public HashMap<String, AuthorDetails> getAuthorMap(){
        return authorMap;
    }
}