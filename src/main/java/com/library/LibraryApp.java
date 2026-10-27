package com.library;

import com.library.models.Book;
import com.library.models.Member;
import com.library.services.LibraryService;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();
        
        // Add books
        library.addBook(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("B002", "1984", "George Orwell"));
        library.addBook(new Book("B003", "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("B004", "Pride and Prejudice", "Jane Austen"));
        
        // Add members
        library.addMember(new Member("M001", "John Doe", "123-456-7890"));
        library.addMember(new Member("M002", "Jane Smith", "098-765-4321"));
        library.addMember(new Member("M003", "Bob Johnson", "555-123-4567"));
        
        // Display initial state
        library.displayAllBooks();
        library.displayAllMembers();
        library.displayAvailableBooks();
        
        // Issue books
        System.out.println("\n=== Issuing Books ===");
        library.issueBook("B001", "M001");
        library.issueBook("B002", "M002");
        library.issueBook("B003", "M001");
        
        // Try to issue unavailable book
        library.issueBook("B001", "M003");
        
        // Display after issuing
        library.displayAllBooks();
        library.displayAvailableBooks();
        library.displayAllMembers();
        
        // Return books
        System.out.println("\n=== Returning Books ===");
        library.returnBook("B001", "M001");
        library.returnBook("B002", "M002");
        
        // Display after returning
        library.displayAllBooks();
        library.displayAvailableBooks();
        library.displayAllMembers();
    }
}
