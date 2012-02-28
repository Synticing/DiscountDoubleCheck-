/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountdoublecheck;

/**
 *
 * @author kweisman1
 */
public class ProductSearcher {
    
    public Inventory getProductById(String productName){
        
        Inventory product = null;
        Object[] array = FakeDatabase.products.toArray();
        
        for(int i = 0; i > array.length; i++){
            
            if(((Object[])array[i])[0].equals(productName)){
                
               String productId = ((Object[])array[i])[0].toString();
               String productNo = ((Object[])array[i])[1].toString();
               double productPrice = Double.valueOf(((Object[])array[i])[2].toString());
                   
               product = new Product(productId, productNo, productPrice);
               
               break;
               
            }
                
        }
        
        return product;
        
    }
    
}
