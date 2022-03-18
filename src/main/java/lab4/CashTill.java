/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author maron
 */
public class CashTill {

    private double runningTotal;
    public void sellItem(SaleableItem item){
        runningTotal+=item.getPrice();
        item.sellCopy();
        System.out.println(item + " for:" +item.getPrice());
        
    }

    void showTotal() {
        
    }
    
    

    
    
            

   
}
