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

public class AssignmentTwo {
    public static void main(String[] args) {

        //使用数组来存储学生的所有信息
        StudentII[] studentsInfo = new StudentII[StudentII.NUM_OF_STUDENTS];//第一次犯错是因为没有通过类名调用，但是需要这么不直观吗？？
        studentsInfo[0] = new StudentII("Anna", 18, 82, 76);
        studentsInfo[1] = new StudentII("Bob", 19, 96, 65);
        studentsInfo[2] = new StudentII("Candy", 19, 88, 80);

        //输出学生信息
        for (int i = 0; i < StudentII.NUM_OF_STUDENTS; i++) {
            System.out.println("Name: " + studentsInfo[i].name + "  " +
                    "Age: " + studentsInfo[i].age + "  " +
                    "MathScore: " + studentsInfo[i].matchScore + "  " +
                    "ChineseScore: " + studentsInfo[i].chineseScore + "  " +
                    "TotalScore: " + studentsInfo[i].totalScore + "  " +
                    "AverageScore: " + studentsInfo[i].averageScore + "  " +
                    "ScoreLevel: " + studentsInfo[i].scoreLevel);
        }

        System.out.println("............................After change..................................");
        // 修改一个学生的数学成绩，并重新计算其总成绩和平均成绩，输出更新后的信息。
        // Candy：88->98,index=2,但需要找到这个index
        // After change: math:98, chinese:80, total:178, average: 89, grade: B

        //先找到该学生所在的索引
        int targetIndex = 0;
        while(!studentsInfo[targetIndex].name.equals("Candy")) { //匹配成功，返回true，终止循环，条件为false，所以使用！
            targetIndex++;
        }
        //改变目标学生的成绩
        studentsInfo[targetIndex].matchScore =98;//这里只写这一行，发现total，average和scorelevel都没有改变
        //对比代码后发现,需要再调用一次方法，才可以更新
        studentsInfo[targetIndex].getTotalScore();
        studentsInfo[targetIndex].getAverageScore();
        studentsInfo[targetIndex].getScoreLevel();

        System.out.println("Name: " + studentsInfo[targetIndex].name + "  " +
                "Age: " + studentsInfo[targetIndex].age + "  " +
                "MathScore: " + studentsInfo[targetIndex].matchScore + "  " +
                "ChineseScore: " + studentsInfo[targetIndex].chineseScore + "  " +
                "TotalScore: " + studentsInfo[targetIndex].totalScore + "  " +
                "AverageScore: " + studentsInfo[targetIndex].averageScore + "  " +
                "ScoreLevel: " + studentsInfo[targetIndex].scoreLevel);

    }
}
