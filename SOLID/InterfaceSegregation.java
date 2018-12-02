package com.company;

public class InterfaceSegregation {
    public static void main(String[] args) {
        System.out.println("Interfaces seggregated with respect to there methdods");
    }
}


//Here we can have a single interface which stores both the onclick and longonclick method
//But by doing like this any class which doesnt require either one of the method has to
//overide it as it is implementing it, so the methods although are very similar are
//seggregated into two interfaces

interface OnClick{
    void onclick();
}

interface LongOnClick{
    void longOnClick();
}


class ClicksOnce implements OnClick{

    @Override
    public void onclick() {

    }
}

class ClicksLong implements LongOnClick{
    @Override
    public void longOnClick() {

    }
}

/*
Notes:
1) A interface must be like its methods must be required for the implementing classes but
    must not forcibly be overriden by the class
2) Interfaces must be segregated with methods with this property
 */
