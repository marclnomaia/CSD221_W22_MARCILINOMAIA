package lab5A;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author maron
 */
@Entity
public class Publication {

    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String title;
    @Basic
    private String price;
    @Basic
    private String copies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCopies() {
        return copies;
    }

    public void setCopies(String copies) {
        this.copies = copies;
    }

}