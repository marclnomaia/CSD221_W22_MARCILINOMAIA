/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marcilino_damaia_test4_practical;



import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Marcilino_damaia_test4_practical.Controllers.Shape_DamaiaJpaController;
import Marcilino_damaia_test4_practical.Controllers.Square_DamaiaJpaController;
import Marcilino_damaia_test4_practical.Controllers.Triangle_DamaiaJpaController;
import Marcilino_damaia_test4_practical.entities.Shape_Damaia;
import Marcilino_damaia_test4_practical.entities.Triangle_Damaia;
import Marcilino_damaia_test4_practical.entities.Square_Damaia;





/**
 *
 * @author maron
 */
public class App {

    private Scanner input;
    private EntityManagerFactory emf;
    private Shape_DamaiaJpaController sh;
    private Triangle_DamaiaJpaController tr;
    private Square_DamaiaJpaController sq;
    private Object ex;

    void run() {
        emf = Persistence.createEntityManagerFactory("Marcilino_damaia_test4_practical");
        sh = new Shape_DamaiaJpaController(emf);
        tr = new Triangle_DamaiaJpaController(emf);
        sq = new Square_DamaiaJpaController(emf);
        input = new Scanner(System.in);
        boolean exit = false;
        String mainMenu = ""
                + "1. Add Shape \n"
                + "2. List Shape \n"
                + "3. Edit Shape \n"
                + "4. Delete Shape \n"
                + "5. Add Triangle \n"
                + "6. List Triangle \n"
                + "7. Edit Triangle \n"
                + "8. Delete Triangle \n"
                + "9. Add Square \n"
                + "10. List Square \n"
                + "11. Edit Square \n"
                + "12. Delete Square \n"
                + "0. Exit";
        while (!exit) {
//            input = new Scanner(System.in);
            System.out.println(mainMenu);
            int choice = 0;// = input.nextInt();
            choice = (int) getInput(choice);
            switch (choice) {
                case 1 -> addShape();
                case 2 -> listShape();

                case 3 -> editShape();

                case 4 -> deleteShape();
                    
                case 5 -> addTriangle ();
                case 6 -> listTriangle ();

                case 7 -> editTriangle ();

                case 8 -> deleteTriangle ();
                case 9 -> addSquare();
                case 10 -> listSquare();

                case 11 -> editSquare();

                case 12 -> deleteSquare();
                     case 0 -> exit = true;
                default -> System.out.println("Invalid entry try again");
            }
        }
        System.exit(0);
    }
 
 
    private String getInput(String s) {
        String ss = input.nextLine();
        if (ss.trim().isEmpty()) {
            return s;
        }
        Scanner in2 = new Scanner(ss);
        return in2.nextLine();
    }

    private int getInput(int i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextInt();
    }

    private double getInput(double i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextDouble();
    }
     private long getInput(long i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextLong();
    }
    private void addShape() {
        Shape_Damaia sp = new Shape_Damaia() ;
        System.out.println("Enter Area:");
        sp.setArea(getInput(sp.getArea()));
        
        sh.create(sp);
    }
    
    private void addTriangle() {
        Triangle_Damaia  t = new Triangle_Damaia ();
        System.out.println("Enter Base:");
        tr.setBase(getInput(t.getBase()));

        System.out.println("Enter Height");
        tr.setHeight(getInput(t.getHeight()));
        
        tr.create(t);

    }
    private void addSquare() {
        Square_Damaia  q = new Square_Damaia ();
        System.out.println("Enter Length:");
        sq.setTheLength(getInput(q.getTheLength()));

        System.out.println("Enter Width");
        sq.setWidth(getInput(q.getWidth()));
        
        sq.create(q);

    
    }
    private void listShape() {
        List<Shape_Damaia> shapes = sh.findShape_DamaiaEntities();
        int index=0;
        for(Shape_Damaia b: shapes){
            System.out.println( (++index) + ". "+sh);
        }
        }
        private void listTriangle() {
        List<Triangle_Damaia> triangle = tr.findTriangle_DamaiaEntities();
        int index=0;
        for(Triangle_Damaia t: triangle){
            System.out.println( (++index) + ". "+t);
        }
        }
        private void listSquare() {
        List<Square_Damaia> squares = sq.findSquare_DamaiaEntities();
        int index=0;
        for(Square_Damaia q: squares){
            System.out.println( (++index) + ". "+q);
        }
        }
        
        private void editShape() {
        listShape();
        System.out.println("Which Shape would you like to edit?");
        int choice=getInput(0);
        if(choice==0) return;
        Shape_Damaia sp=sh.findShape_DamaiaEntities().get(choice-1);
        System.out.println("Area ("+sp.getArea()+"):");
        sp.setArea(getInput(sp.getArea()));
         try {
            sh.edit(sp);
        } catch (Exception ex) {
            System.out.println("Problem editing Shape...");
            Logger.getLogger(Marcilino_damaia_test4_practical.App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private void editTriangle() {
        listTriangle();
        System.out.println("Which Triangle would you like to edit?");
        int choice=getInput(0);
        if(choice==0) return;
        Triangle_Damaia t=tr.findTriangle_DamaiaEntities().get(choice-1);
        System.out.println("Base ("+t.getBase()+"):");
        t.setBase(getInput(t.getBase()));
        System.out.println("Height ("+t.getHeight()+"):");
        t.setHeight(getInput(t.getHeight()));
        
        
         try {
            tr.edit(t);
        } catch (Exception ex) {
            System.out.println("Problem editing Triangle...");
            Logger.getLogger(Marcilino_damaia_test4_practical.App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         private void editSquare() {
        listSquare();
        System.out.println("Which Triangle would you like to edit?");
        int choice=getInput(0);
        if(choice==0) return;
        Square_Damaia q=sq.findSquare_DamaiaEntities().get(choice-1);
        System.out.println("Length ("+q.getTheLength()+"):");
        q.setTheLength(getInput(q.getTheLength()));
        System.out.println("Width ("+q.getWidth()+"):");
        q.setWidth(getInput(q.getWidth()));
        
        
         try {
            sq.edit(q);
        } catch (Exception ex) {
            System.out.println("Problem editing Square...");
            Logger.getLogger(Marcilino_damaia_test4_practical.App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private void deleteShape() {
        listShape();
        System.out.println("Which Shape would you like to delete?");
        int choice=getInput(0);
        if(choice==0) return;
        Shape_Damaia sp=sh.findShape_DamaiaEntities().get(choice-1);
         {
            System.out.println("Problem deleting book...");
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private void deleteTriangle() {
        listTriangle();
        System.out.println("Which Triangle would you like to delete?");
        int choice=getInput(0);
        if(choice==0) return;
        Triangle_Damaia t=tr.findTriangle_DamaiaEntities().get(choice-1);
         {
            System.out.println("Problem deletingTriangle...");
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private void deleteSquare() {
        listSquare();
        System.out.println("Which Square would you like to delete?");
        int choice=getInput(0);
        if(choice==0) return;
        Shape_Damaia q=sq.findSquare_DamaiaEntities().get(choice-1);
         {
            System.out.println("Problem deleting Square...");
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    

    


   