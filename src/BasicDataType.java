public class BasicDataType {
    public static void main(String[] args){
        System.out.println("Hello World!");

        //整型
        int a = 10;
        System.out.println(a);

        //浮点型
        float f = 2.5f;
        double d = 22.0;
        System.out .println(f);
        System.out.println(d);

        //字符型
        char c = 'A';
        System.out.println(c);

        //布尔类型
        int score = 89;
        boolean result = score >= 90;
        System.out.println(result);

        //加法
        int e = 2 + 3;
        System.out.println(e);
        int g = e + 1;
        System.out.println(g);
        System.out.println("e = " + e);

        //减法
        int k = 2 - 3;
        System.out.println(k);
        System.out.println(k - 2);

        //乘法
        int m = 2 * 3;
        System.out.println(m);

        //除法
        int n1 = 3 / 2;//1.5->1 舍去小数点后面的部分，留下整数的部分
        System.out.println(n1);
        double n2 = 3.0 / 2;
        System.out.println(n2);

        //取余
        int remainder = 5 % 3;
        System.out.println(remainder);

        //赋值运算
        int x = 8;
        x += 1;//x = x + 1;
        System.out.println(x);

        //比较运算，返回结果都是boolean
        boolean res = 2 <= 3;
        System.out.println(res);

        //逻辑运算 && || ！
        boolean testAnd = 2 < 3 && 5 >= 8;
        System.out.println(testAnd);
        boolean testNot = !testAnd;
        System.out.println(testNot);

        //if-else
        int mathScore = 85;
        if(mathScore >= 90){
            System.out.println("你的成绩是A");
        }else{
            System.out.println("你的成绩不是A");
        }

        //if else if else
        if(mathScore >= 90){
            System.out.println("你的成绩是A");
        }else if(mathScore >= 80){
            System.out.println("你的成绩是B");
        }else if(mathScore >=70){
            System.out.println("你的成绩是C");
        }else{
            System.out.println("你的成绩不合格");
        }

        //switch-case
        int dayOfWeek = 3;
        switch(dayOfWeek){
            case 1:
                System.out.println("今天是周一");
                break;
            case 2:
                System.out.println("今天是周二");
                break;
            case 3:
                System.out.println("今天是周三");
                break;
            case 4:
                System.out.println("今天是周四");
                break;
            case 5:
                System.out.println("今天是周五");
                break;
            case 6:
                System.out.println("今天是周六");
                break;
            case 7:
                System.out.println("今天是周天");
                break;
            default:
                System.out.println("输入的日期无效");
        }

        //for loop
        for(int i = 0; i < 5; i++){
            System.out.println("i = " + i);
        }

        //while loop
        int count = 0;
        while(count <= 3){
            System.out.println("count = " + count);
            count++;
        }

        //do-while loop
        int num = 1;
        do{
            System.out.println("执行do-while循环，当前num的值是 " + num);
            num++;
        }while(num < 3);

    }
}
