package lab2.jpamodeler.kart.model.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author maron
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String firtsname;
    @Basic
    private String lastname;
    @Embedded
    private Address address;
    @OneToMany
    private List<ProductOrder> orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirtsname() {
        return firtsname;
    }

    public void setFirtsname(String firtsname) {
        this.firtsname = firtsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<ProductOrder> getOrders() {
        if (orders == null) {
            orders = new ArrayList<>();
        }
        return orders;
    }

    public void setOrders(List<ProductOrder> orders) {
        this.orders = orders;
    }

    public void addOrder(ProductOrder order) {
        getOrders().add(order);
    }

    public void removeOrder(ProductOrder order) {
        getOrders().remove(order);
    }

}