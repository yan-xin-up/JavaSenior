package buzz.xinyan.exer;

/**
 * @descriptions: 懒汉式变更为线程安全使用同步机制
 * @author: Ivan
 * @date: 2021/3/3 14:31
 * @version: 1.0
 */
public class SingleModel {

}

class bank{
    private bank(){}  //构造器私有化

    private static bank instance = null;

    public static bank getInstance(){
        if(instance == null){
            instance = new bank();
        }
        return instance;
    }
}