package localrepo;

class Student{
    int rno;
    String name;
    float marks;

    Student(String name){   // Single parameter constructor
    this(31,name,80.0f);  // Here its calling 3 parameters constructor
    
    }
    Student(int rno , String name , float marks){
     this.rno =rno;
     this.name = name;
     this.marks = marks;
    }

public static void main(String [] args){
    Student Rahul = new Student(32," Rahul",90.0f);
    Student Aryan = new Student("Aryan");
    System.out.println(Rahul.name + " " + Rahul.rno + " " +Rahul.marks );
    System.out.println(Aryan.name + " " + Aryan.rno + " " +Aryan.marks);




}}