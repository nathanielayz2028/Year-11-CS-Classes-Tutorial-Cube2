public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public Cube2(int side, String color) {
        this();
        this.color = color;
        basicCube.setSide(side);
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public void setSide(int side) {
        basicCube.setSide(side);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //the following methods have been started for you, but need to be completed
    public int calculateVolume() { return basicCube.calculateVolume();}
    public int calculateSurfaceArea() { return basicCube.calculateSurfaceArea();}
    public Cube2 add(Cube2 otherCube) {
        if (basicCube.getSide()*basicCube.getSide() + otherCube.getSide()*otherCube.getSide() != Math.pow((int)Math.sqrt(basicCube.getSide()*basicCube.getSide() + otherCube.getSide()*otherCube.getSide()), 2)) {
            throw new IllegalArgumentException("Cube lengths are not Pythagorean Triples.");
        }
        return new Cube2((int) Math.sqrt(basicCube.getSide()*basicCube.getSide() + otherCube.getSide()*otherCube.getSide()),this.color);
    }
    public Cube2 minus(Cube2 otherCube) {
        if (basicCube.getSide()*basicCube.getSide() - otherCube.getSide()*otherCube.getSide() != Math.pow((int)Math.sqrt(basicCube.getSide()*basicCube.getSide() - otherCube.getSide()*otherCube.getSide()), 2)) {
            throw new IllegalArgumentException("Cube lengths are not Pythagorean Triples.");
        }
        return new Cube2((int) Math.sqrt(basicCube.getSide()*basicCube.getSide() - otherCube.getSide()*otherCube.getSide()),this.color);
    }
    public boolean equals(Cube2 otherCube) {
        if (basicCube.getSide() == otherCube.getSide() && this.color == otherCube.color) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Cube{side=" + basicCube.getSide() + ", color=\"" + this.color + "\"}";
    }
}
