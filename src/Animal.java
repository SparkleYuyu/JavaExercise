public  abstract  class Animal {
    String name;
    public Animal(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name + "正在吃东西。");
    }
    //声明抽象类
    public abstract void makeSound();
}
