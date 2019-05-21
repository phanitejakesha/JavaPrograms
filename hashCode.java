package com.phani.concepts;

import java.util.HashMap;

class Name{
    private String firstName, lastName;

    Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        Name ref;
        if(obj instanceof Name)
            ref = (Name) obj;
        else
            return false;

        return (ref.firstName.hashCode() == this.firstName.hashCode() && this.lastName.hashCode() == ref.lastName.hashCode());
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }
}

public class hashCode {
    public static void main(String[] args) {
        Name n1 = new Name("Phani", "Teja");
        HashMap<Name, Integer> map = new HashMap<>();
        map.put(n1, 10);
        Name n2 = new Name("Phani", "Teja");
        if(n1.equals(n2)){
            System.out.println("This ");
        }
        if(map.containsKey(n2)){
            System.out.println("Found Key "+ map.get(n2));
        }
    }
}
