/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountdoublecheck;

/**
 *
 * @author kweisman1
 */
public class DiscountDoubleCheck {
    
    public static void main(String[] args){
        
        CashRegister register = new CashRegister();
        register.startNewSale("C001");
        register.addProduct("A100", 5);
        register.addProduct("A101", 1);
        register.addProduct("A102", 10);
        register.finalizeSale();;
        
    }
    
}
