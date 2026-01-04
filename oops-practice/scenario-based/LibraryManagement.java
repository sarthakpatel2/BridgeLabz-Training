class LibraryManagement{
    static String[][] books = {
        {"Java Programming", "James Gosling","Available"},
        {"Game of Thrones","Guido ","Available"},
        {"Data Structures","Mark Allen","Checked Out"},
        {"Web Development","Tim Berners-Lee", "Available"}
    };
    //display all books
    static void displayBooks(){
        System.out.println("Library Books:");
        for (String[] book :books) {
            System.out.println("Title: "+book[0]+", Author: "+book[1]+", Status: "+book[2]);
        }
    }
    //search book by partial title
    static void searchBook(String keyword){
        System.out.println("\nSearch Result:");
        for (String[] book : books){
            if (book[0].toLowerCase().contains(keyword.toLowerCase())){
                System.out.println("Title: "+book[0]+", Author: "+book[1]+", Status: "+ book[2]);
            }
        }
    }
    //update book status
    static void checkoutBook(String title){
        for (String[] book :books) {
            if (book[0].equalsIgnoreCase(title)){
                book[2]="Checked Out";
                System.out.println("\nBook checked out successfully");
                return;
            }
        }
        System.out.println("\nBook not found");
    }
    public static void main(String[] args){
        displayBooks();
        searchBook("java");
        checkoutBook("Java Programming");
        displayBooks();
    }
}
