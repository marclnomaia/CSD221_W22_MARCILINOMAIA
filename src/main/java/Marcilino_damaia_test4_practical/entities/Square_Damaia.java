package Marcilino_damaia_test4_practical.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author maron
 */
@Entity
public class Square_Damaia extends Shape_Damaia {

    @Basic
    private Double theLength;
    @Basic
    private double width;

    public Double getTheLength() {
        return theLength;
    }

    public void setTheLength(Double theLength) {
        this.theLength = theLength;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
     @Override
    public String toString() {
        // To change body of generated methods, choose Tools | Templates.
        return "Length: " + theLength+ "Width"+width;
    }
    @Override
    public void printArea(){
        
    }

}