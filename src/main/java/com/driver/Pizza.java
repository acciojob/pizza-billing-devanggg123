package com.driver;

public class Pizza {

    private int price;
    private int cp;
    private int tp;
    private int tap;
    private Boolean isVeg;
    private String bill;
    private boolean ec;
    private boolean et;
    private boolean cb;

    private boolean bg;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg) {
            this.price = 300;
           this.cp=80;
           this.tp=70;
        }
        else {
            this.price = 400;
            this.cp=80;
            this.tp=120;

        }
        this.ec=false;
        this.et=false;
        this.cb=false;

        this.bill="Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(ec==false) {
            ec=true;
            this.price+=this.cp;
        }



    }

    public void addExtraToppings(){
        // your code goes here

       if(et==false){
           this.price+=this.tp;
           et=true;
       }

    }

    public void addTakeaway(){
        // your code goes here

        if(this.cb==false) {
            this.cb=true;
            this.price += 20;
        }


    }

    public String getBill(){
        // your code goes here

        if(this.bg==false) {


            if (this.ec) {
                this.bill += "Extra Cheese Added: 80" + "\n";

            }
            if (this.et == true && this.isVeg == true) {
                this.bill += "Extra Toppings Added: 70" + "\n";

            } else if (this.et == true && this.isVeg == false) {
                this.bill += "Extra Toppings Added: 120" + "\n";

            }

            if (cb) {
                this.bill += "Paperbag Added: 20" + "\n";

            }
            this.bill += "Total Price: " + this.price;
            this.bg=true;
        }
        return this.bill;
    }
}
