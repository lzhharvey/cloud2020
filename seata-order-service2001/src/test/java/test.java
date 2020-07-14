import com.lzh.springcloud.Order;
import com.lzh.springcloud.dao.OrderDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName test
 * @Description TODO
 * @Author liuzhihui
 * @Date 2020/7/14 23:06
 * @Version 1.0
 **/
@SpringBootTest
public class test {
    @Autowired
    private OrderDao orderDao;
//
//    @Test
//    public test(){
//        Order order=new Order();
//
//        orderDao.create();
//    }
}
