/**
 * Created by wangxiaowei on 2020/9/5.
 * 定义一个人类，属性有姓名，年龄。
 */
public class Person {
    String name;
    private int age;//年龄私有化

    //set方法，修改年龄的入口
    public void setAge(int a){
        if (a < 100 && a >0){
            age = a;
        }else{
            System.out.println("你输入的年龄不合法");
        }
    }

    //get方法读取年龄的入口
    public int getAge(){
        return age;
    }
}
