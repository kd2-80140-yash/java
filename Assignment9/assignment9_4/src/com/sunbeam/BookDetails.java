package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Book {
    String isbn;
    double price;
    String authorname;
    int quantity;

    public Book() {
        this.isbn = "";
        this.price = 0.0;
        this.authorname = "";
        this.quantity = 0;
    }

    public Book(String isbn, double price, String authorname, int quantity) {
        this.isbn = isbn;
        this.price = price;
        this.authorname = authorname;
        this.quantity = quantity;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the isbn");
        this.isbn = sc.next();
        System.out.println("Enter the price");
        this.price = sc.nextDouble();
        System.out.println("Enter the authorname");
        this.authorname = sc.next();
        System.out.println("Enter the quantity");
        this.quantity = sc.nextInt();
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Price: " + price + ", Author: " + authorname + ", Quantity: " + quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        return isbn.equals(other.isbn);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Book b;
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add new book");
            System.out.println("2. Display all books");
            System.out.println("3. Delete a book at a given index");
            System.out.println("4. Check if a book with given ISBN is in the list");
            System.out.println("5. Delete all books");
            System.out.println("6. Display the number of books");
            System.out.println("7. Sort all books by price in descending order");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1: // add book
                    b = new Book();
                    b.accept();
                    list.add(b);
                    break;
                case 2: // display all
                    for (Book bk : list) {
                        System.out.println(bk);
                    }
                    break;
                case 3: // remove at index
                    System.out.print("Enter index at which element to be deleted: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < list.size()) {
                        list.remove(index);
                    } else {
                        System.out.println("Invalid choice");
                    }
                    break;
                case 4: // check book is present
                    System.out.print("Enter isbn to check: ");
                    String isbn = sc.next();
                    Book key = new Book();
                    key.setIsbn(isbn);
                    if (list.contains(key)) {
                        System.out.println("Book found");
                    } else {
                        System.out.println("Book not found");
                    }
                    break;
                case 5: // delete all books
                    list.clear();
                    break;
                case 6: // display no of books
                    System.out.println("Number of books: " + list.size());
                    break;
                case 7: // sort by price desc
                    list.sort(new Comparator<Book>() {
                        @Override
                        public int compare(Book b1, Book b2) {
                            return Double.compare(b2.getPrice(), b1.getPrice());
                        }
                    });
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }
}
