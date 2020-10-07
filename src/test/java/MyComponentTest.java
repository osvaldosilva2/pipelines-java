import com.microsoft.demo.Demo;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(com.microsoft.test.annotations.ComponentTest.class)
public class MyComponentTest {
    @Test
    public void comp_test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }
    
    @Test
    public void comp_test_method_2() {
    }
}
