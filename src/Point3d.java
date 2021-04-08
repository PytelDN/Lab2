import java.util.Objects;

public class Point3d {

    private double x;
    private double y;
    private double z;

    public Point3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3d() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    protected String distanceTo(Point3d point3d){
        return String.format("%.2f",Math.abs(
                Math.sqrt(Math.pow(point3d.getX()-this.getX(),2)+
                        Math.pow(point3d.getY()-this.getY(),2)+
                        Math.pow(point3d.getZ()-this.getZ(),2)))).replace(',','.');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3d point3d = (Point3d) o;
        return Double.compare(point3d.x, x) == 0 &&
                Double.compare(point3d.y, y) == 0 &&
                Double.compare(point3d.z, z) == 0;
    }
}
