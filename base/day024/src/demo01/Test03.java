package demo01;

import java.util.function.Supplier;
public class Test03 {
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {30,88,-22,-44,100};
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("最大值是：" + maxValue);//最大值是：100
    }
}
