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
    