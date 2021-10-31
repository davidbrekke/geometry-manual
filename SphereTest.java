// david magnuson
// SphereTest.java
// oct 28 2021

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// test class for sphere
public class SphereTest {
    @Test 
    // testing sphere volume function
    public void testSphereVolume() { 
      Sphere sphere = new Sphere();
      float result = sphere.volume(2);
      assertEquals("sphere volume", 25.132742, result, 5);
    }
}
