package demo02;

/**
 * Created by wangxiaowei on 2020/9/24.
 */
public class Test03 {
    public static void method(String name,JieKou4 j){
        Person person = j.newPerson(name);
        System.out.println(person.getNaem());//迪丽热巴
    }

    public static void main(String[] args) {
        method("迪丽热巴",Person::new);
    }
}
