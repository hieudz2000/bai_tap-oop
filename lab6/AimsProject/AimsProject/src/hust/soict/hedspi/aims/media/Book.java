package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class Book extends Media{
    private ArrayList<String> authors;

    public Book(String title) {
        super(title);
    }

    public Book(String title, ArrayList<String> authors) {
        super(title);
        this.authors = authors;
    }

    public Book(String title, String category, ArrayList<String> authors) {
        super(title, category);
        this.authors = authors;
    }

    public void addAuthor(String authorName){
//        for(int i = 0; i < authors.size(); i++){
//            if(authorName.equals(authors.get(i))){
//                System.out.println("Author existed. Can not add author.");
//                return;
//            }
//        }
        if(this.authors.contains(authorName)) {
            System.out.println("Author existed. Can not add author");
        } else {
            this.authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName){
//        for(int i = 0; i < authors.size(); i++){
//            if(authorName.equals(authors.get(i))){
//                authors.remove(authorName);
//                return;
//            }
//        }
        if(!this.authors.remove(authorName))
            System.out.println("Author does not exist. Can not delete ");


    }


}
