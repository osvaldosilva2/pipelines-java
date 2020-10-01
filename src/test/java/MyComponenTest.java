import com.microsoft.demo.Demo;
import org.junit.Test;

@Category(com.microsoft.test.annotations.ComponentTests.class)
public class MyComponentTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

    @Test
    public void test_method_2() {
    }
}
