package lab5.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author maron
 */

@Entity
public class Magazine extends Publication {

    @Basic
    private int orderQty;
    @Basic
    private String currIssue;

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public String getCurrIssue() {
        return currIssue;
    }

    public void setCurrIssue(String currIssue) {
        this.currIssue = currIssue;
    }

    @Override
    public void sellCopy() {
        // To change body of generated methods, choose Tools | Templates.
    }

    public Magazine(int orderQty, String currIssue, String title, double price, int copies) {
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currIssue = currIssue;
    }

    public Magazine(int orderQty, String currIssue) {
        this.orderQty = orderQty;
        this.currIssue = currIssue;
    }

    public Magazine() {
    }

}