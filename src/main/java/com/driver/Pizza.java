package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean ec=false;
    private boolean et=false;
    private boolean cb=false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg) {
            this.price = 300;

        }
        else {
            this.price = 400;

        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.ec=true;

        this.price+=80;

    }

    public void addExtraToppings(){
        // your code goes here
        this.et=true;
        if(this.isVeg) {

            this.price += 70;
        }
        else {
            this.price += 120;

        }
    }

    public void addTakeaway(){
        // your code goes here
        this.cb=true;
        this.price+=20;

    }

    public String getBill(){
        // your code goes here
        if(isVeg)
            this.bill="Base Price Of The Pizza: 300"+"\n";
        else this.bill="Base Price Of The Pizza: 400"+"\n";

        if(this.ec)
            this.bill+="Extra Cheese Added: 80"+"\n";
        if(this.et==true&&this.isVeg==true)
            this.bill+="Extra Toppings Added: 70"+"\n";
        else if(this.et==true&&this.isVeg==false)
            this.bill+="Extra Toppings Added: 120"+"\n";

        if(cb)
            this.bill+="Paperbag Added: 20"+"\n";
        this.bill+="Total Price: "+this.price;
        return this.bill;
    }
}
