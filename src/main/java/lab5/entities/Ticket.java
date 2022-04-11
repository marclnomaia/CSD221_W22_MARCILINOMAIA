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
public class Ticket implements SaleableItem, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String description;
    @Basic
    private double price;
    @Basic
    private String client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public void sellCopy() {
    }

    public Ticket(String description, double price, String client) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.client = client;
    }

    public Ticket() {
    }

}