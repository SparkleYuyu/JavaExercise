package JavaBasics;

/**
 * 在本题中，你需要模拟一个图形系统，该系统包含颜色和形状两个方面的特性。
 * 请完成如下设计与实现：
 * 定义一个接口 Shape，表示几何图形，包含常量 PI 和一个抽象方法 area()，用于计算图形面积。
 * 定义一个接口 Colorful，表示带有颜色的对象，包含一个抽象方法 getColor()。
 * 定义一个接口 ColorfulShape，继承 Shape 和 Colorful 接口，并添加一个方法 displayInfo()，用于显示图形信息。
 * 定义一个类 JavaBasics.Circle，实现 ColorfulShape 接口。该类具有：
 *      属性：radius（半径）和 color（颜色）
 *      构造方法：用于初始化半径和颜色
 *      实现：
 *          area() 方法：返回圆的面积
 *          getColor() 方法：返回颜色
 *          displayInfo() 方法：输出该圆的颜色和面积信息（格式为：这是一个 红色 的圆，面积是 78.5）
 * 在 main 方法中创建一个 JavaBasics.Circle 对象，调用其 displayInfo() 方法。
 */
public class Circle implements ColorfulShape {
    private double radius;//这里进行了优化，最初写的版本是没有private的默认权限，但是private常用于类中属性
    private String color;

    //构造方法初始化radius和color，使用this区分
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double area() {
        return Shape.PI * radius * radius;//使用接口名直接调用常量
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void displayInfo() {
        System.out.println("这是一个" + color + "的圆,面积是" + area());
    }
}
