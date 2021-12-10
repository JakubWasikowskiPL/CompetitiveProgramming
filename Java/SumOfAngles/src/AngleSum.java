//Find the total sum of internal angles (in degrees) in an n-sided simple polygon. N will be greater than 2.
public class AngleSum {
    public static void main(String[] args) {
        System.out.println(sumOfAngles(3));
    }
    public static int sumOfAngles(int n) {
        return (n-2)*180;
    }
}
