package CollectionDemo;

import java.util.Hashtable;

public class HashTableDemo {
    //线程安全的，不允许null值null键。
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();

        ht.put(1,"你好北京");
        ht.put(2,"哈哈哈");

        System.out.println(ht.get(2));

        System.out.println(ht.isEmpty());//测试这个map是否为空




    }
}
