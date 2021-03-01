import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;
    public PolyLine() {
        this.points = new ArrayList<Point>();
    }
    public PolyLine(List<Point> points) {
        this.points = points;
    }
    public void appendPoint(Point point) {
        this.points.add(point);
    }
    public void appendPoint(int x, int y) {
        this.points.add(new Point(x, y));
    }
    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += Math.sqrt((Math.pow(points.get(i).getX() - points.get(i + 1).getX(), 2)) + (Math.pow(points.get(i).getY() - points.get(i + 1).getY(), 2)));
        }
        return length;
    }
}
