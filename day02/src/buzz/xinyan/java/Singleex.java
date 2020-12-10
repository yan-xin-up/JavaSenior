package buzz.xinyan.java;

/**
 * @program: JavaSenior
 * @description: 懒汉式的线程安全
 * @author: ivan
 * @create: 2020-12-06 17:22
 */
public class Singleex {
    private Singleex() {

    }

    public static Singleex ins = null;

    private static Singleex getIns() {
//        //方式一，效率差
////        synchronized (Singleex.class) {
//            if (ins == null) {
//                ins = new Singleex();
//            }
//            return ins;
////        }
//         方式二  效率稍高
        if (ins == null) {
            synchronized (Singleex.class) {
                if (ins == null) {
                    ins = new Singleex();
                }
            }
        }
        return ins;

    }
}