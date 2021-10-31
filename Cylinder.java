// david magnuson
// Cylinder.java
// oct 28 2021

public class Cylinder {
    // calculate the volume of the cylinder
    public float volume(int radius, int height){
        return (float) Math.PI * ( radius * radius ) * height;
    }
    // calculate the surface area of the cylinder
    public float surfaceArea(int radius, int height){
        return (float) (( 2 * Math.PI * radius * height ) + ( 2 * Math.PI * ( radius * radius )));
    }
    // calculate the lateral surface area of the cylinder
    public float lateralSurfaceArea(int radius, int height){
        return (float) ( 2 * Math.PI * radius * height );
    }
    // calculate the top or bottom surface area of the cylinder
    public float topBottomSurfaceArea(int radius){
        return (float) ( Math.PI * ( radius * radius ));
    }
}