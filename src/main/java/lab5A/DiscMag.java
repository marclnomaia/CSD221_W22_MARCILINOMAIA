package lab5A;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author maron
 */
@Entity
public class DiscMag extends Magazine {

    @Basic
    private String hasDisc;

    DiscMag(int orderQty, String currIssue, String title, double price, int copies) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getHasDisc() {
        return hasDisc;
    }

    public void setHasDisc(String hasDisc) {
        this.hasDisc = hasDisc;
    }

}