//Author: Phani Teja Kesha
//Factory Method Design Pattern Example

package com.company;
public class FactoryMethodPattern {
    public static void main(String[] args) {
        //Interesting thing here is we are creating an object for the factory method only once and always using that method
        //to create new class objects for the parent class
        FactoryInternetPlan f = new FactoryInternetPlan();
        InternetPlan f1 = f.getPlanType("DomesticPlan");
        f1.getRate();
        System.out.println(f1.rate);
        f1.calculateBill(100);
        InternetPlan f2 = f.getPlanType("CommercialPlan");
        f2.getRate();
        f2.calculateBill(100);
    }

}

//Parent class InternetPlan
abstract class InternetPlan{
    protected double rate;
    abstract void getRate();
    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}

//Three subclasses which extend the abtract class InternetPlan
class DomesticPlan extends InternetPlan{
    void  getRate(){
        rate = 10;
    }
}

class CommercialPlan extends InternetPlan{
    void  getRate(){
        rate = 20;
    }
}

class InstitutionalPlan extends InternetPlan{
    void  getRate(){
        rate = 5;
    }
}


//Factory class which sends the required subclass object
class FactoryInternetPlan {

    public InternetPlan getPlanType(String planType){
        System.out.println(planType);
        if( planType==null){
            return null;
        }
        else if(planType.equalsIgnoreCase("DomesticPlan")){
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("CommercialPlan")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("InstitutionalPlan")){
            return new InstitutionalPlan();
        }
        return null;
    }
}

/*
Notes:
1) A factory method says that subclasses are responsible to create the instance of the class or "define an interface or abstract class
    for creating an object but let the subclasses decide which class to instantiate"
2) also called as virtual constructor
3) promotes loose coupling in the code
4) Examples are internet and different types, Phone call and its different calls, UMBC parent class subclass Masters, bachelors, arts etc
    and fees are calculated by each subclass,create an example with respect to the company
 */

