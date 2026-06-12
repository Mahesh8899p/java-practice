class Student{
    
    String name;
    int age;
    int marks;
    
    
    Student(){
        this.name = "mahesh";
        this.age = 27;
        this.marks = 87;
    }

    Student(String name , int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void name(){
        System.out.println("name is " + this.name + "age is" + this.age );
    }
}

class Primitives{
    public static void main(String[] args){
        Student s1 = new Student("manu",67,56);
        Student s2 = new Student();
        s1.name();
    }
}