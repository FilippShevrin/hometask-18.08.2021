package Task6;

public class Student extends Arhiv {

    String str;
    double bull;


    public Student(String str, double bull) {
        this.str = str;
        this.bull = bull;
    }


    public String getName() {
        return str;
    }

    public void setName(String str) {
        this.str = str;
    }

    public double getBull() {
        return bull;
    }

    public void setBull(double bull) {
        this.bull = bull;
    }
}
