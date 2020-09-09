package demo03;

import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet();
        Person person = new Person("张三",18);
        Person person1 = new Person("张三",18);
        Person person3 = new Person("张三",19);
        hashSet.add(person);
        hashSet.add(person1);
        hashSet.add(person3);
        System.out.println(hashSet);//[Person{name='张三', age=19}, Person{name='张三', age=18}]

    }
}
