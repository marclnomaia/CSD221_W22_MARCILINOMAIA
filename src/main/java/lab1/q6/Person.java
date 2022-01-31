/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.q6;

/**
 *
 * @author maron
 */

public class Person extends Object implements java.io.Serializable {
    private String firstname;// instance variable.  every object has its own copy
    private String lastname;
    private String socialInNumber;
    
   

    

    public Person(String firstname, String lastname, String socialInNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.socialInNumber =socialInNumber;

    }

   
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSocialInNumber() {
        return socialInNumber;
    }

    public void setSocialInNumber(String socialInNumber) {
        this.socialInNumber = socialInNumber;
    }

    
    @Override
    public String toString(){
        String s="";
        s+= "Firstname : " + getFirstname() +
            "\nLastname : " + getLastname() +
            "\nSocialInNumber : " + getSocialInNumber() +"\n";
         socialInNumber = getSocialInNumber();
        if(socialInNumber!=null)
            s+=socialInNumber.toString();
        return s;
            
    }

    

    

    
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   