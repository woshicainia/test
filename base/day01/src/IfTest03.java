/**
 * Created by wangxiaowei on 2020/8/30.
 * 需求：判断当前天气是晴天还是下雨，如果是晴天当温度在30度以上，男的戴墨镜女的擦防晒霜
 * 30度以下，男的穿短裤女的穿裙子，如果是下雨天，男的黑伞女的粉伞
 */
public class IfTest03 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入今天是晴天还是下雨");
        String tianQi = s.next();
        if (tianQi.equals("晴天")){
            System.out.println("请输入你看到的是男还是女");
            String xingBie = s.next();
            System.out.println(xingBie.equals("男")? "带一把大黑伞" : "带一把粉伞");
        }else{
            System.out.println("请输入当前气温");
            double qiWen = s.nextDouble();
            if (qiWen <= 30){
                System.out.println("请输入你看到的人的性别是男是女");
                String xingB = s.next();
                System.out.println(xingB.equals("男") ? "穿短裤" : "穿裙子");
            }else{
                System.out.println("请输入你看到的是男是女");
                String xingBie = s.next();
                System.out.println(xingBie.equals("男") ? "戴墨镜" : "擦防晒霜");
            }
        }
    }
}
