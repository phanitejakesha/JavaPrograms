package com.company;

public class LiskovSubstitution {
    public static void main(String[] args) {
        System.out.println("This is a wrong implementation");
        birds b = new birds();
        b.fly();
        birds p = new pigeon();
        p.fly();
        birds o = new ostrich();
        o.fly();
        System.out.println("This is the correct implementation");
        pigeon1 p1 = new pigeon1();
        p.fly();
        ostrich1 o1 = new ostrich1();
        o1.fly();
    }
}

//Here pigeon and ostrich are both extending the birds class as both of them fall under the bird category
//but pigeon has the fly ability but ostrich does not have, this violates the class birds
//So this doesnt not abide by the liskov substitution principle

class birds{
    public void fly(){
        System.out.println("fly fly");
    }
}

class pigeon extends birds{
}


class ostrich extends birds{
}

//The correct implementation by abiding with the liskov substituion is as follows

class birds1{

}

class FlyingBirds extends birds1{
    public void fly() {
        System.out.println("fly fly");
    }
}

class NonFlyingBirds extends birds1{
    public void fly() {
        System.out.println("cant fly");
    }
}
class pigeon1 extends FlyingBirds{
}


class ostrich1 extends NonFlyingBirds{
}


/*
Notes
1_ A parent class must be able to substitue with any of its subclass
2_ Any substitution of the subclass must not change any of the functionality of the parent class
3_ examples are bird,fly - non fly, wrt company , employees having technicalSkills, non technical employee- tech employee
 */
