package demo;

/**
 * Created by wangxiaowei on 2020/9/25.
 */
public class Person {
    private String name;

    public void eat(){
        System.out.println("eat.....");
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
