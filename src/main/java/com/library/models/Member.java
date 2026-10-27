package com.library.models;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private String contact;
    private List<Book> issuedBooks;

    public Member(String memberId, String name, String contact) {
        this.memberId = memberId;
        this.name = name;
        this.contact = contact;
        this.issuedBooks = new ArrayList<>();
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public String getContact() { return contact; }
    public List<Book> getIssuedBooks() { return issuedBooks; }
    
    public void issueBook(Book book) {
        issuedBooks.add(book);
    }
    
    public void returnBook(Book book) {
        issuedBooks.remove(book);
    }

    @Override
    public String toString() {
        return memberId + " | " + name + " | " + contact + " | Issued: " + issuedBooks.size();
    }
}
