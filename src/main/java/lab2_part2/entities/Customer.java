package lab2_part2.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author maron
 */

@Entity
public class Customer extends Person {

    @Basic
    private int credit_card_number;
    @Basic
    private int cust_id;

    public int getCredit_card_number() {
        return credit_card_number;
    }

    public void setCredit_card_number(int credit_card_number) {
        this.credit_card_number = credit_card_number;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

}