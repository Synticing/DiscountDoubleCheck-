/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountdoublecheck;

/**
 *
 * @author kweisman1
 */
public class DiscountSearcher {
    
    public void addEligableDiscounts(Inventory product, int qty){
        
        Object[] array = FakeDatabase.discounts.toArray();
        
        for(int i = 0; i < array.length; i++){
            
            if(((ProductDiscount)array[i]).isEligable(product, qty))
                product.applyDiscount(((ProductDiscount)array[i]));
            
        }
        
    }
    
}
