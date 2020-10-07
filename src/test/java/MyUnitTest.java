import com.microsoft.demo.Demo;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(com.microsoft.test.annotations.UnitTest.class)
public class MyUnitTest {
    @Test
    public void unit_test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

    @Test
    public void unit_test_method_2() {
        assert(1 > 9);
    }
    
    @Test
    public void unit_test_method_3() {
    }
    
}
