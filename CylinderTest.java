import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CylinderTest {
  @Test 
  public void testCylinderVolume() { 
    Cylinder cylinder = new Cylinder();
    float result = cylinder.volume(2, 3);
    assertEquals(37.69911, result);
  }

}
