package demo01;
/*| `Integer(int value)` 构造一个新分配的 `Integer`对象，该对象表示指定的 `int`值。 |
        | ------------------------------------------------------------ |
        | `Integer(String s)` 构造一个新分配 `Integer`对象，表示 `int`由指示值 `String`参数。 |

        注意：传递的字符串，必须是基本数据的字符串，否则会抛出异常“100”正确。“abc”异常。

        静态方法：

        | `static Integer` | `valueOf(int i)` 返回一个 `Integer`指定的 `int`值的 `Integer`实例。 |
        | ---------------- | ------------------------------------------------------------ |
        | `static Integer` | `valueOf(String s)` 返回一个 `Integer`对象，保存指定的值为 `String` 。 |

        拆箱：在包装类中取出基本类型的数据

      成员方法：*/
public class Demo01 {
    public static void main(String[] args) {
        //构造方法 装箱
        Integer integer = new Integer(1);
        Integer integer1 = new Integer("1");
        System.out.println(integer);//1
        System.out.println(integer1);//1
        //静态方法  装箱
        Integer i = Integer.valueOf(1);//1
        Integer i1 = Integer.valueOf("1");//1
        System.out.println(i);
        System.out.println(i1);
        //拆箱 成员方法
        byte b = integer.byteValue();
        System.out.println(b);
    }
}
