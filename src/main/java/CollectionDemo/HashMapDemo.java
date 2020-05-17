package CollectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    /*1.访问速度快
    * 2.无序
    * 3.非同步
    * 4.最常用的Map,他根据健的HashCode值存储数据
    * 根据健可以直接获取它的值，有很快的访问速度。
    * 遍历时取的数据的顺序是完全随机的。
    * 5.允许健为空，但是不允许健重复，所以只能有一个健是null
    * 6.允许多条记录为空。
    * */

    public static void main(String[] args) {
        HashMap map=new HashMap();

        //将指定的键和指定的值相关联
        map.put(0,"哈哈哈");
        map.put(1,"北京");
        map.put(2,"上海");
        //允许null值和null键
        map.put(null,null);

        map.clear();//删除此map中的所有映射

        map.clone();//克隆

        map.get(2);//返回到指定键所映射的值，或null.

        map.isEmpty();//若此map不包含健值映射，则返回true。

        map.remove(0);//删除此map中指定的映射。

        map.size();//返回此map中健值映射的数量。

        //迭代器
        Iterator it=map.keySet().iterator();

        while (it.hasNext()){
            //获取key
            Integer key= (Integer) it.next();
            //根据key获取value
            String integ= (String) map.get(key);
            System.out.println(integ);
        }

    }
}
