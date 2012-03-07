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
    
    public Inventory getProductById(String prodId){
        
        Inventory product = null;
        Object[] array = FakeDatabase.products.toArray();
        
        for(int i = 0; i < array.length; i++){
            
            Object[] innerArray = ((Object[])array[i]);
            String pId = (String)innerArray[0];
            
            if(pId.equalsIgnoreCase(prodId)){
                
               String productId = pId;
               String productNo = innerArray[1].toString();
               double productPrice = Double.valueOf(innerArray[2].toString());
                   
               product = new Product(productId, productNo, productPrice);
               
               break;
               
            }
                
        }
        
        return product;
        
    }
    
}
