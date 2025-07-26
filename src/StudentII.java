//Idea1：使用StudentII记录每个学生，然后再用一个class数组来集合所有？


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
