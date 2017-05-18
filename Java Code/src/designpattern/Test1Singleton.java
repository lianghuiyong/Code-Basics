package designpattern;

/**
 * Created by Liang on 2017/5/18.
 * 单例示例
 *
 * 单例 是最为最常见的设计模式之一。对于任何时刻，如果某个类只存在且最多存在一个具体的实例，那么我们称这种设计模式为单例。
 * 例如，对于 class Mouse (不是动物的mouse哦)，我们应将其设计为 singleton 模式。你的任务是设计一个 getInstance
 * 方法，对于给定的类，每次调用 getInstance 时，都可得到同一个实例。
 */
public class Test1Singleton{
    private  static Test1Singleton singleton;

    public static Test1Singleton getInstance(){
        if (singleton == null){
            singleton = new Test1Singleton();
        }
        return singleton;
    }

    public static void main(String[] args){
        Test1Singleton singleton1 = Test1Singleton.getInstance();
        Test1Singleton singleton2 = Test1Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
