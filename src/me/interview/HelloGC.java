package me.interview;

public class HelloGC {
    static byte [] b ;
    /**
     * 查看默认 jvm 默认的运行参数
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello world");
        while(true){
//            new Random().nextInt(100000000);
             b=new byte[100000000];
            System.out.println("--------");
        }


    }
}
