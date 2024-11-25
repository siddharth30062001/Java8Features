package bookrecommendation;

public class BookRecommendation {

    public String title;
    public double rating;

    BookRecommendation(String title, double rating){

        this.title=title;
        this.rating=rating;
    }

    public String getTitle(){
        return title;
    }

    public double getRatings(){
        return rating;
    }

    public String toString(){

        return "Title: "+title+" Rating: "+rating;
    }
    
}
