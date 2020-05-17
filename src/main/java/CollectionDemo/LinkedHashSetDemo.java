package CollectionDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    //LinkedHashSet中元素是唯一的，不重复。
    //特点是，可以保证怎么存进去，就怎么取出来。
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet();

        lhs.add("hello3");
        lhs.add("hello1");
        lhs.add("hello2");

        System.out.println(lhs);
    }
}
