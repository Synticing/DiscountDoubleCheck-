/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountdoublecheck;

/**
 *
 * @author Kody Weisman
 */
public interface Inventory {
    
    String getProductId();
    
    String getName();
    
    double getRetailPrice();
    
    void applyDiscount(ProductDiscount discount);
    
    double getDiscountAmount();
    
}
