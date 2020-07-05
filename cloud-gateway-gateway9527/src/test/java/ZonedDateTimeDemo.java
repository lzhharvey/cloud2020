import java.time.ZonedDateTime;

/**
 * @ClassName ZonedDateTimeDemo
 * @Description TODO
 * @Author liuzhihui
 * @Date 2020/7/5 12:17
 * @Version 1.0
 **/
public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        //默认时区
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);
        //2020-07-05T12:19:02.779+08:00[Asia/Shanghai]
    }
}
