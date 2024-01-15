package cau2;

public class KG3chieu {
    private double x;
    private double y;
    private double z;

    public KG3chieu() {
    }

    public KG3chieu(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public double khoangCach(KG3chieu u) {
        double dX = x - u.getX();
        double dY = y - u.getY();
        double dZ = z - u.getZ();
        return Math.sqrt(dX*dX + dY*dY + dZ*dZ);
    }
}


