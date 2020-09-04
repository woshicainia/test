/**
 * Created by wangxiaowei on 2020/9/4.
 * 第一小组销售额为{11, 12}万元
 * 第二小组销售额为{21, 22, 23}万元
  *第三小组销售额为{31, 32, 33, 34}万元
 */
public class ArrayTest08 {
    public static void main(String[] args) {
        //定义一个长度为3的数组
        int[][] arr = new int[3][];
        //为每一个数组元素赋值
        arr[0] = new int[]{11,12};
        arr[1] = new int[]{21,22,23};
        arr[2] = new int[]{31,32,33,34};

        //定义销售总额
        int sum = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //定义每个小组的销售总额
            int groupSum = 0;
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                //每个小组销售的总额
                groupSum += arr[i][i1];
            }
            //销售总额的累加
            sum += groupSum;
            //打印每个小组的销售总额
            System.out.println("第" + i + "小组的销售总额为" + groupSum);//第0小组的销售总额为23
                                                                           // 第1小组的销售总额为66
                                                                           //第2小组的销售总额为130
        }
        //打印所有小组的销售总额
        System.out.println("所有销售小组的销售总额为" + sum);//所有销售小组的销售总额为219
    }
}
