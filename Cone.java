// david magnuson
// Cone.java
// oct 28 2021

public class Cone {
    // calculate the length of the side of the cone
    public float lengthOfSide(int radius, int height){
        // using math library for all calulations
        return (float) Math.sqrt((radius * radius) + (height * height));
    }
    // calculate the surface area of the cone
    public float surfaceArea(int radius, int height){
        return (float) ( Math.PI * radius * ( radius + lengthOfSide(radius, height)));
    }
    // calculate the volume of the cone
    public float volume(int radius, int height){
        return (float) ( Math.PI * ( radius * radius ) * ( height / 3 ));
    }
    // calculate the lateral surface area of the cone
    public float lateralSurfaceArea(int radius, int height){
        return (float) ( Math.PI * radius * lengthOfSide(radius, height));
    }
}