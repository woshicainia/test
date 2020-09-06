package day06.test;

import day06.demo01.StringDemo08;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wangxiaowei on 2020/9/6.
 */
public class StringDemo08Test {
    @Test
    public void fromArrayToString() throws Exception {
        int[] array = {1,2,3};
        String s = StringDemo08.fromArrayToString(array);
        Assert.assertEquals(s,"[world#1world#2world#3]");
    }
}