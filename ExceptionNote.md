###异常的分类
1.java中的所有异常，都继承自java.lang.Throwable类。  <br/>
2.Throwable有两个直接子类，Error类和Exception类。

###Error
Error是程序中无法处理的错误，表示运行引用程序中出现了严重的错误。此类错误一般表示
代码运行时JVM出现问题，通常有Virtual MachineError（虚拟机运行错误）
NoClassDefFoundError(类定义错误)等，jvm消耗完内存时，将出现OutOfMemoryError
此类错误发生时，JVM将终止线程。
此类错误是不可查的，非代码错误，因此发生这样的错误时，应用不应该去处理此类错误  <br/>

###Exception(异常)程序本身可以捕获并且可以处理的异常
Exception异常又分为两类：运行时异常和编译时异常。  <br/>
1.运行时异常（不受检异常）:RuntimeException类及其子类表示JVM在运行期间可能出现的错误。
比如说视图使用空值对象引用（NullPointerException）,数组下标越界
（ArrayIndexOutBoundException）。此类异常属于不可查异常，一般是由程序逻辑错误引起的。
在程序中可以选择捕获处理，也可以不处理。  <br/>

2.编译异常（受检异常）：Exception中除了RuntimeException及其子类之外的异常。
如果程序中出现此类异常，比如说IOException,必须对该异常进行处理，否则编译不通过。  <br/>

###异常处理流程
在java应用中，异常处理机制分为抛出异常和捕获异常。

抛出异常：当一个方法出现错误而引发异常时，该方法会将该异常类型以及异常出现时的
程序状态信息封装为异常对象，并交给本应用。运行时，该应用将寻找处理异常的代码并执行。
任何代码都可以通过throw关键词抛出异常。  <br/>

捕获异常：一旦方法抛出异常，系统自动根据该异常对象寻找合适异常处理器来
处理该异常。所谓合适类型的异常处理器指的是异常对象类型和异常处理器类型一致。  <br/>

###对于不同异常，java采用不同的异常处理方式
1.运行异常将由系统自动抛出，应用本身可以选择处理或者忽略该异常。  <br/>
2.对于方法中产生的Error，该异常一旦发生JVM将自行处理该异常，因此java允许应用不抛出此类异常。  <br/>
3.对于所有的可查异常，必须进行捕获或者抛出该方法之外交给上层处理，也就是当一个方法存在异常时，要么使用
try-catch捕获，要么使用该方法使用throws将该异常抛出给该方法的上层调用者。  <br/>

###uncheckedException
Java.lang.ArithmeticException
Java.lang.ArrayStoreExcetpion
Java.lang.ClassCastException
Java.lang.EnumConstantNotPresentException
Java.lang.IllegalArgumentException
Java.lang.IllegalThreadStateException
Java.lang.NumberFormatException
Java.lang.IllegalMonitorStateException
Java.lang.IllegalStateException
Java.lang.IndexOutOfBoundsException
Java.lang.ArrayIndexOutOfBoundsException
Java.lang.StringIndexOutOfBoundsException
Java.lang.NegativeArraySizeException’
Java.lang.NullPointerException
Java.lang.SecurityException
Java.lang.TypeNotPresentException
Java.lang.UnsupprotedOperationException

###ChedkedException
Java.lang.ClassNotFoundException
Java.lang.CloneNotSupportedException
Java.lang.IllegalAccessException
Java.lang.InterruptedException
Java.lang.NoSuchFieldException
Java.lang.NoSuchMetodException
