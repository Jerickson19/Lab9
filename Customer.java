/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author jerickson19
 */
public class Customer extends Person {
    private String cNumber;
    private boolean mlist;
    
    public Customer(){}
    
    public Customer (String n, boolean m){
        this.cNumber = n;
        this.mlist = m;
    }
    
    public Customer (String n, String a, String t, String cN, boolean e){
        this.name = n;
        this.address = a;
        this.telephone = t;
        this.cNumber = cN;
        this.mlist = e;
    }
    
    public void setCNumber(String n){this.cNumber = n;}
    public void setMList(boolean n){this.mlist = n;}
    
    public String getCNumber(){return cNumber;}
    public boolean getMList(){return mlist;}
}
