

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
    void display(){
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
        Literature literature = new Literature("General Literature");
        literature.display();
        Literature.category();

        Author author = new Author("Hamlet", "William Shakespeare");
        author.display();
        Author.category();

        Shakespeare shakespeare = new Shakespeare("Romeo and Juliet");
        shakespeare.display();

        Poet poet = new Poet("The Raven");
        poet.display();

        English english = new English();
        english.rules();
    }
}