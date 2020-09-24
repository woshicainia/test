package demo01;

import java.util.Arrays;
import java.util.Comparator;
public class Test01 {
    public static Comparator<String> getComparator(){
        //按照数组的长度降序排序
        return (o1,o2)->o2.length()-o1.length();
    }

    public static void main(String[] args) {
        String[] strings = {"aa","bbbbb","ccc"};
        System.out.println(Arrays.toString(strings));//[aa, bbbbb, ccc]
        Arrays.sort(strings,getComparator());
        System.out.println(Arrays.toString(strings));//[bbbbb, ccc, aa]
    }
}
