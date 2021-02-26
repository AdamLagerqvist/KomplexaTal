import java.util.Objects;

public class Komplex {
    public double A;
    public double B;


    @Override
    public String toString() {
        return "(" + A +  " + " + B + "i)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return Double.compare(komplex.A, A) == 0 &&
                Double.compare(komplex.B, B) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(A, B);
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public void setA(double a) {
        A = a;
    }

    public void setB(double b) {
        B = b;
    }

    public Komplex(double a, double b) {
        this.A = a;
        this.B = b;
    }

    public Komplex add(Komplex k) {
        return new Komplex(this.A + k.getA(),this.B + k.getB());
    }


    public Komplex multiply(Komplex k) {
        return new Komplex(this.A * k.getA() - this.B * k.getB(),
                           this.A * k.getB() + this.B * k.getA());
    }
}
