import org.junit.Assert;
import org.junit.Test;

public class TestStringTransformer {

    @Test
    public void testStr(){
        StringTransformer tr = new StringTransformer();
        String actual = tr.interviewRecursionTest("hello");
        Assert.assertEquals("h*e*ll*o", actual);
    }
}
