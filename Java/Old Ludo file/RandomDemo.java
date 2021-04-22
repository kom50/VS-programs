import java.util.*;
class RandomDemo {
    public static String randomChoice(String []ch){
        Random rnd = new Random();
        int i = rnd.nextInt(ch.length);
        return ch[i];
    }

    
    public static void main(String []args){
        Random rnd = new Random();
        //rnd.setSeed(5);
        int r = rnd.nextInt(6) + 1;
        System.out.println("  "+ r);

        byte arr[] = new byte[6];
        rnd.nextBytes(arr);
        for(byte a : arr)
          System.out.printf("  %c  ",(char)a);
      //    rnd.setSeed(5);
        boolean b = rnd.nextBoolean();
        System.out.println(" "+b);

        double d = rnd.nextDouble()+10;
        System.out.println(" "+d);
        System.out.println(" Math.random() "+(Math.random() + 1) % 10);

        //choice 
        String name[] = {"Ram", "Shyam", "Gopal", "Krishna", "Radha", "Lakshaman"};
        System.out.println("Random Name <: "+randomChoice(name));

        int n = (int)Math.floor(rnd.nextFloat() * 10) + 1;//Integer.parseInt();
        System.out.println("a "+n);

    }
}