/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3B;

/**
 *
 * @author maron
 */
public class DiscMag extends Magazine {
    private boolean hasDisc;

    public DiscMag(int orderQty, String currIssue, String title, double price, int copies) {
        super(orderQty, currIssue, title, price, copies);
    }
   

    

    /**
     * @return the hasDisc
     */
    public boolean isHasDisc() {
        return hasDisc;
    }

    /**
     * @param hasDisc the hasDisc to set
     */
    public void setHasDisc(boolean hasDisc) {
        this.hasDisc = hasDisc;
    }
    
     @Override
    public String toString() {
        return "Author: "+getAuthor()+ "Title: "+getTitle()+", Price: "+getPrice()+", Copies: "+getCopies();
    }

    private String getAuthor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
