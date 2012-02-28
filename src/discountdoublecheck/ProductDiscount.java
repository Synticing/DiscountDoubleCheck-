/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountdoublecheck;

/**
 *
 * @author kweisman1
 */
public interface ProductDiscount {
    
    double MAX_DISCOUNT_PERCENT = 1;
    double MIN_DISCOUNT_PERCENT = 0;
    double MIN_DISCOUNT_PRICE = 0;
    
    double getDiscountAmount(Inventory product);
    
    boolean isEligable(Inventory product, int qty);
    
}
