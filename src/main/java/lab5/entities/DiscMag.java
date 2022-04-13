package lab5.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import lab5.SaleableItem;

/**
 * @author maron
 */

@Entity
public class DiscMag extends Magazine implements SaleableItem {

    @Basic
    private boolean hasDisc;

    public DiscMag() {
    }

    public DiscMag(boolean hasDisc) {
        this.hasDisc = hasDisc;
    }

    public DiscMag(boolean hasDisc, int orderQty, String currIssue) {
        super(orderQty, currIssue);
        this.hasDisc = hasDisc;
    }

    public DiscMag(boolean hasDisc, int orderQty, String currIssue, String title, double price, int copies) {
        super(orderQty, currIssue, title, price, copies);
        this.hasDisc = hasDisc;
    }

    public boolean isHasDisc() {
        return hasDisc;
    }

    public void setHasDisc(boolean hasDisc) {
        this.hasDisc = hasDisc;
    }

}