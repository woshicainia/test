package demo10;


import java.util.Arrays;
public class DemoMain01 {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("迪丽热巴",18),
                new Person("古力娜扎",25),
                new Person("马尔扎哈",20)
        };
//        Arrays.sort(persons, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        Arrays.sort(persons,(Person o1,Person o2)->{
            return o1.getAge()-o2.getAge();
        });
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
