package demo02;

/**
 * Created by wangxiaowei on 2020/9/24.
 */
public class Test02 {
    public void buyFangZi(){
        System.out.println("买了一个房子");
    }
    public void jieHun(JieKou3 j){
        j.buy();
    }
    public void soHappy(){
        jieHun(this::buyFangZi);//买了一个房子
    }

    public static void main(String[] args) {
        new Test02().soHappy();
    }
}
