// david magnuson
// CylinderTest.java
// oct 28 2021

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// test class for Cylinder
public class CylinderTest {
    @Test 
    // testing cylinder volume function
    public void testCylinderVolume() { 
      Cylinder cylinder = new Cylinder();
      float result = cylinder.volume(2, 3);
      assertEquals("cylinder volume", 37.69911, result, 5);
    }
}