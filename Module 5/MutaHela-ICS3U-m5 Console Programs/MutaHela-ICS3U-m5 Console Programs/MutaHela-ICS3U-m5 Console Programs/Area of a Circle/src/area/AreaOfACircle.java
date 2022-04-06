package area;

/*
  *Created by M.Helal
  *On September 30
  *to calculate the area of a circle with a radius of 15
 */
public class AreaOfACircle {

    public static void main(String[] args) {
        int r;
        double pi, a;
        pi = 3.14159265359;
        r = 15;
        a = (pi * r * r); //calculate formula of a circle using variable "a" to represent area
        System.out.println("The area of a circle with a radius of " + r + "cm is approximately: " + a + "cm");
    }

}
