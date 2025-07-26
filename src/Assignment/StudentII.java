package Assignment;

/**
 * 面向对象拓展:用面向对象的思路完成对简易学生管理系统的设计
 * 简易学生管理系统 请使用Java语言开发一个简易学生成绩管理系统，具体要求如下：
 * 1. 数据类型与变量：系统需记录学生的姓名（字符串类型）、年龄（整型）、数学成绩和语文成绩（双精度浮点型）。在程序开始时，使用合适的数据类型声明并初始化至少三名学生的信息。
 * 2. 运算符运用：计算每位学生的总成绩（数学成绩与语文成绩之和），以及平均成绩。在控制台输出每位学生的姓名、年龄、数学成绩、语文成绩、总成绩和平均成绩。平均成绩保留两位小数，总成绩为双精度浮点型。
 * 3. 流程控制：
 *     a. 选择结构：依据学生的平均成绩划分等级。平均成绩90分及以上为“A”，80 - 89分为“B”，70 - 79分为“C”，60 - 69分为“D”，60分以下为“F” 。在控制台输出每位学生的成绩等级。
 *     b. 循环结构：使用for循环遍历学生信息数组，对每位学生执行上述计算和等级评定操作。
 * 4. 数组应用：使用数组存储所有学生的信息，便于批量操作和管理。在程序中展示如何通过索引访问和修改数组中的学生信息。例如，修改其中一位学生的数学成绩，并重新计算其总成绩和平均成绩，输出更新后的信息。
 */

public class StudentII {
    String name;
    int age;
    double matchScore;
    double chineseScore;
    double totalScore;
    double averageScore;
    char scoreLevel;
    public static final int NUM_OF_SUBJECTS = 2;
    public static final int NUM_OF_STUDENTS = 3;


    //构造方法初始化变量
    public StudentII(String name, int age, double matchScore, double chineseScore) {
        this.name = name;
        this.age = age;
        this.matchScore = matchScore;
        this.chineseScore = chineseScore;
        getTotalScore();
        getAverageScore();
        getScoreLevel();
    }

    //计算总成绩
    public void getTotalScore() {
        totalScore = matchScore + chineseScore;
    }

    //计算平均成绩
    public void getAverageScore() {
        //getTotalScore();这里也有个疑惑的点是，这个参到底传进来/传出去没有
        averageScore = totalScore / NUM_OF_SUBJECTS;
    }

    //计算等级
    public void getScoreLevel() {
        //getAverageScore();这里有点疑惑的是，这个参到底传出去没有
        if(averageScore >= 90) {
            scoreLevel = 'A';
        } else if(averageScore >= 80) {
            scoreLevel = 'B';
        } else if(averageScore >= 70) {
            scoreLevel = 'C';
        } else if(averageScore >= 60) {
            scoreLevel = 'D';
        } else {
            scoreLevel = 'F';
        }
    }

}
