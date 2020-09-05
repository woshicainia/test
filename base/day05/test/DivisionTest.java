import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wangxiaowei on 2020/9/5.
 */
public class DivisionTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("setUp......");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown......");
    }

    @Test
    public void div() throws Exception {
        int resule = Division.div(10,5);
        Assert.assertEquals(2,2);
    }

}