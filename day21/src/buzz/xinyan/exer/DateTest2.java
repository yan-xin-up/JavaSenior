package buzz.xinyan.exer;

//import org.junit.Test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @program: JavaSenior
 * @description: "三天打渔两天晒网"   1990-01-01  xxxx-xx-xx 打渔？晒网？
 * @author: ivan
 * @create: 2020-12-20 21:44
 */
public class DateTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入时间显示打鱼还是晒网（格式：yyyy-MM-dd）");
        System.out.println("亲输入年份:");
        int yyyy = scan.nextInt();
        System.out.println("亲输入月份:");
        int MM = scan.nextInt();
        System.out.println("亲输入日期:");
        int dd = scan.nextInt();

        DateTest2 dateTest2 = new DateTest2();
        try {
            dateTest2.getFishOrNet(yyyy,MM,dd);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void getFishOrNet(int yyyy,int MM,int dd) throws ParseException {

        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR, yyyy);
        calendar.set(yyyy,MM,dd);
//        Date date3 = new Date();
//        calendar.setTime(date3);
//        int i = calendar.get(calendar.DAY_OF_YEAR);
//        System.out.println(i);
        int dayThisyear = calendar.get(calendar.DAY_OF_YEAR);
        System.out.println(dayThisyear);
        int dayAll = 0;
        int dayTotal;
        for(int y = 1990;y < yyyy;y++){
            if(y % 4 == 0 && y % 100!=0 || y % 400 ==0){
                dayAll+=366;
            }else{
                dayAll+=365;
            }
        }
        System.out.println(dayAll);
        dayTotal = dayAll + dayThisyear;
        System.out.println(dayTotal);
        //way-02
//        Date date1 = new Date();
//        System.out.println(date1.getTime());
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date2 = sdf.parse("1990-1-1");
////        System.out.println(format);
//        System.out.println(date2.getTime());
//        long daycha = date1.getTime() - date2.getTime();
//        long  finalday = daycha/1000*60*60*24;
//        System.out.println(date2);
//        System.out.println((daycha/(1000*60*60*24))+1);

        switch (dayTotal % 5){
            case 0:
                System.out.println("晒网");
                break;
            case 1:
                System.out.println("打鱼");
                break;
            case 2:
                System.out.println("打鱼");
                break;
            case 3:
                System.out.println("打鱼");
                break;
            default:
                System.out.println("晒网");
                break;
        }

    }
}
