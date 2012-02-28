package discountdoublecheck;


import discountdoublecheck.Inventory;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kweisman1
 */
public class DateDiscount implements ProductDiscount {
    
    private java.util.Date startDate;
    private java.util.Date endDate;
    private double discountAmount;
    
    public DateDiscount(java.util.Date startDate, java.util.Date endDate, double discountAmount){
        
        this.startDate = startDate;
        this.endDate = endDate;
        this.discountAmount = discountAmount;

    }
    
    public double getDiscountAmount(Inventory product){
        return discountAmount;
    }
    
    public boolean isEligable(Inventory product, int qty){
        
        java.util.Date today = new java.util.Date();
        
        if(today.after(startDate) && today.before(endDate))
            return true;
        else
            return false;
        
    }
    
}
