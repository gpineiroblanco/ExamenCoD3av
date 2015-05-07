
package superficies;

/**
 *
 * @author gulle
 */
public class Vista {
    
    public void square(Modelo md){
         System.out.println("The area for your square: " + md.getArea());
    }
    public void rectangle(Modelo md){
        System.out.println("The area for your rectangle is: " + md.getArea());
    
    }
    public void triangle(Modelo md){
        System.out.println("The area for your triangle is: " + md.getArea());
    }
    public void circle(Modelo md){
        System.out.println("Your Circles area is " + md.getArea());
    }
}
