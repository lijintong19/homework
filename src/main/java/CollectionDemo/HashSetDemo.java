package CollectionDemo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //HashSet线程不同步

        HashSet hs=new HashSet();

        hs.add("上海");
        hs.add("武汉");
        hs.add("北京");

        //从此集合中删除所有的元素
        hs.clear();

        //克隆
        hs.clone();

        //判断是否为空
        hs.isEmpty();

        //删除指定的元素
        hs.remove("上海");

        //返回此集合中的元素数。
        System.out.println(hs.size());

        System.out.println(hs);
    }
}
