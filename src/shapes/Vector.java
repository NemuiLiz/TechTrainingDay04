package shapes;

public class Vector {

    double x;
    double y;
    double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {}

    //Methods
    public Vector addVector(Vector vector) {
        double tempX = this.x + vector.getX();
        double tempY = this.y + vector.getY();
        double tempZ = this.z + vector.getZ();
        return new Vector(tempX, tempY, tempZ);
    }

    public Vector subVector(Vector vector) {
        double tempX = this.x - vector.getX();
        double tempY = this.y - vector.getY();
        double tempZ = this.z - vector.getZ();
        return new Vector(tempX, tempY, tempZ);
    }

    public Vector multiplyVector(double multiplier) {
        double tempX = this.x * multiplier;
        double tempY = this.y * multiplier;
        double tempZ = this.z * multiplier;
        return new Vector(tempX, tempY, tempZ);
    }

    public Vector dividePoint(double divider) {
        double tempX = this.x / divider;
        double tempY = this.y / divider;
        double tempZ = this.z / divider;
        return new Vector(tempX, tempY, tempZ);
    }

    public Vector crossProduct(Vector vector) {
        double x = this.getY() * vector.getZ() - this.getZ() * vector.getY();
        double y = this.getZ() * vector.getX() - this.getX() * vector.getZ();
        double z = this.getX() * vector.getY() - this.getY() * vector.getX();

        return new Vector(x, y, z);
    }

    public double scalarProduct(Vector vector) {
        return this.getX() * vector.getX()
                + this.getY() * vector.getY()
                + this.getZ() * vector.getZ();
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }


    //Get and Set

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

}
