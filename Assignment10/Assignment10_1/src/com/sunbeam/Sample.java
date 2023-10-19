import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Book {
    private String isbn;
    private double price;
    private String authorName;
    private int quantity;

    public Book(String isbn, double price, String authorName, int quantity) {
        this.isbn = isbn;
        this.price = price;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void incrementQuantity(int quantity) {
        this.quantity += quantity;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Price: " + price + ", Author: " + authorName + ", Quantity: " + quantity;
    }
}

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Menu:");
            System.out.println("1. Add new book");
            System.out.println("2. Display all books");
            System.out.println("3. Search a book by ISBN");
            System.out.println("4. Delete a book by index");
            System.out.println("5. Delete a book by ISBN");
            System.out.println("6. Reverse the list");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String authorName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    Book newBook = new Book(isbn, price, authorName, quantity);

                    if (books.contains(newBook)) {
                        int index = books.indexOf(newBook);
                        Book existingBook = books.get(index);
                        existingBook.incrementQuantity(quantity);
                    } else {
                        books.add(newBook);
                    }
                    break;
                case 2:
                    for (Book book : books) {
                        System.out.println(book);
                    }
                    break;
                case 3:
                    System.out.print("Enter ISBN to search: ");
                    String searchIsbn = scanner.nextLine();
                    int index = -1;
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getIsbn().equals(searchIsbn)) {
                            index = i;
                            break;
                        }
                    }
                    if (index != -1) {
                        System.out.println("Book found: " + books.get(index));
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter index to delete: ");
                    int deleteIndex = scanner.nextInt();
                    if (deleteIndex >= 0 && deleteIndex < books.size()) {
                        books.remove(deleteIndex);
                        System.out.println("Book deleted.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 5:
                    System.out.print("Enter ISBN to delete: ");
                    String deleteIsbn = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getIsbn().equals(deleteIsbn)) {
                            books.remove(i);
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("Book deleted.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 6:
                    Collections.reverse(books);
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
