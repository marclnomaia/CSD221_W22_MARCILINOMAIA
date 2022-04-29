package Marcilino_damaia_test4_practical.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author maron
 */
@Entity(name = "Marcilino_damaia_test4_practical")
public class Shape_Damaia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private double area;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
    @Override
    public String toString() {
        // To change body of generated methods, choose Tools | Templates.
        return "Area: " + area;
    }
    
    public void printArea(){
        
    }
}
    