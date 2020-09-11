package demo02;

import java.util.HashMap;
import java.util.Map;

/*
| `void`                | `clear()` 从该地图中删除所有的映射（可选操作）。             |
| `Set<Map.Entry<K,V>>` | `entrySet()` 返回此地图中包含的映射的[`Set`](../../java/util/Set.html)视图。
 |
| `boolean`             | `containsKey(Object key)` 如果此映射包含指定键的映射，则返回 `true` 。 |
| `boolean`             | `containsValue(Object value)` 如果此地图将一个或多个键映射到指定的值，则返回 `true` 。
| `V`                   | `put(K key, V value)` 将指定的值与该映射中的指定键相关联（可选操作）。 ||
| `V`                   | `get(Object key)` 返回到指定键所映射的值，或 `null`如果此映射包含该键的映射。 |
| `int`                 | `hashCode()` 返回此地图的哈希码值。                          |
| `boolean`             | `isEmpty()` 如果此地图不包含键值映射，则返回 `true` 。
| `V`                   | `remove(Object key)` 如果存在（从可选的操作），从该地图中删除一个键的映射。

| `boolean`             | `equals(Object o)` 将指定的对象与此映射进行比较以获得相等性。
| `void`                | `putAll(Map<? extends K,? extends V> m)` 将指定地图的所有映射复制到此映射（可选操作）。 |
 |
| `int`                 | `size()` 返回此地图中键值映射的数量。                        |
 */
public class MapDemo01 {
    public static void main(String[] args) {
        /*
        | `boolean`             | `containsKey(Object key)` 如果此映射包含指定键的映射，则返回 `true` 。 |
        | `boolean`             | `containsValue(Object value)` 如果此地图将一个或多个键映射到指定的值，则返回 `true` 。
        | `V`                   | `put(K key, V value)` 将指定的值与该映射中的指定键相关联（可选操作）。 ||
        | `V`                   | `get(Object key)` 返回到指定键所映射的值，或 `null`如果此映射包含该键的映射。 |                          |
        | `boolean`             | `isEmpty()` 如果此地图不包含键值映射，则返回 `true` 。
        | `V`                   | `remove(Object key)` 如果存在（从可选的操作），从该地图中删除一个键的映射。
         */
        Map<String,String> map = new HashMap<String, String>();
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");
        System.out.println(map);//{杨过=小龙女, 郭靖=黄蓉, 张无忌=赵敏}
        //| `V`                   | `get(Object key)` 返回到指定键所映射的值，或 `null`如果此映射包含该键的映射。
        String s1 = map.get("张无忌");
        String s2 = map.get("虚竹");
        System.out.println(s1);//赵敏
        System.out.println(s2);//null

        //| `boolean`             | `containsKey(Object key)` 如果此映射包含指定键的映射，则返回 `true` 。 |
        boolean b1 = map.containsKey("郭靖");
        boolean b2 = map.containsKey("杨康");
        System.out.println(b1);//true
        System.out.println(b2);//false
    }
}
