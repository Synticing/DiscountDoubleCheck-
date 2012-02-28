/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountdoublecheck;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kody Weisman
 */
public class CashRegister {
    
    private boolean isSaleStarted = false;
    private CustomerSearcher cLookup;
    private ProductSearcher pLookup;
    private DiscountSearcher dLookup;
    private Customer[] customers = new Customer[0];
    private Receipt[] receipts = new Receipt[0];
    
    public CashRegister(){
        
        cLookup = new CustomerSearcher();
        pLookup = new ProductSearcher();
        dLookup = new DiscountSearcher();
        
    }
    
     public void startNewSale(String customerNo){
         
         receipts = addReceipt(new Receipt(cLookup.getCustomerById(customerNo)));
         isSaleStarted = true;
             
     }
     
     public void addProduct(String productID, int qty){
         
         if(!isSaleStarted)
             return;
         
         Inventory product = pLookup.getProductById(productID);
         dLookup.addEligableDiscounts(product, qty);
      
         receipts[receipts.length - 1].addProduct(product, qty);
         
     }
     
     public void finalizeSale(){
         
         if(!isSaleStarted)
             return;
         
         System.out.println(receipts[receipts.length - 1].toString());
         
         isSaleStarted = false;
         
     }
     
     private Receipt[] addReceipt(Receipt newReceipt){
        
        Receipt[] temp = new Receipt[receipts.length + 1];
        temp[receipts.length] = newReceipt;
        return temp;
        
    }
    
}