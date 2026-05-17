

import java.util.ArrayList;
import java.util.Scanner;


abstract class Literature {

    private String title;

    public Literature(String title) {
        this.title = title;
    }

    public void display(){
        System.out.println("Title: " + title);  
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}



class Author extends Literature {
    protected String name;

   public Author(String title, String name) {
        super(title);
        this.name = name;
    }

    @Override
   public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + name);
    }
}



class Shakespeare extends Author {

   public Shakespeare(String title){
        super(title, "William Shakespeare");
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Category: Shakespearean Literature");
    }
}
    




class Poet extends Literature {
   public Poet(String title) {
    super(title);
   }

    @Override
    public void display(){
        System.out.println("Poem title: " + getTitle());
    }
}


final class English{
    final void rules(){
        System.out.println("Grammer rules are unchangeable");
    }
}




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Literature> library = new ArrayList<>();

        try{
            System.out.print("Enter a work by shakespeare: ");
            String play = sc.nextLine();

            System.out.print("Enter poem title: ");
            String poem = sc.nextLine();

          
            Literature l1 = new Shakespeare(play);
            Literature l2 = new Poet(poem);

            library.add(l1);
            library.add(l2);

            System.out.println("\n--- Literature Collection ---");

            for (Literature item : library) {

                item.display();
                System.out.println();
            }

       
            English rules = new English();
            rules.rules();

        } catch (Exception e) {

            System.out.println("An error occurred!");
        }

        sc.close();
    }
}