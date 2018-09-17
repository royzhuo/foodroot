import org.springframework.stereotype.Component;

/**
 * Created by roy.zhuo on 2018/7/10.
 */

@Component
public class TestC {

    public TestC(){
        System.out.println("create c----------------------------------------");
    }

    public void testPrintln(){
        System.out.println("打印c");
    }
}
