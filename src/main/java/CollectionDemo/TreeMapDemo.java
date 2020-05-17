package CollectionDemo;

import java.util.TreeMap;

public class TreeMapDemo {
    /*
    * 1.有序的
    * 2.不允许健为空
    * 3.实现了sortMap接口，能够把它保存的记录根据健值排序，默认是按
    * 健值对的升序排序*/
    public static void main(String[] args) {
        TreeMap treeMap=new TreeMap();

        //通过put()向treemap中添加元素
        treeMap.put(0,"你好");
        treeMap.put(1,"北京");
        treeMap.put(2,null);


        //返回指定健所映射的值。
        System.out.println(treeMap.get(1));
        System.out.println(treeMap.get(2));

        System.out.println(treeMap);
    }
}
