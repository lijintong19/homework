package ExceptionDemo;

public class demo1 {
    //throws通常用在声明方法时，用来指定方法可能抛出的异常，如果有多个异常，多个异常可使用逗号分隔。
    static void pop() throws NegativeArraySizeException{
        int[] arr =new int[-3];//此处会产生一个数组大小为负数的异常
    }

    public static void main(String[] args) {
        /*我们在主函数中调用了pop方法，因为该方法
        * 抛出了一个异常，我们需要处理该异常，通过
        * try-catch块来捕获并处理异常，如不处理异常，
        * 则程序将会中断正在执行的程序的正常的流程*/
        try {
            pop();
        }catch (NegativeArraySizeException e){
            System.out.println("pop方法抛出了一个异常");
        }
    }
}
