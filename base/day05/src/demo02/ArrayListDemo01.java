package demo02;
import java.util.ArrayList;
/**
 * Created by wangxiaowei on 2020/9/5.
 * ArrayList集合
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        //创建一个ArrayList集合，集合名叫list，里面装的全是String类型的数据
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list);//[]
        list.add("赵丽颖");
        System.out.println(list);//[赵丽颖]
        list.add("迪丽热巴");
        list.add("古力娜拉");
        list.add("马儿扎哈");
        System.out.println(list);//[赵丽颖, 迪丽热巴, 古力娜拉, 马儿扎哈]
    }
}
