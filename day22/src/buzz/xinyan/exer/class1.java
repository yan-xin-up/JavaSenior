package buzz.xinyan.exer;

/**
 * @descriptions: exer
 * @author: Ivan
 * @date: 2020/12/28 14:16
 * @version: 1.0
 */
public class class1{
    String str = new String("Girl");
    char ch[ ]={'d','b','c'};
    public static void main(String args[ ]){
        class1 x=new class1( );
        x.change(x.str,x.ch);
        System .out .println(x.str +" and "+x.ch[0]+x.ch[1]+x.ch[2]);
    }
    public void change(String str,char ch[ ]){
        str="Boy"; ch[0]='a';
    } }
