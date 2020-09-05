import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

import static org.junit.Assert.*;

/**
 * Created by wangxiaowei on 2020/9/5.
 * 用junit测试用例跑方法
 */
public class CalculatorTest {
    @Before
    public void init(){
        System.out.println("init.......");
    }
    @After
    public void close(){
        System.out.println("close.....");
    }
    @Test
    public void add() {
        Calculator c = new Calculator();
        int result = c.add(1,3);
        Assert.assertEquals(4,4);
    }

    @Test
    public void sub() {
        Calculator c = new Calculator();
        int result = c.sub(4,2);
        Assert.assertEquals(2,2);
    }
}