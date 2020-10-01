import com.microsoft.demo.Demo;
import org.junit.Test;

@Category(com.microsoft.test.annotations.UnitTests.class)
public class MyUnitTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

    @Test
    public void test_method_2() {
    }
}
