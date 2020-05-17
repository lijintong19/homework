package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //构造一个具有指定出事容量的空列表。会抛出IllegalArgumentException
        List list=new ArrayList(15);

        //将指定的元素追加到此列表ode末尾
        list.add("你好");
        list.add("你好啊");
        list.add("你好");

        //从列表中删除所有元素
        //list.clear();

        //在此列表中的指定位置插入指定的元素
        list.add(0,"上海");

        //get(int index)返回此列表中指定位置的元素
        System.out.println("获取的指定元素是："+list.get(0));

        //删除该列表中的指定位置的元素
        list.remove(2);

        //用指定的元素替换此列表中指定位置的元素
        list.set(1,"嘻嘻嘻");

        //返回此列表中的元素个数
        System.out.println(list.size());

        //使用迭代器进行遍历
        Iterator it=list.iterator();
        for (it=list.iterator();it.hasNext();){
           String tem=it.next().toString();
            System.out.println(tem);
        }

        List list1=new ArrayList();
        list1.addAll(list);
        list1.add("哈哈哈");

        System.out.println(list1);
    }
}
