import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CylinderTest {
    @Test 
    public void testCylinderVolume() { 
      Cylinder cylinder = new Cylinder();
      float result = cylinder.volume(2, 3);
      assertEquals("cylinder volume", 37.69911, result, 5);
    }
}