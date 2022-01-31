package lecture2.carModel.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;

/**
 * @author maron
 */
@Embeddable
public class Behaviors_Person {

    @Basic
    private String transaction;
    @Basic
    private String walk;
    @Basic
    private String talk;
    @ManyToMany
    private List<Person> persons;

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public String getTalk() {
        return talk;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }

    public List<Person> getPersons() {
        if (persons == null) {
            persons = new ArrayList<>();
        }
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public void addPerson(Person person) {
        getPersons().add(person);
    }

    public void removePerson(Person person) {
        getPersons().remove(person);
    }

}