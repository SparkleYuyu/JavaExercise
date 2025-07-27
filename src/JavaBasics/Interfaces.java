package JavaBasics;

/**
 * 在本题中，你需要模拟一个图形系统，该系统包含颜色和形状两个方面的特性。
 * 请完成如下设计与实现：
 * 定义一个接口 JavaBasics.Shape，表示几何图形，包含常量 PI 和一个抽象方法 area()，用于计算图形面积。
 * 定义一个接口 JavaBasics.Colorful，表示带有颜色的对象，包含一个抽象方法 getColor()。
 * 定义一个接口 JavaBasics.ColorfulShape，继承 JavaBasics.Shape 和 JavaBasics.Colorful 接口，并添加一个方法 displayInfo()，用于显示图形信息。
 * 定义一个类 JavaBasics.Circle，实现 JavaBasics.ColorfulShape 接口。该类具有：
 *      属性：radius（半径）和 color（颜色）
 *      构造方法：用于初始化半径和颜色
 *      实现：
 *          area() 方法：返回圆的面积
 *          getColor() 方法：返回颜色
 *          displayInfo() 方法：输出该圆的颜色和面积信息（格式为：这是一个 红色 的圆，面积是 78.5）
 * 在 main 方法中创建一个 JavaBasics.Circle 对象，调用其 displayInfo() 方法。
 */

interface Shape {
    double PI = 3.14;
    double area();
}

interface Colorful {
    String getColor();
}

interface ColorfulShape extends Shape, Colorful {
    void displayInfo();
}
