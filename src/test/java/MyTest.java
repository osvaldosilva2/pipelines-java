import com.microsoft.demo.Demo;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(com.microsoft.test.annotations.SmokeTest.class)
public class MyTest {
    @Test
    public void main_test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);        
    }
}
