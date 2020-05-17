package ExceptionDemo;
//throw方法抛出异常
public class demo2 {
    public static void main(String[] args) {
        int a=4;
        int b=0;
        try{
            if (b==0) throw new ArithmeticException();//在方法体中抛出异常
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }
        System.out.println("程序结束。");
    }
}
