// david magnuson
// Sphere.java
// oct 28 2021

public class Sphere {
    // calculate the volume of the sphere
    public float volume(int radius){
        return (float) ( Math.PI * ( radius * radius * radius ) * ( 4 / 3 ));
    }
    // calculate the surface area of the sphere
    public float surfaceArea(int radius){
        return (float) ( 4 * Math.PI * ( radius * radius ));
    }
}