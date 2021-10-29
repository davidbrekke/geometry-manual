import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SphereTest {
  @Test 
  public void testSphereVolume() { 
    Sphere sphere = new Sphere();
    float result = sphere.volume(2);
    assertEquals(33.51032, result);
  }
}
