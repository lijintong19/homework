package CollectionDemo;

import java.util.Vector;
/*以下为Vector的一些方法
        Vector();构造一个空向量，使其内部数据数组的大小为10，
        其标准容量为零。Vector vec=new Vector();
        1.boolean add(E,e);  将指定的元素添加到此向量的末尾
        2.void addElement(E obj); 将指定的组件添加到此向量的末尾，将其大小增加1.
        3.void add(int index,E e);在此向量指定位置插入指定的元素。
        4.boolean addAll(Collection c); 将指定集合中的所有元素添加到此向量的末尾。
        5.int capacity(); 返回此向量当前的容量
        6.boolean contains(object o); 如果此向量包含指定的元素，返回true
        7.boolean containsAll(Collection c);如果此向量包含指定集合中所有的元素，则返回true。
        8.void copyInto(Object[] anArray);将此向量的组件复制到指定的数组中。
        9.elementAt(int index); 返回指定索引处的组件。
        10.Enumeration<E> elements(); 返回此向量的组件的枚举。
        11.void ensureCapacity(int minCapacity);增加此向量的容量。
        * */
public class VectorDemo {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("abc1");
        v.add("abc2");
        v.add("abc3");
        v.add("abc4");
        System.out.println(v);
        int m=v.capacity();
        System.out.println(m);

        Vector v1=new Vector();
        v1.addElement("abc1");
        v1.addElement("abc2");
        v1.addElement("abc3");
        v1.addElement("abc4");
        v1.addElement("abc5");
        v1.addElement("abc6");
        v1.addElement("abc7");
        v1.addElement("abc8");
        v1.addElement("abc9");
        v1.addElement("abc10");
        v1.addElement("abc11");

        System.out.println(v1);
        int n=v1.capacity();
        System.out.println(n);

        System.out.println(v.equals(v1));
    }
}
