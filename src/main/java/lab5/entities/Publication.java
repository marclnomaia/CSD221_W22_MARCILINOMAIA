package lab5.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lab5.SaleableItem;

/**
 * @author maron
 */

@Entity
public class Publication implements SaleableItem, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String title;
    @Basic
    private double price;
    @Basic
    private int copies;

    public Long getId() {
        return id;
    }

    public Publication() {
    }

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }
    
    

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public void sellCopy() {
    }

    @Override
    public String toString() {
        return "title: "+title+" price: "+price+" copies: "+copies; //To change body of generated methods, choose Tools | Templates.
    }

}