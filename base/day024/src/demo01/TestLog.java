package demo01;

public class TestLog {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "wrold";
        String str3 = "java";
        //showLog(1,()->str1 + str2 + str3);
        showLog(2,()->{
            System.out.println("条件不满足不执行");
            return str1 + str2 + str3;
        });
    }
    public static void showLog(int level,MessageBuilder messageBuilder){
        if (level == 1){
            System.out.println(messageBuilder.builderMessage());
        }
    }
}
