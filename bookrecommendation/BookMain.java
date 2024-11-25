package bookrecommendation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BookMain {

    public static void main(String[] args) {
        
        List<Book> list=new ArrayList<>();
        list.add(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 4.4));
        list.add(new Book("1984", "George Owvell", "Fiction", 4));
        list.add(new Book("Pride and Prejudice", "Jane Austen", "Romance", 4.5));
        list.add(new Book("The Hobbit", "J.R.R. Tolkien", "Adventure", 4.9));
        list.add(new Book("Brave New World", "Aldous Huxley", "Science Fiction", 4.5));


        List<Book> listOfBook=
            list.stream().filter(n->n.getGenre().equals("Science Fiction") && n.getRatings()>4)
            .collect(Collectors.toList());
            System.out.println(listOfBook);

            System.out.println("*********************");

        List<BookRecommendation> list2=
            list.stream().map(t-> new BookRecommendation(t.getTitle(), t.getRatings()))
            .collect(Collectors.toList());
            System.out.println(list2);

            System.out.println("*********************");
        
        List<Book> list3=
           list.stream().sorted(Comparator.comparingDouble(Book::getRatings).reversed())
           .collect(Collectors.toList());
           System.out.println(list3);

           
        // int pageSize=5;
        // List<List<BookRecommendation>> paginatedRecommendations = new ArrayList<>();
        //    for (int i = 0; i < list.size() && i < 10; i += pageSize) {
        //        paginatedRecommendations.add(list.subList(i, Math.min(i + pageSize, list.size())));
        //    }
   
        // System.out.println(paginatedRecommendations);
      
    }
    
}
