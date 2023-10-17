package com.sunbeam.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("12345", "Widget", 5, 10.99);
        Invoice invoice2 = new Invoice("67890", "Gadget", -3, -5.99);
        displayInvoice(invoice1);
        displayInvoice(invoice2);
    }

    public static void displayInvoice(Invoice invoice) {
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: Rs." + invoice.getPricePerItem());
        System.out.println("Invoice Amount: Rs." + invoice.getInvoiceAmount());
        System.out.println();
    }
}

