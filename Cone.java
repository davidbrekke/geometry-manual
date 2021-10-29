public class Cone {
    public float lengthOfSide(int radius, int height){
        return (float) Math.sqrt((radius * radius) + (height * height));
    }
    public float surfaceArea(int radius, int height){
        return (float) ( Math.PI * radius * ( radius + lengthOfSide(radius, height)));
    }
    public float volume(int radius, int height){
        return (float) ( Math.PI * ( radius * radius ) * ( height / 3 ));
    }
    public float lateralSurfaceArea(int radius, int height){
        return (float) ( Math.PI * radius * lengthOfSide(radius, height));
    }
}