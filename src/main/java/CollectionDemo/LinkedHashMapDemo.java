package CollectionDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap lm=new LinkedHashMap();

        //根据键值对插入
        lm.put("你好","上海");
        lm.put(2,"北京");

        //获取指定键值的元素。
        System.out.println(lm.get(2));

        lm.clear();//删除所有映射



    }
}
