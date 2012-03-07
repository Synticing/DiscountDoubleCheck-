/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountdoublecheck;

/**
 *
 * @author Kody Weisman
 */
public class Receipt {
    
    public static final double TAXRATE = 0.055; 
    
    private Customer customer;
    private LineItem[] lines = new LineItem[0];
    
    public Receipt(Customer customer){
        this.customer = customer;
    }
    
    public void addProduct(Inventory product, int qty){
        
        addLineItem(new LineItem(product, qty));
        
    }
    
    private void addLineItem(LineItem newLine){
        
        LineItem[] temp = new LineItem[lines.length + 1];
        System.arraycopy(lines, 0, temp, 0, lines.length);
        temp[lines.length] = newLine;
        lines = temp;
        
    }
    
    public String toString(){
        
        double finalSubTotal = 0;
        
        StringBuilder sbOutput = new StringBuilder();
        
        sbOutput.append(customer.getCustomerNo());
        sbOutput.append("\r\n");
        sbOutput.append(customer.getCustomerName());
        sbOutput.append("\r\n\r\n");
        sbOutput.append("Product\tDescription\tQuantity\tPrice\tDiscount\tSubtotal\r\n");
        sbOutput.append("-------\t-----------\t--------\t-----\t--------\t--------\r\n");
        
        for(int i = 0; i < lines.length; i++){
            
           sbOutput.append(lines[i].toString());
           sbOutput.append("\r\n");
           finalSubTotal += lines[i].getSubTotal();
            
        }
        
        sbOutput.append("\r\n");
        sbOutput.append("\t\t\t\tSubtotal: ");
        sbOutput.append(String.valueOf(finalSubTotal));
        sbOutput.append("\r\n");
        sbOutput.append("\t\t\t\tTax Rate: ");
        sbOutput.append(String.valueOf(TAXRATE));
        sbOutput.append("\r\n");
        sbOutput.append("\t\t\t\tTotal: ");
        sbOutput.append(String.valueOf(finalSubTotal + finalSubTotal * TAXRATE));
        sbOutput.append("\r\n\r\n");
        sbOutput.append("Thank you for shopping at CheapoMart!");
        
        return sbOutput.toString();
        
    }
    
}
