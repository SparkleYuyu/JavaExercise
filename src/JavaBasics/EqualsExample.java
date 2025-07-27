package JavaBasics;

import Assignment.StudentII;

class StudentEquals {
    String name;
    int id;
    public StudentEquals(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if(obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StudentEquals other = (StudentEquals)obj;
        return id == other.id;
    }
}

public class EqualsExample {
    public static void main(String[] args) {
        StudentEquals s1 = new StudentEquals("jason", 1359);
        StudentEquals s2 = new StudentEquals("Jack", 1359);
        System.out.println(s1.equals(s2));
        //直接比较类，所以需要重写equals，但是如果使用String的话，系统已经帮助我们重写，比较的就是String的内容
    }
}
