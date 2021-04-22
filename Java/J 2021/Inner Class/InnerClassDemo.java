// package io.github.jiangdequan;

public class InnerClassDemo {
    interface Sayable {
        public void say(String str);
    }

    public static void main(String[] args) {
        Sayable s1 = new Sayable() {
            public void say(String name) {
                System.out.println("Hii " + name);
            }
        };

        s1.say("Prakash raj");

        Sayable s2 = (String name) -> {
            System.out.println("Hello " + name);
        };

        s2.say("Lambda expression");

        Sayable s3 = name -> {
            System.out.println("Hello " + name);
        };
        s3.say("Lambda expression without ()");

        Sayable s4 = name -> {
            System.out.println("Hello " + name);
        };
        s3.say("Lambda expression without ()");

    }
}