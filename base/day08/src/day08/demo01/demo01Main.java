package day08.demo01;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class demo01Main {
    public static void main(String[] args) {
        //对象的向上转型
        Animal animal = new Cat();
        animal.eat();
        getMeAPet(animal);
        //对象一旦转型为父类，就无法调用子类中特有的方法。
//        animal.catchMouse();
       /* //向下转型
        Cat cat = (Cat)animal;
        cat.catchMouse();*/

        //这是错误的向下转型，编译不会出错，运行会出现ClassCastException，类型转换错误。
        /*Dog dog = (Dog)animal;
        dog.catchHouse();//ClassCastException*/
    }
    public static void getMeAPet(Animal animal){
        //如果希望调用子类特有方法，需要向下转型，判断一下父类引用animal是谁。
        if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
        if (animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.catchHouse();
        }
    }
}
