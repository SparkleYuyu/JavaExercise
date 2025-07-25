public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(name + "正在吃鱼");
    }

    //实现抽象方法
    @Override
    public void makeSound() {
        System.out.println(name + "正在喵喵叫！");
    }
}
