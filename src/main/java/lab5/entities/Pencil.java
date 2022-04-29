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
public class Pencil implements SaleableItem, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String brand;
    @Basic
    private int quantity;
    @Basic
    private double price;
    
   

    public Pencil(String brand, int quantity, double price) {
        this.id = id;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    public Pencil() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void sellCopy() {
    }
    @Override
    public String toString() {
        // To change body of generated methods, choose Tools | Templates.
        return "Pencil: " + brand + " " + quantity+" "+ price;

}
    }