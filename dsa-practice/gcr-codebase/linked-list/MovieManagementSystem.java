class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie prev, next;
    Movie(String title, String director, int year, double rating){
        this.title=title;
        this.director=director;
        this.year=year;
        this.rating= rating;
        this.prev =null;
        this.next=null;
    }
}
// doubly Linked List class
class MovieDoublyLinkedList{
    private Movie head, tail;
    //add at beginning
    void addAtBeginning(String title, String director,int year, double rating){
        Movie newMovie = new Movie(title, director, year, rating);
        if (head ==null){
            head=tail=newMovie;
        }else{
            newMovie.next=head;
            head.prev=newMovie;
            head=newMovie;
        }
    }
    // add at end
    void addAtEnd(String title,String director,int year, double rating){
        Movie newMovie=new Movie(title, director, year, rating);
        if (tail==null) {
            head=tail=newMovie;
        }else{
            tail.next=newMovie;
            newMovie.prev= tail;
            tail= newMovie;
        }
    }
    // add at specific position
    void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        Movie temp =head;
        for (int i =1;i<position-1 && temp!=null; i++) {
            temp = temp.next;
        }
        if (temp ==null || temp.next == null){
            addAtEnd(title, director, year, rating);
        }else{
            Movie newMovie=new Movie(title, director, year, rating);
            newMovie.next=temp.next;
            newMovie.prev=temp;
            temp.next.prev=newMovie;
            temp.next=newMovie;
        }
    }
    // remove movie by title
    void removeByTitle(String title){
        Movie temp=head;
        while (temp!=null){
            if (temp.title.equalsIgnoreCase(title)){
                if (temp ==head) {
                    head=temp.next;
                    if (head !=null) head.prev =null;
                } else if (temp==tail){
                    tail =temp.prev;
                    tail.next= null;
                } else{
                    temp.prev.next =temp.next;
                    temp.next.prev=temp.prev;
                }
                System.out.println("Movie removed successfully");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Movie not found");
    }
    // search by director
    void searchByDirector(String director){
        Movie temp=head;
        boolean found =false;
        while (temp != null){
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp=temp.next;
        }
        if (!found) {
            System.out.println("No movies found for this director");
        }
    }
    //search by rating
    void searchByRating(double rating) {
        Movie temp = head;
        boolean found =false;
        while (temp!=null){
            if (temp.rating==rating) {
                displayMovie(temp);
                found=true;
            }
            temp=temp.next;
        }
        if (!found){
            System.out.println("No movies found with this rating");
        }
    }
    //update rating by title
    void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)){
                temp.rating=newRating;
                System.out.println("Rating updated successfully");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Movie not found");
    }
    //display forward
    void displayForward(){
        Movie temp =head;
        if (temp==null){
            System.out.println("No movies to display");
            return;
        }
        while (temp!=null){
            displayMovie(temp);
            temp=temp.next;
        }
    }
    // display reverse
    void displayReverse(){
        Movie temp=tail;
        if (temp ==null) {
            System.out.println("No movies to display");
            return;
        }
        while (temp!=null){
            displayMovie(temp);
            temp=temp.prev;
        }
    }
    // helper method
    void displayMovie(Movie m){
        System.out.println("Title: "+m.title+", Director: "+m.director+", Year: "+m.year+", Rating: " + m.rating);
    }
}
//main class
public class MovieManagementSystem{
    public static void main(String[] args){
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        list.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        list.addAtBeginning("Interstellar", "Christopher Nolan", 2014, 8.6);
        list.addAtEnd("Avatar", "James Cameron", 2009, 7.8);
        list.addAtPosition(2, "Titanic", "James Cameron", 1997, 7.9);
        System.out.println("\nMovies (Forward):");
        list.displayForward();
        System.out.println("\nMovies (Reverse):");
        list.displayReverse();
        System.out.println("\nSearch by Director:");
        list.searchByDirector("Christopher Nolan");
        System.out.println("\nUpdate Rating:");
        list.updateRating("Avatar", 8.0);
        System.out.println("\nRemove Movie:");
        list.removeByTitle("Titanic");
        System.out.println("\nFinal Movie List:");
        list.displayForward();
    }
}
