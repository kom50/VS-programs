enum Student{
    pankaj(20), om_kumar(21), rajnish(17), raja(19), Rahul(24);
     int age;
    int getAge(){return age;}
    private Student(int age){
        System.out.println("Hello Constructor...");
        this.age = age;
    }
    void setAge(int age){
        this.age = age;
    }
}

class EnumDemo{
    public static void main(String []args){
        //Student s1;// = Student.pankaj;
       Student s2 = Student.Rahul;
       s2.setAge(14);
       System.out.println("Rajnish Age : "+Student.rajnish.getAge());
    //   System.out.println("Pankaj Age : "+s1.getAge());
      System.out.println("Om Age : "+s2.getAge());
       Student s3[] = Student.values();
       for(Student s4 : s3){
           System.out.println("Student Name : "+s4+", age : "+s4.getAge());
       } 
    }
}