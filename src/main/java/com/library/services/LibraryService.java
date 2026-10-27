package com.library.services;

import com.library.models.Book;
import com.library.models.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryService {
    private Map<String, Book> books;
    private Map<String, Member> members;
    
    public LibraryService() {
        books = new HashMap<>();
        members = new HashMap<>();
    }
    
    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }
    
    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }
    
    public boolean issueBook(String bookId, String memberId) {
        Book book = books.get(bookId);
        Member member = members.get(memberId);
        
        if (book == null || member == null) {
            System.out.println("Book or Member not found!");
            return false;
        }
        
        if (!book.isAvailable()) {
            System.out.println("Book is already issued!");
            return false;
        }
        
        book.setAvailable(false);
        member.issueBook(book);
        System.out.println("Book issued successfully to " + member.getName());
        return true;
    }
    
    public boolean returnBook(String bookId, String memberId) {
        Book book = books.get(bookId);
        Member member = members.get(memberId);
        
        if (book == null || member == null) {
            System.out.println("Book or Member not found!");
            return false;
        }
        
        if (book.isAvailable()) {
            System.out.println("This book was not issued!");
            return false;
        }
        
        book.setAvailable(true);
        member.returnBook(book);
        System.out.println("Book returned successfully by " + member.getName());
        return true;
    }
    
    public void displayAllBooks() {
        System.out.println("\n=== All Books ===");
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }
    
    public void displayAvailableBooks() {
        System.out.println("\n=== Available Books ===");
        boolean found = false;
        for (Book book : books.values()) {
            if (book.isAvailable()) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) System.out.println("No books available.");
    }
    
    public void displayAllMembers() {
        System.out.println("\n=== All Members ===");
        if (members.isEmpty()) {
            System.out.println("No members registered.");
            return;
        }
        for (Member member : members.values()) {
            System.out.println(member);
        }
    }
}
