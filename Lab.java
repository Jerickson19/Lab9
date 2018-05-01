/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;
import java.util.Scanner;
/**
 *
 * @author jerickson19
 */
public class Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, address, telephone, cNum, list;
        boolean mList;
        double total;
        
        Customer One = new Customer("Bob Man","1829 Something Ave. WI, 32482",
                "556-454-1548","S16", false);
        if(One.getMList()){
            list = "On the Mailing List";
        }
        else {
            list = "Not On the Mailing List";
        }
        
        System.out.println(One.getName() + " lives at " + One.getAddress() +
                "\nTel : " + One.getTelephone() + "\nCustomer Number : "
                + One.getCNumber() + "\n" + list);
        
       PreferredCustomer ACC = new PreferredCustomer();
       ACC.SpendMoney(500.00);
       ACC.WhatDiscount();
       System.out.println(One.getCNumber() + " spent $" + ACC.getAmount() + "\n"
               + "Discount : " + ACC.getDiscount() + "%\nTotal : $" 
               + ((ACC.getAmount() * ACC.getDiscount()) + ACC.getAmount()));
      
    }
    
}
