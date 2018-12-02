package com.company;

public class DependencyInversion {
    public static void main(String[] args) {
        BankInterest i = new PNC();
        //In the above case we are directly dependent on the PNC class
        //by dependency inversion princple we must not be directly dependent on a class
        //SO the dependency must be inversed, we use a factory method to change the
        //dependency of the class
        System.out.println(i.getInterest());
        //Using the factory method to invert the dependancy
        FactoryBankInterest f = new FactoryBankInterest();
        BankInterest b = f.returnObj("JP");
        System.out.println(b.getInterest());
    }
}

class FactoryBankInterest{
    public BankInterest returnObj(String s){
        if(s==null){
            return null;
        }
        else if(s.equalsIgnoreCase("PNC")){
            return new PNC();
        }
        else if(s.equalsIgnoreCase("JP")){
            return new JP();
        }
        else{
            return null;
        }
    }
}


abstract class BankInterest{
    int interest;
    abstract int getInterest();
}

class PNC extends BankInterest{
    @Override
    int getInterest() {
        return 1;
    }
}

class JP extends  BankInterest{
    @Override
    int getInterest() {
        return 2;
    }
}

/*
Notes
1_ In dependancy inversion, states that high level modules must never depend on the low level modules
    that means there should be no dependancy between classes of subclass and parent class
2_ If there is dependancy it should be inverted using a factory method
 */