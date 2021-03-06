package test;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;

public class Tranform {
    private int x, y;
    private Component component;
    public Tranform() {
    	
    }
    public Tranform(Component component) {
    	this.component = component;
    }
    public void setComponent(Component com) {
    	component = com;
    }
    public void traslate(int x, int y) {
    	this.x = x;
    	this.y = y;
    	//Logic 
    	Point point = component.getLocation();
        int calX = x + (int) point.getX();
        int calY = y + (int) point.getY();
        component.setLocation(calX, calY);
        
    }
    public void traslateX(int x) {
    	this.x = x;
    	
    	Point point = component.getLocation();
        int calX = x + (int) point.getX();
        component.setLocation(calX, (int) point.getY());
    }
    public void traslateY(int y) {
    	this.y = y;
    
    	Point point = component.getLocation();
        int calY = y + (int) point.getY();
        component.setLocation((int) point.getX(), calY);
    }
    public void skew(int x, int y) {
    	this.x = x;
    	this.y = y;
    	// Logic
    	
    	int calX = x + component.getWidth();
    	int calY = y + component.getHeight();
    	component.setSize(new Dimension(calX, calY));
    }
    public void skewX(int x) {
    	this.x = x;
    	// Logic
    	
    	int calX = x + component.getWidth();
    	component.setSize(new Dimension(calX, component.getHeight()));
    }
    public void skewY(int y) {
    	this.y = y;
    	// Logic
    	int calY = y + component.getHeight();
    	component.setSize(new Dimension(component.getWidth(), calY));
    }
     
}
