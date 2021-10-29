import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConeTest {
  @Test 
  public void testConeVolume() { 
    Cone cone = new Cone();
    float result = cone.volume(2, 3);
    assertEquals(12.56637, result);
  }

}
