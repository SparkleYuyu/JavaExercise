public class Test {
    public static void main(String[] args){
        System.out.println("Hello Test!");
        Person p = new Person("Jack", 18);
        //p.setName("Jack");
        System.out.println(p.getName());
        System.out.println(p.age);
    }
}
