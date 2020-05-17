package CollectionDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    //测试Treemap，treemap会对元素进行排序。
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 9;
        int d=11;

        TreeSet ts = new TreeSet();

        ts.add(c);
        ts.add(a);
        ts.add(b);
        ts.add(d);

        //TreeSet和hashSet类一样没有get()方法来获取列表中的元素，
        // 所以只能通过迭代器方法来获取
        Iterator it = ts.iterator();
        for (it=ts.iterator();it.hasNext();){
            String tmp=it.next().toString();
            System.out.println(tmp+" ");
        }
    }
}
