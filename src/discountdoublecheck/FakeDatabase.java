/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountdoublecheck;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author kweisman1
 */
public class FakeDatabase {
    
    private static Random generator = new Random();
    public static ArrayList products;
    public static ArrayList discounts;
        
    static{
        
        Calendar cal = Calendar.getInstance();
        double perc = generator.nextDouble() / 4;
        int subDays = generator.nextInt() * -1;
        int addDays = generator.nextInt();
        cal.add(Calendar.DAY_OF_MONTH, subDays);
        java.util.Date startDate = cal.getTime();
        cal.add(Calendar.DAY_OF_MONTH, addDays);
        java.util.Date endDate = cal.getTime();
        int discountAmount = generator.nextInt(15);
        
        products = new ArrayList();
        products.add(new Object[]{"A100", "Hat", 19.99D});
        products.add(new Object[]{"A101", "Gloves", 14.99D});
        products.add(new Object[]{"A102", "Boots", 39.99D});
        products.add(new Object[]{"A103", "Coat", 139.99D});
        products.add(new Object[]{"A104", "Scarf", 9.99D});
        
        discounts = new ArrayList();
        discounts.add(new FlatDiscount(perc));
        discounts.add(new DateDiscount(startDate, endDate, discountAmount));
        discounts.add(new QuantityDiscount(10, perc * 2));

    }
    
}
