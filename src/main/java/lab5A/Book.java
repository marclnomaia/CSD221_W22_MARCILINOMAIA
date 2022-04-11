package lab5A;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author maron
 */
@Entity
public class Book extends Publication implements Serializable {

    @Basic
    private String author;
    
    public Book(){
    
    }

    public Book (String author){
        this.author=author;
    }
    
    public Book(String author,String title,int copies, double price){
        super(title,copies,price);
        this.author=author;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @override
    public String toString(){
        return getAuthor()+" "+getTitle()+" "+getPrice();
    }
   

}