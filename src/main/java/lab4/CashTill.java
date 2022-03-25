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
    CashTill(){
        runningTotal=0;
    }
    
    public void sellItem(SaleableItem item){
        runningTotal=(runningTotal + item.getPrice());
        item.sellCopy();
        System.out.println("Sold" +item+"@"+item.getPrice()+"\nSubtotal="+runningTotal);
        
    }

      public void showTotal() {
        System.out.println("GRAND TOTAL:"+runningTotal);
    }
}
    
    

    
    
            

   

