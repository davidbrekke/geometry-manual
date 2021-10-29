import java.util.Scanner;

public class Geometry {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);  
    
    // greet user and prompt for entry
    System.out.println("-----\nWelcome to the Java Geometry Program!");
    System.out.println("Select from these Options:\n");
    System.out.println("1. Cylinder\n2. Sphere\n3. Cone\n0. Quit");
    
    int choice = reader.nextInt();

    if (choice == 1) {
      // prompt user for radius and height
      System.out.println("radius: ");
      int radius = reader.nextInt();
      System.out.println("height: ");
      int height = reader.nextInt();

      // create cylinder object and print calculated values
      Cylinder cylinder = new Cylinder();
      System.out.println("\n-----");
      System.out.println("volume: " + cylinder.volume(radius, height));
      System.out.println("surface area: " + cylinder.surfaceArea(radius, height));
      System.out.println("lateral surface area: " + cylinder.lateralSurfaceArea(radius, height));
      System.out.println("top or bottom surface area: " + cylinder.topBottomSurfaceArea(radius));
      System.out.println("-----\n");
    }
    else if (choice == 2) {
      // prompt user for radius
      System.out.println("radius: ");
      int radius = reader.nextInt();

       // create sphere object and print calculated values
      Sphere sphere = new Sphere();
      System.out.println("\n-----");
      System.out.println("surface area: " + sphere.surfaceArea(radius));
      System.out.println("volume: " + sphere.volume(radius));
      System.out.println("-----\n");
    }
    else if (choice == 3) {
      // prompt user for radius and height
      System.out.println("radius: ");
      int radius = reader.nextInt();
      System.out.println("height: ");
      int height = reader.nextInt();

       // create Cone object and print calculated values
      Cone cone = new Cone();
      System.out.println("\n-----");
      System.out.println("length of side: " + cone.lengthOfSide(radius, height));
      System.out.println("surface area: " + cone.surfaceArea(radius, height));
      System.out.println("volume: " + cone.volume(radius, height));
      System.out.println("lateral surface area: " + cone.lateralSurfaceArea(radius, height));
      System.out.println("-----\n");
    }
    else if (choice == 0) {
      System.exit(0);
    } 
    else {
      System.out.println("nope");
    }
    
    reader.close();
  }
}
