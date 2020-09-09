package demo02;

/**
 * Created by wangxiaowei on 2020/9/9.
 */
public class StudentDemo<E> {
    private E name;

    public StudentDemo() {
    }

    public StudentDemo(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
