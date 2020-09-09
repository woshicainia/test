package demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class IteratorDemo01 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        collection.add("姚明");
        collection.add("科比");
        collection.add("詹姆斯");
        collection.add("林书豪");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.print(s + "  ");//姚明  科比  詹姆斯  林书豪
        }
    }
}
