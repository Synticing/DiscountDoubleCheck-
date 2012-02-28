/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountdoublecheck;

/**
 *
 * @author kweisman1
 */
public class FlatDiscount implements ProductDiscount {
    
    double percentDiscount;
    
    public FlatDiscount(double percentDiscount){
        if(percentDiscount > MAX_DISCOUNT_PERCENT)
            this.percentDiscount = MAX_DISCOUNT_PERCENT;
        else if(percentDiscount < MIN_DISCOUNT_PERCENT)
            this.percentDiscount = MIN_DISCOUNT_PERCENT;
        else
            this.percentDiscount = percentDiscount;
    }
    
    public double getDiscountAmount(Inventory product){
        return product.getRetailPrice() * percentDiscount;
    }
    
    public boolean isEligable(Inventory product, int qty){
        return true;
    }
    
}
