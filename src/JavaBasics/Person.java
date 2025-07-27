package JavaBasics;

public class Person {
    //成员变量（属性）
    private String name;
    int age;

    //构造方法
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + name + ", age: " + age;
    }

    //name的Getter方法
    public String getName(){
        return name;
    }

    //name的Setter方法
    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person p = new Person("James", 18);
        System.out.println(p.toString());

    }

}
