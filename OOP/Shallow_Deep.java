public class Shallow_Deep {
   public static void main(String[] args){
       Student s1 = new Student();
       s1.marks[0] = 75;
       s1.marks[1] = 80;
       s1.marks[2] = 100;

       s1.name = "Rutuja";
       s1.roll = 12;
       s1.word = "abcd";

       Student s2 = new Student(s1);
       s2.word = "xyz";
       s1.marks[0] = 100;
       System.out.println(s1.word);
       System.out.println(s2.word);

       for (int i = 0; i < 3; i++) {
           System.out.println(s2.marks[i]);
       }
   }
}

class Student{
   String name;
   int roll;
   String word;
   int[] marks;

   Student(){
       marks = new int[3];
       System.out.println("Constructor is called");
   }

   // shallow constructor
   // Student(Student s1){
   //     this.name = s1.name;
   //     this.roll = s1.roll;
   //     marks = new int[3];
   //     this.marks = s1.marks;
   // }

   // deep constructor
   Student(Student s1){
       this.name = s1.name;
       this.roll = s1.roll;
       marks = new int[3];

       for (int i = 0; i < 3; i++) {
           this.marks[i] = s1.marks[i];
       }
   }
}