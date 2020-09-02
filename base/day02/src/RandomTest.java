import java.util.Random;

/**
 * Created by wangxiaowei on 2020/9/2.
 * 需求随机生成一个0-100的整数和一个0-1的小数
 * 运行结果如下：
 * 随机生成的整数是40
 *随机生成的小数是0.7143794688232709
 */
public class RandomTest {
    public static void main(String[] args) {
        //创建Random类实例
        Random r = new Random();

        //得到一个0-100的随机整数
        int i = r.nextInt(100);
        System.out.println("随机生成的整数是" + i);

        //得到一个0-1的随机小数
        double d = r.nextDouble();
        System.out.println("随机生成的小数是" + d);
    }
}
