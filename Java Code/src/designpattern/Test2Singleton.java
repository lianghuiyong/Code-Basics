package designpattern;

/**
 * Created by Liang on 2017/5/18.
 * 单例示例
 * 挑战：如果并发的调用 getInstance，你的程序也可以正确的执行么？
 */
public class Test2Singleton {
    private  static Test2Singleton singleton = new Test2Singleton();

    public static Test2Singleton getInstance(){
        return singleton;
    }

    public static void main(String[] args){
        Test2Singleton singleton1 = Test2Singleton.getInstance();
        Test2Singleton singleton2 = Test2Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
