public class Cylinder {
    public float volume(int radius, int height){
        return (float) Math.PI * ( radius * radius ) * height;
    }
    public float surfaceArea(int radius, int height){
        return (float) (( 2 * Math.PI * radius * height ) + ( 2 * Math.PI * ( radius * radius )));
    }
    public float lateralSurfaceArea(int radius, int height){
        return (float) ( 2 * Math.PI * radius * height );
    }
    public float topBottomSurfaceArea(int radius){
        return (float) ( Math.PI * ( radius * radius ));
    }
}