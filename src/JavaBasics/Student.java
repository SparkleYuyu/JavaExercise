package JavaBasics;

public class Student {
    static int totalStudents;
    String name;
    //构造方法
    public Student(String name){
        this.name = name;
        totalStudents++; //每生成一个对象，总数 + 1
    }

    //静态方法
    public static void print(){
        System.out.println("This is a static method of JavaBasics.Student");
    }

    public static void main(String[] args){
        Student s1 = new Student("Anna");
        System.out.println(Student.totalStudents);
        Student s2 = new Student("Tom");
        System.out.println(Student.totalStudents);

        //调用静态方法直接使用类名调用
        Student.print();
    }

}
