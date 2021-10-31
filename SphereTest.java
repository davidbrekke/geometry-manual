import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SphereTest {
    @Test 
    public void testSphereVolume() { 
      Sphere sphere = new Sphere();
      float result = sphere.volume(2);
      assertEquals("sphere volume", 25.132742, result, 5);
    }
}
