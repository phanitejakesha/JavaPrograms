package com.phani.concepts;

public class learningThis {

    int a = 10;
    static int b = 20;

    void helperFunc(){
        System.out.println(a);
        System.out.println(b);
        this.a = 100;
        System.out.println(a);
        this.b = 200;
        System.out.println(b);
    }

    public static void main(String[] args) {
        new learningThis().helperFunc();
        new ChildClass().helpFunc();
    }
}


class ChildClass extends learningThis{
    void helpFunc(){
        System.out.println(super.a);
        System.out.println(super.b);
        a = 1000;
        b = 2000;
        System.out.println(a);
        System.out.println(b);
    }
}

/*Note:
1) We can use ‘this’ as well as ‘super’ any number of times but main thing is that we cannot use them inside static context
*/