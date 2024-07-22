import java.util.*;
//import java.util.Objects;
 class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o == null || getClass() != o.getClass()) return false;
    //     Book book = (Book) o;
    //     return id == book.id;
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(id);
    // }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}


 class Main {
    public static void main(String[] args) {
        Set<Book>bookSet=new HashSet<>();
        bookSet.add(new Book(1, "Book One", "Author A", 10));
        bookSet.add(new Book(2, "Book Two", "Author B", 5));
        bookSet.add(new Book(3, "Book Three", "Author C", 15));

        // Display all books
        System.out.println("Books in the set:");
        for (Book book : bookSet) {
            System.out.println(book);  
        }

        // Check if a book exists
        Book bookToFind = new Book(2, "Book Two", "Author B", 5);
        if (bookSet.contains(bookToFind)) {
            System.out.println("\nBook found: " + bookToFind);
        } else {
            System.out.println("\nBook not found: " + bookToFind);
        }

        // Remove a book
        bookSet.remove(bookToFind);
        System.out.println("\nBooks in the set after removal:");
        for (Book book : bookSet) {
            System.out.println(book);
        }

        // Update the quantity of a book
        //Book bookToUpdate = new Book(1, "Book One", "Author A", 10);
        // if (bookSet.contains(bookToUpdate)) {
        //     for (Book book : bookSet) {
        //         if (book.equals(bookToUpdate)) {
        //             book.setQuantity(20);
        //             break;
        //         }
        //     }
        // }

        // Display all books after update
        System.out.println("\nBooks in the set after updating quantity:");
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}
