package designpattern;

/**
 * Created by Liang on 2017/5/18.
 * 单例示例
 */
public class Test1Singleton{
    private  static Test1Singleton singleton;

    public static Test1Singleton getInstate(){
        if (singleton == null){
            singleton = new Test1Singleton();
        }
        return singleton;
    }

    public static void main(String[] args){
        Test1Singleton singleton1 = Test1Singleton.getInstate();
        Test1Singleton singleton2 = Test1Singleton.getInstate();

        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
