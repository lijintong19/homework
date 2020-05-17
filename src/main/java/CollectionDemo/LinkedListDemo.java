package CollectionDemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        //需要快速增删时，使用LinkedList。
        List list=new LinkedList();

        //将指定的元素追加到列表的末尾
        list.add("你好啊");
        list.add("你好啊");
        list.add("上海");

        //在指定位置插入指定的元素
        list.add(0,"哈哈");

        //在该列表的开头插入指定的元素
        ((LinkedList) list).addFirst("北京");

        //在该列表的末尾插入指定元素
        ((LinkedList) list).addLast("武汉");

        System.out.println(list);

        //返回此列表中指定位置的元素
        System.out.println(list.get(1));

        //返回此列表的第一个元素
        System.out.println(((LinkedList) list).getFirst());

        //返回此列表的最后一个元素
        System.out.println(((LinkedList) list).getLast());

        //返回此列表中指定元素的第一次出现的索引
        System.out.println(list.indexOf("北京"));


    }
}
