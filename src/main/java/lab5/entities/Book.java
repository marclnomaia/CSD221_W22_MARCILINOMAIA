package lab5.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author maron
 */

@Entity
public class Book extends Publication {

    @Basic
    private String author;

    public Book(String author, String title, double price, int copies) {
        super(title, price, copies);
        this.author = author;
    }

    public Book(String author) {
        this.author = author;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void sellCopy() {
    }

    @Override
    public String toString() {
        // To change body of generated methods, choose Tools | Templates.
        return "Author: " + author + " " + super.toString();
    }

}