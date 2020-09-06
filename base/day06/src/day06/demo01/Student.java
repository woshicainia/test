package day06.demo01;

/**
 * Created by wangxiaowei on 2020/9/6.
 */
public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int count = 0;
    public Student() {
        ++count;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++count;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static String getRoom() {
        return room;
    }
    public static void setRoom(String room) {
        Student.room = room;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Student.count = count;
    }
}
