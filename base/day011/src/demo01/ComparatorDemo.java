package demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("迪丽热巴",18));
        list.add(new Student("古力娜扎",15));
        list.add(new Student("马尔扎哈",25));
        System.out.println(list);//[Student{name='迪丽热巴', age=18}, Student{name='古力娜扎', age=15}, Student{name='马尔扎哈', age=25}]
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                //按照年龄排序
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list);//[Student{name='古力娜扎', age=15}, Student{name='迪丽热巴', age=18}, Student{name='马尔扎哈', age=25}]
    }
}
