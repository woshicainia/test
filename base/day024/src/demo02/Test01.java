package demo02;


public class Test01 {
    public static int sum(int i,JieKou1 j){
        return j.abs(i);
    }

    public static void main(String[] args) {
        int sum = sum(-10, Math::abs);
        System.out.println(sum);//10
    }
}
