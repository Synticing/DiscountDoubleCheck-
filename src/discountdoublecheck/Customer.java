/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountdoublecheck;

/**
 *
 * @author kweisman1
 */
public class Customer {
    
    private String customerNo;
    private String fName;
    private String lName;
    
    public Customer(String customerNo, String fName, String lName){
        this.fName = fName;
        this.lName = lName;
        this.customerNo = customerNo;
    }
    
    public String getCustomerNo(){
        return customerNo;
    }
    
    public String getCustomerName(){
        
        StringBuilder sbName = new StringBuilder();
        sbName.append(lName);
        sbName.append(", ");
        sbName.append(fName);
        
        return sbName.toString();
        
    }
    
}
