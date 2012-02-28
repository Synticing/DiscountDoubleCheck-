/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountdoublecheck;

/**
 *
 * @author kweisman1
 */
public class LineItem {
    
    private Inventory product;
    private int qty;
    private double subTotal;
    
    public LineItem(Inventory product, int qty){
        
        this.product = product;
        this.qty = qty;
        this.subTotal = qty * (product.getRetailPrice() - product.getDiscountAmount());
        
    }
    
    public double getSubTotal(){
        return subTotal;
    }
    
    public String toString(){
        
        return product.getProductId() + "\t" + product.getName() + "\t" +
                String.valueOf(qty) + String.valueOf(product.getRetailPrice()) +
                "\t" + String.valueOf(product.getDiscountAmount()) + "\t" + 
                String.valueOf(subTotal);
    }
    
}
