package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Superficies {

    private static Scanner sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String shapeType;
        Modelo md=new Modelo();
        Vista vis=new Vista();
        
        sc = new Scanner(System.in);

        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        shapeType = sc.nextLine();
        System.out.println("You said: " + shapeType);

        if (shapeType.equals("square")) {
            //add area calculations for square
            System.out.println("what is the side length?");
            md.setSidelength(sc.nextFloat());
            md.setArea(md.getSidelength()*md.getSidelength());
            vis.square(md);
        }
        if (shapeType.equals("rectangle")) {
            //add area calculations for rectangle here
            
            System.out.println("what is the rectangles width?");
            md.setSidelength(sc.nextFloat());
            System.out.println("What is the rectangles height?");
            md.setSideheigth(sc.nextFloat());
            md.setArea(md.getSidelength()*md.getSideheigth());
            vis.rectangle(md);
            
        }
        if (shapeType.equals("triangle")) {
            //add area calculations for triangle here
            
            System.out.println("What is the base length of the triangle?");
            md.setSidelength(sc.nextFloat());
            System.out.println("What is the height of the triangle?");
            md.setSideheigth(sc.nextFloat());
            md.setArea((float)(0.5 * md.getSidelength()* md.getSideheigth()));
            vis.triangle(md);

        }
        if (shapeType.equals("circle")) {
            //add area calculations for a circle here
           
            System.out.println("What is the radius of the circle?");
            md.setSidelength(sc.nextFloat());
            md.setArea((float)(3.14159265 * md.getSidelength()));
            vis.circle(md);

        }

    }
}
