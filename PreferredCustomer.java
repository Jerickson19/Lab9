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
public class PreferredCustomer extends Customer{
    private double atm, discount;
    
    public PreferredCustomer(){}
    
    public PreferredCustomer(double spent){
        this.atm += spent;
    }
    
    public void SpendMoney(double spent){
        this.atm += spent;
    }
    
    public void setAmount (double atm){this.atm = atm;}
    public void setDiscount (double dis){this.discount = dis;}
    
    public double getAmount () {return this.atm;}
    public double getDiscount () {return this.discount;}
    
    public void WhatDiscount(){
        if(this.atm >= 2000){
            this.discount = .10;
        }
        else if(this.atm == 1500){
            this.discount = .07;
        }
        else if(this.atm == 1000){
            this.discount = .06;
        }
        else if(this.atm == 500){
            this.discount = .05;
        }
        else{
            this.discount = 0;
        }
    }
}
