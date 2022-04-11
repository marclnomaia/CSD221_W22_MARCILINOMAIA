package lab5A;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author maron
 */
@Entity
public class Magazine extends Publication {

    @Basic
    private String orderQty;
    @Basic
    private String currIssue;

    Magazine(int orderQty, String currIssue, String title, double price, int copies) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(String orderQty) {
        this.orderQty = orderQty;
    }

    public String getCurrIssue() {
        return currIssue;
    }

    public void setCurrIssue(String currIssue) {
        this.currIssue = currIssue;
    }

}