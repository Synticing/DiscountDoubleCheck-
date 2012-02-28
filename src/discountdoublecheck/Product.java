/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountdoublecheck;

/**
 *
 * @author kweisman1
 */
public class Product implements Inventory {

    private String productId;
    private String productName;
    private double productPrice;
    private ProductDiscount[] discounts;
    
    public Product (String productId, String productName, double productPrice){
        
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        
    }
    
    public Product (String productId, String productName, double productPrice, ProductDiscount discount){
        
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        applyDiscount(discount);
        
    }
    
    public String getProductId(){
        return productId;
    }
    
    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getRetailPrice() {
        return productPrice;
    }

    @Override
    public void applyDiscount(ProductDiscount discount) {
        
        ProductDiscount[] temp = new ProductDiscount[discounts.length + 1];
        temp[discounts.length] = discount;
        discounts = temp;
        
    }

    @Override
    public double getDiscountAmount() {
        
        double discountAmount = 0;
        
        for(int i = 0; i < discounts.length; i++){
            discountAmount += discounts[i].getDiscountAmount(this);
        }
        
        return Math.min(productPrice, discountAmount);
        
    }
    
    
    
}
