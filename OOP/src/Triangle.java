public class Triangle {
    private Point vertice1, vertice2, vertice3;
    public Triangle(Point vertice1, Point vertice2, Point vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.vertice1 = new Point(x1, y1);
        this.vertice2 = new Point(x2, y2);
        this.vertice3 = new Point(x3, y3);
    }
    public double getPerimeter() {
        double a = Math.sqrt(Math.pow(this.vertice1.getX() - this.vertice2.getX(), 2) + Math.pow(this.vertice1.getY() - this.vertice2.getY(), 2));
        double b = Math.sqrt(Math.pow(this.vertice2.getX() - this.vertice3.getX(), 2) + Math.pow(this.vertice2.getY() - this.vertice3.getY(), 2));
        double c = Math.sqrt(Math.pow(this.vertice3.getX() - this.vertice1.getX(), 2) + Math.pow(this.vertice3.getY() - this.vertice1.getY(), 2));
        return a + b + c;
    }
}
