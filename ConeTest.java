import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConeTest {
    @Test 
    public void testConeVolume() { 
      Cone cone = new Cone();
      float result = cone.volume(2, 3);
      assertEquals("cone volume", 12.56637, result, 5);
    }
}