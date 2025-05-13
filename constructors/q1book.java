//import java.util.Scanner;
 class q1book{
    String title;
    String author;
    int price;

    public q1book(){
        title = "Unknown";
        author = "Unknown";
        price = 0;
        
    }
    public q1book(String title , String author, int price){
      //  Scanner sc = new Scanner(System.in);
        this.title = title;
        this.author = author;
        this.price = price;

    }
    public void display(){
        System.out.println(title+" "+author+" "+price);
    }
    public static void main(String[]args){
        q1book book1 = new q1book();
        q1book book2 = new q1book("cruz", "pixar", 100);

        book1.display();
        book2.display();
    }


    
}