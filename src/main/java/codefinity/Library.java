package codefinity;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Library {

    public ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookById(int id) {
        List<Book> finalList = new ArrayList<>();
        for(int i = 0; i< books.size() ;i++){
            if(books.get(i).getId() == id){
                finalList.add(books.get(i));
            }
        }
        System.out.println(books);
    books.removeAll(finalList);
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> finalBookList = new ArrayList<>();
        for(int i= 0;i < books.size() ;i++){
            if(books.get(i).getAuthor().equals(author)){
                finalBookList.add(books.get(i));
            }
        }
        return finalBookList;
    }

    public List<Book> findBooksPublishedAfterYear(int year) {
        List<Book> finalList = new ArrayList<>();
        if(year > 0){
            for(int i = 0; i < books.size(); i++){
                if(books.get(i).getYear() > year){
                    finalList.add(books.get(i));
                }
            }
            return finalList;
        }

        return Collections.emptyList();
    }

    public void displayAllBooks() {
        System.out.println(books);
    }
}
