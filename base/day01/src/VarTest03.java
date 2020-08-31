/**
 * Created by wangxiaowei on 2020/8/30.
 * 作用域的有效范围、作用范围
 * 出了大括号就不认识了
 */
public class VarTest03 {

    int m = 10;
    public static void m1(){
    int m = 20;
    System.out.println(m);//20就近原则
}
    public static void m2(){
        int k = 5;
    }

    public static void main(String[] args) {
        m1();
        //Error k变量的作用域在m2方法里  这里访问不到
        //System.out.println(k);
    }

}
