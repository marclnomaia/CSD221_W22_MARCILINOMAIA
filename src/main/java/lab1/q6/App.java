/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.q6;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lab1.q6.Person;

/**
 *
 * @author maron
 */
public class App {
    

private final int numPerson = 20;
    private Person[] people = new Person[numPerson];
    private Person[] delete= new Person[numPerson];
    private int currentPerson = 0;
    private int delCurrentIndex = 0;

    private Scanner input;

    public void run() throws Exception {
        people = new Person[20];
        boolean exit = false;
        String mainMenu = ""
                + "1. Add Person\n"
                + "2. List Person\n"                
                + "3. Delete Person\n"
                + "0. Exit";
        while (!exit) {
            input = new Scanner(System.in);

            System.out.println(mainMenu);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    try {
                    addPerson();
                } catch (Exception ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

                case 2:
                    listPerson();
                    break;
                
                case 3:
                    
                    System.out.println("Choose a Person to delete");
                    listPerson();
                    int choice1 = input.nextInt();
                    deletePerson(choice1);
                   
                    break;
                
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid entry try again");
            }
        }
        System.exit(0);
    }



    private void addPerson() throws Exception {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Add Person");
            System.out.println("Enter Firstname");
            String firstname= input.next();
            System.out.println("Enter Latname");
            String lastname = input.next();
            System.out.println("Enter Social Insurance Number");
            String socialInNumber = input.next();
            Person person = new Person(firstname, lastname, socialInNumber);
//            int currentPerson = 0;
            people[currentPerson] = person;
            currentPerson++;
//            throw new Exception();
        } catch (Exception e) {
            throw new Exception("Error Adding a Person");
        }

    }

    private void listPerson() {

        System.out.println("\nList all Person");
        System.out.println("-------------");

        for (int i = 0; i < people.length; i++) {

            if (people[i] == null) {
                break;
            }
            System.out.println(i+" "+ people[i]);
//      }
        }
    }

    private void deletePerson(int persondelete) throws Exception {

        try {

            System.out.println("Delete Person");

            for (int i = persondelete; i < people.length; i++) {
                people[i - 1] = people[i];

                currentPerson= currentPerson--;
            }

        } catch (Exception e) {
            throw new Exception("Error Adding a Person");
        }

    }

    
    private double getInput(double i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextDouble();
    }

    private void deletePerson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void listPerson(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
