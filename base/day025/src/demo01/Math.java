package demo01;

/**
 * Created by wangxiaowei on 2020/9/25.
 */
public class Math {
    @Check
    public void add(){
        System.out.println("1+1="+ (1+1));
    }
    @Check
    public void chu(){
        System.out.println("1/0=" + (1/0));
    }
}
