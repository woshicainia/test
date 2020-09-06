package day06.test;

import day06.demo01.StringDemo09;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by wangxiaowei on 2020/9/6.
 * 输出结果：
 * 大写字母有12
   小写字母有12
   数字有10
   其他有8
 */
public class StringDemo09Test {
    @Test
    public void test1() throws Exception {
        String str = "jdfksdjJKSADJFKASJD1513454534&*&^&%^%";
        StringDemo09.test(str);
    }

}