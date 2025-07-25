public class TestExtension {
    public static void main(String[] args) {
//        Animal dog = new Dog("旺财");
//        Animal cat = new Cat("小咪");
//        dog.eat();//父类的方法但被重写
//        //dog.bark();//子类的方法,这里声明是Animal所以会出现无法找到
//        cat.eat();
        //不能实例化抽象类，即不能new
        Dog dog = new Dog("旺财");
        Cat cat = new Cat("小咪");
        dog.makeSound();
        cat.makeSound();

    }
}
