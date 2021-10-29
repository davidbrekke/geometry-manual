public class Sphere {
    public float volume(int radius){
        return (float) ( Math.PI * ( radius * radius * radius ) * ( 4 / 3 ));
    }
    public float surfaceArea(int radius){
        return (float) ( 4 * Math.PI * ( radius * radius ));
    }
}