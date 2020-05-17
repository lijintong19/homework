package CollectionDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //线程不安全的
        PriorityQueue pq=new PriorityQueue();

        //将指定的元素插入到优先级队列中
        pq.add("嘿嘿");

        //删除此优先级队列中的所有元素
        pq.clear();

        //如果此队列包含指定的元素，则返回true
        pq.contains("嘿嘿");

        //将指定的元素插入到此优先级队列中
        pq.offer("嘻嘻");

        //移除指定的元素。
        pq.remove("嘿嘿");

        //检索但不删除此队列的头，如果次队列为空则返回null
        pq.peek();

    }
}
