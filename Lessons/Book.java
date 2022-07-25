package Lessons;

public class Book {

    private String owner;

    public Book(String ownerName) {
        this.owner = ownerName;
    }

    public Book() {
        this.owner = "John Dou";
    }

    public void readBook() {
        System.out.println("I'm " + this.owner + " book");
    }

}
