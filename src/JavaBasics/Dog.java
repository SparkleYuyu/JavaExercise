package JavaBasics;

public class Dog extends Animal {
    public Dog(String name) {
        super(name); //调用父类的构造方法
    }

    @Override
    public void eat() {
        System.out.println(name + "正在吃骨头");
    }

    public void bark() {
        System.out.println(name + "正在汪汪叫！");
    }

    //实现抽象方法
    @Override
    public void makeSound() {
        System.out.println(name + "正在汪汪叫！");
    }

}
