###集合
集合中有两个基本的接口Collection和Map.  </br>

###collection下有三个主要的接口:set list Queue

###Set
set接口下的主要的实现类如下。  <br/>
```set集合用来去重，它是一个,无序不重复的集合，最多包含一个null元素Set最多有一个null元素。所有重复的内容是靠hashCode()和equals两个方法区分。``` <br/>
1.TreeSet  <br/>
    a.TreeSet是一个有序的集合,它的元素按照升序排序，默认是自然顺序排序。  <br/>
2.LinkedHashSet  <br/>
    a.底层是链表实现的，是set中唯一一个能保证怎么存就怎么取的集合对象。  <br/>
3.HashSet  <br/>
    a.HashSet是基于HashMap实现的，HashSet底层采用HashMap来保存所有元素.  <br/>
    b.hashCode和equal()是HashMap用的，因为不需要排序所以只需要关注定位和唯一性即可。  <br/>
    c.hashCode是用来计算hash值的，hash值是用来确定hash表索引的。  <br/>

###List
List接口下的主要实现类如下  <br/>
```List代表有序，重复的集合，设计到“栈”、“队列”，“链表”等操作，应该考虑用list。```
1.Vector  <br/>
    a.Vector,线程安全的，Vector实现了List接口，与ArrayList一样可以维护一个插入顺序，但ArrayList比Vector快，他是非同步的，若涉及到多线程，用Vector会比较好一点，在非多线程环境中，Vector对元素的查询，添加，删除和更新操作效果不是很好。  <br/>
    b.vector类底层是数组结构的，它包含可以使用整数索引进行访问的组件，不过，vector的大小可以根据需要增大或减小，以适应创建vector后进行添加或移除项的操作，因此不需要考虑元素是否越界或者会不会浪费内存的问题。  <br/>
2.ArrayList  <br/>
    a.可以初始化一个具有初始容量的list。默认容量是10.  <br/>
    b.因为底层是数组结构的所以遍历或者获取元素的时候有很大的优势，得益于下标索引。  <br/>
    c.但是ArrayList在插入中间元素或删除中间元素是存在劣势的。  <br/>
3.LinkedList  <br/>
    a.和ArrayList不同的是它是链表结构，LinkedList是非同步的。  <br/>
    b.LinkedList本质是双向链表。  <br/>
    c.LinkedList在随机增删方面比较擅长，数据量较大需要快速插入，删除元素的使用LinkedList。  <br/>

###Queue
Queue接口下的主要实现类如下  <br/>
```Queue接口和List,set同一级别，LinkedList实现了Queue接口，Queue接口窄化了对LinkedList的方法的访问权限```
1.PriorityQueue（优先队列）  <br/>
    a.实现了Queue接口，不允许放入null元素。  <br/>
    b.优先队列作用是能保证每次取出的都是队列之中权值最小的。  <br/>
    
###Map接口下的实现类
```map存放键值对时，健不能重复，判断key是否重复用equals来比较```
1.TreeMap  <br/>
    a.有序，非同步  <br/>
2.HashMap  <br/>
    a.最常用的map，访问速度快，无序，非同步。 允许null值和null键 <br/>
3.LinkedHashMap  <br/>
    a.有序的，按出入的顺序排序，遍历时比hashmap慢，有hashMap的所有特性。  <br/>
4.HashTable  <br/>
    a.和hashMap类似。是hashmap的线程安全版，支持线程同步。写入时hashtable效率较慢。不允许键或者值为空。  <br/>
