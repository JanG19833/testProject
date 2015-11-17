


import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;


public class HelloWorldTest {
    HelloWorld helloWorld;

    @Before
    public void init(){
        helloWorld=new HelloWorld();
    }

    @Test
    public void testString(){
        Assert.assertEquals(helloWorld.testString(),"This is a test");
    }
    @Test
    public void notEqualsString(){
        Assert.assertNotEquals(helloWorld.testString(), "This is a tes");
    }


}
