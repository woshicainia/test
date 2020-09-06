package day06.demo01;

/**
 * Created by wangxiaowei on 2020/9/6.
 * public String[] split(String regex):按照参数的规则，将字符串切分成为若干部分。
 注意事项：
 split方法的参数其实是一个”正则表达式“。今后学习。
 现在要注意，如果按照英文句点”.“进行切分，必须写两个反斜杠.
 */
public class StringDemo07 {
    public static void test(){
        String str1 = "aaa,bbb,ccc";
        String[] split = str1.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i] + " ");//aaa  bbb ccc
        }
        System.out.println();

        String str2 = "aaa bbb ccc";
        String[] split1 = str2.split(" ");
        for (int i = 0; i < split1.length; i++) {
            System.out.print(split1[i] + " ");//aaa  bbb  ccc
        }
        System.out.println();

        String str3 = "aaa.bbb.ccc";
        String[] split2 = str3.split("\\.");
        for (int i = 0; i < split2.length; i++) {
            System.out.print(split2[i] + " ");//aaa bbb ccc
        }
        System.out.println();
    }
}
