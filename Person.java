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
public class Person {
    protected String name, address, telephone;
    
    public Person (){}
    public Person (String name, String address){
        this.name = name;
        this.address = address;
    }
    public Person (String name, String address, String telephone){
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }
    
    public void setName(String n){this.name = n;}
    public void setAddress(String n){this.address = n;}
    public void setTelephone(String n){this.telephone = n;}
    
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getTelephone(){return telephone;}
}
