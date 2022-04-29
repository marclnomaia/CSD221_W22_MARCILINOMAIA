package Marcilino_damaia_test4_practical.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author maron
 */
@Entity
public class Triangle_Damaia extends Shape_Damaia {

    @Basic
    private double base;
    @Basic
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        // To change body of generated methods, choose Tools | Templates.
        return "Base: " + base+ "Height"+height;
    }
    @Override
    public void printArea(){
        
    }

}