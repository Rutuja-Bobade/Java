// Static keyword is used to share the same variable or method of a given class
// static keyword can be used for functions , blocks , nested classes.
// static objects are created in the memory only once ;
// if the static variable is initialized for 1 object , then the other object of the same class are also initialised with the same value

// memory for static variable is allocated only once and all the objects points the to same location for reference. 

public class Static {
    public static void main(String[] args){
        Students s1 =new Students();
        s1.school_name = "Dnayanada English School";

        Students s2 = new Students();
        System.out.println(s2.school_name);

        Students s3 = new Students();
        s3.school_name = "JNV";
        System.out.println(s1.school_name);
    }
}

class Students{
    String name;
    int roll;

    static String school_name;

    void setName(String name){
        this.name= name;
    }

    String getName(){
        return this.name;
    }
}