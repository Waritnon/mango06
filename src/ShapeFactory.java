public class ShapeFactory {
    public Shape getShape(int shapeCode){
        //
        // shapeCode 0 = square
        // shapeCode 1 = circle
        //
        switch (shapeCode){
            case 0:
                return new Square();
            default:
                return new Circle();
        }
    }
}
