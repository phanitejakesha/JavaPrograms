import java.io.*; 
import java.util.*; 

public class stackProblem{
     public static void main(String []args){
        System.out.println("Hello World");
        Stack<Integer> list = new Stack<Integer>(); 
        String s = "13 + + + DUP 4 POP 5 DUP + DUP + - 20 40 +";
        String[] splitStr = s.split("\\s+");
        for (int i = 0;i<splitStr.length;i++){
            String op = splitStr[i];
            boolean flag;
            int num = 0;
            try{
            num = Integer.parseInt(op);
            flag = true;
                // is an integer!
                } catch (NumberFormatException e) {
                flag = false;
                // not an integer!
            }
            if(flag==true){
                list.push(num); 
            }
            else{
                int x = 0;
                int y = 0; 
                int z = 0;
            switch(op){
                case "+":
                    //return error if two numbers are not found
                    if(list.size()>1){
                     x = list.pop();
                     y = list.pop();
                     z = x+y; 
                    list.push(z); }
                    break;
                case "-":
                     //return error if two numbers are not found
                     if(list.size()>1){
                     x =  list.pop();
                     y =  list.pop();
                     z = x-y;
                    list.push(z);} 
                    break;
                case "DUP":
                     //return error if one numbers are not found
                     if(list.size()>0){
                    Integer element = (Integer) list.peek(); 
                    list.push(element);}
                    break;
                case "POP":
                     //return error if stack is empty 
                     if(list.size()>0){
                    list.pop();}
                    break;
                default:
            }
            }
        }
        System.out.println(list.peek());
     }
}

