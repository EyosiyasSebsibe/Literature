class Literature {
    protected String title;

    Literature(String title) {
        this.title = title;
        System.out.println("");
    }

    void display(){
        System.out.println("Title: " + title);  
    }

    static void category(){
        System.out.println("General Literature");
    }
}



class Author extends Literature {
    protected String name;

    Author(String title, String name) {
        super(title);
        this.name = name;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Author: " + name);
    }

    static void category() {
        System.out.println("Author's Literature");
    }
}
    