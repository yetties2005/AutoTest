import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:时间转化工具 date转为时间戳 时间戳转date 互相与String的转换，
 *              所有出现的String time 格式都必须为(yyyy-MM-dd HH:mm:ss)，否则出错
 * User: Arthur
 * Date: 2018-05-22
 * Time: 下午7:13
 */
public class TimeExchange {
    public static Date StringToDate(String time) {

        Date date = new Date();
        // 注意format的格式要与日期String的格式相匹配
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = dateFormat.parse(time);
            System.out.println(date.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return date;
    }
    public static String DateToString(Date time) {
        String dateStr = "";
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH/mm/ss");
        try {
            dateStr = dateFormat.format(time);
            System.out.println(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateStr;
    }
    public static Integer StringToTimestamp(String time){

        int times = 0;
        try {
            times = (int) ((Timestamp.valueOf(time).getTime())/1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(times==0){
            System.out.println("String转10位时间戳失败");
        }
        return times;

    }
    public static String timestampToString(Integer time){
        //int转long时，先进行转型再进行计算，否则会是计算结束后在转型
        long temp = (long)time*1000;
        Timestamp ts = new Timestamp(temp);
        String tsStr = "";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            //方法一
            tsStr = dateFormat.format(ts);
            System.out.println(tsStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tsStr;
    }
    public static Date TimestampToDate(Integer time){
        long temp = (long)time*1000;
        Timestamp ts = new Timestamp(temp);
        Date date = new Date();
        try {
            date = ts;
            //System.out.println(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }
    public static Integer DateToTimestamp(Date time){
        Timestamp ts = new Timestamp(time.getTime());

        return (int) ((ts.getTime())/1000);
    }
    public static void main(String [] args){
        System.out.println(StringToTimestamp("2011-05-09 11:49:45"));
        System.out.println(DateToTimestamp(TimestampToDate(StringToTimestamp("2011-05-09 11:49:45"))));
    }
}
