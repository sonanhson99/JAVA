class Rectangle implements IShape {
    private double length;
    private double width;
    public Rectangle(){

    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return 2*(length + width);
    }
}
