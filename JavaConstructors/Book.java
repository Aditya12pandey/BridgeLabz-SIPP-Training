public class Book {
    // Paratmeter
    String title ;
    String author ; 
    int price;
    //default constructore
    Book(){
        this.title = "Flames";
        this.author = "Vkj";
        this.price = 1000;
    }
     //Parameterized constructor
    Book(String title, String author , int price){
        this.title = title;
        this.author = author;
        this.price= price;
    }
    void displayDetails(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
    public static void main(String[] args) {

        Book bk = new Book();
        Book bt = new Book("Ring", "Charles",5000);
        bk.displayDetails();
        bt.displayDetails();
    }

}
