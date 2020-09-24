package demo02;
public class Test {
    public static void printString(Printable p){
        p.print("aaabbbccc");
    }
    public static void main(String[] args) {
        String str = "张无忌";
        MethodRefefObject mro = new MethodRefefObject();
        printString(mro::printUpperCase);//AAABBBCCC
    }
}
