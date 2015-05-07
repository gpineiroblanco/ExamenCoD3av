/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

/**
 *
 * @author gulle
 */
public class Modelo {
    
    public float sideheigth;
    public float sidelength;
    public float area;

    public Modelo() {
    }

    public Modelo(float sidelength, float area) {
        this.sidelength = sidelength;
        this.area = area;
    }

    public Modelo(float sideheigth, float sidelength, float area) {
        this.sideheigth = sideheigth;
        this.sidelength = sidelength;
        this.area = area;
    }

    public float getSideheigth() {
        return sideheigth;
    }

    public void setSideheigth(float sideheigth) {
        this.sideheigth = sideheigth;
    }

    public float getSidelength() {
        return sidelength;
    }

    public void setSidelength(float sidelength) {
        this.sidelength = sidelength;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    
    
}
