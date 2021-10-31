// david magnuson
// ConeTest.java
// oct 28 2021

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// test class for cone
public class ConeTest {
    @Test 
    // testing cone volume function
    public void testConeVolume() { 
      Cone cone = new Cone();
      float result = cone.volume(2, 3);
      assertEquals("cone volume", 12.56637, result, 5);
    }
}