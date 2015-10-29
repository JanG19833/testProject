import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class HelloWorldTest {
    HelloWorld helloWorld;

    @Before
    public void init(){
        helloWorld=new HelloWorld();
    }

    @Test
    public void testString(){
        assertEquals(helloWorld.testString(),"This is a test");
    }
    @Test
    public void notEqualsString(){
        assertNotEquals(helloWorld.testString(), "This is a tes");
    }


}
