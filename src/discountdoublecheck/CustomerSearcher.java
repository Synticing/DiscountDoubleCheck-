/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountdoublecheck;

/**
 *
 * @author kweisman1
 */
public class CustomerSearcher {
    
    public Customer getCustomerById(String customerId){
        
        Customer customer = null;
        Object[] array = FakeDatabase.customers.toArray();
        
        for(int i = 0; i < array.length; i++){
            
            if(((Customer)array[i]).getCustomerNo().equalsIgnoreCase(customerId)){
                
                customer = ((Customer)array[i]);
                break;
                
            }
            
        }
        
        return customer;
        
    }
    
}
