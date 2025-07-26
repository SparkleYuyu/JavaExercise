package Assignment;

/**
 * 请使用 Java 语言开发一个简易学生成绩管理系统，具体要求如下：
 * 1. 数据类型与变量系统需记录学生的姓名（字符串类型）、年龄（整型）、数学成绩和语文成绩（双精度浮点型）。在程序开始时，使用合适的数据类型声明并初始化至少三名学生的信息。
 * 2. 运算符运用：计算每位学生的总成绩（数学成绩与语文成绩之和），以及平均成绩。在控制台输出每位学生的姓名、年龄、数学成绩、语文成绩、总成绩和平均成绩。
 * 3. 流程控制：
 *     a. 选择结构：依据学生的平均成绩划分等级。平均成绩90分及以上为“A”，80 - 89分为“B”，70 - 79分为“C”，60 - 69分为“D”，60分以下为“F” 。在控制台输出每位学生的成绩等级。
 *     b. 循环结构：使用for循环遍历学生信息数组，对每位学生执行上述计算和等级评定操作。
 * 4. 数组应用：使用数组存储所有学生的信息，便于批量操作和管理。在程序中展示如何通过索引访问和修改数组中的学生信息。例如，修改其中一位学生的数学成绩，并重新计算其总成绩和平均成绩，输出更新后的信息。
 */

public class AssignmentOne {
    public static void main(String[] args) {
        //1.Anna  18  82  76
        //2.Bob   19  96  65
        //3.Candy 19  88  80

        int numOfSubjects = 2;
        int numOfStudents = 3;

        //使用数组存放学生的信息
        String[] studentNames = {"Anna", "Bob", "Candy"}; //对比标答后发现变量名没有使用复数
        int[] studentAges = {18, 19, 19};
        double[] mathScores = {82, 96, 88};//这里虽然标记，但是会出现隐式转化，int->double
        double[] chineseScores = {76, 65, 80};

        //计算每位学生总成绩，平均成绩,并判断等级
        double[] totalScores = new double[numOfStudents];//本来写的3，但是想起来要用变量名替代，便回去写了两个大小
        double[] averageScores = new double[numOfStudents];
        char[] scoreLevels = new char[numOfStudents];
        for (int i = 0; i < numOfStudents; i++) {
            totalScores[i] = mathScores[i] + chineseScores[i];
            averageScores[i] = totalScores[i] / numOfSubjects;
            if (averageScores[i] >= 90) {
                scoreLevels[i] = 'A';
            } else if (averageScores[i] >= 80) {
                scoreLevels[i] = 'B';
            } else if (averageScores[i] >= 70) {
                scoreLevels[i] = 'C';
            } else if (averageScores[i] >= 60) {
                scoreLevels[i] = 'D';
            } else {
                scoreLevels[i] = 'F';
            }
        }

        //输出每位学生的姓名，年龄，数学成绩，语文成绩，总成绩,平均成绩和等级
        for (int j = 0; j < numOfStudents; j++) {
            System.out.println("Name: " + studentNames[j] + " ," +
                                "Age: " + studentAges[j] + " ," +
                                "MathScore: " + mathScores[j] + " ," +
                                "ChineseScore: " + chineseScores[j] + " ," +
                                "TotalScore: " + totalScores[j] + " ," +
                                "AverageScore: " + averageScores[j] + " ," +
                                "ScoreLevel: " + scoreLevels[j]
            );
        }

        //修改其中一位学生的数学成绩，重新计算其总成绩、平均成绩、等级
        //Candy：88->98,index=2,但需要找到这个index
        int targetIndex = 0;

//        while(studentNames[targetIndex] != "Candy"){ //知道停止条件所以使用while
//            targetIndex++; //得到targetIndex = 2；
//        }

        //注意在java中不能使用！和==比较字符串内容，注意equal返回ture/false
        while (!studentNames[targetIndex].equals("Candy")) {//等于的时候满足条件跳出循环，等于的时候为false
            targetIndex++;
        }

        mathScores[targetIndex] = 98;
        totalScores[targetIndex] = mathScores[targetIndex] + chineseScores[targetIndex];
        averageScores[targetIndex] = totalScores[targetIndex] / numOfSubjects;
        if (averageScores[targetIndex] >= 90) {
            scoreLevels[targetIndex] = 'A';
        } else if (averageScores[targetIndex] >= 80) {
            scoreLevels[targetIndex] = 'B';
        } else if (averageScores[targetIndex] >= 70) {
            scoreLevels[targetIndex] = 'C';
        } else if (averageScores[targetIndex] >= 60) {
            scoreLevels[targetIndex] = 'D';
        } else {
            scoreLevels[targetIndex] = 'F';
        }
        System.out.println("....................After Change...............................");
        System.out.println("Name: " + studentNames[targetIndex] + " ," +
                            "Age: " + studentAges[targetIndex] + " ," +
                            "MathScore: " + mathScores[targetIndex] + " ," +
                            "ChineseScore: " + chineseScores[targetIndex] + " ," +
                            "TotalScore: " + totalScores[targetIndex] + " ," +
                            "AverageScore: " + averageScores[targetIndex] + " ," +
                            "ScoreLevel: " + scoreLevels[targetIndex]);


    }
}
