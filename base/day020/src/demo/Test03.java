package demo;


import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
 class Test03 {
    public static void main(String[] args) {
        Student stu = new Student();
        AtomicReferenceFieldUpdater fieldUpdater = AtomicReferenceFieldUpdater.newUpdater(Student.class,String.class,"name");
        System.out.println(fieldUpdater.compareAndSet(stu, null, "张三"));
        System.out.println(stu);
    }
}
class Student{
    volatile String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}