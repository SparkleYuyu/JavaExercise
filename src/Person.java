public class Person {
    //成员变量（属性）
    private String name;
    int age;

    //构造方法
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    //name的Getter方法
    public String getName(){
        return name;
    }

    //name的Setter方法
    public void setName(String name){
        this.name = name;
    }



}
