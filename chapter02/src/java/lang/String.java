package java.lang;

public class String {

    static{
        System.out.println("我是自定义的String类的静态代码块");
    }

    // 错误：在类java.lang.String中找不到main方法
    public static void main(String[] args) {
        System.out.println("hello,String");
    }

}
