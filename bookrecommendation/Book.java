package bookrecommendation;

public class Book {

    public String title;
    public String author;
    public String genre;
    public double rating;

    Book(String title, String author, String genre,double rating){

        this.title=title;
        this.author=author;
        this.genre=genre;
        this.rating=rating;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getGenre(){
        return genre;
    }

    public double getRatings(){
        return rating;
    }

    public String toString(){

        return "Title: "+title+" Author: "+author+" Genre: "+genre+" Rating: "+rating;
    }

    
}
