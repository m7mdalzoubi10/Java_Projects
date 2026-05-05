public class Main
{
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10 , 6);
		
		System.out.println("Rectangle 1 \nwidth:"+ r1.width + " height: " + r1.height );
		System.out.println("Area:" + r1.getArea() + " Perimeter: " + r1.getArea());
	
	    System.out.println("--------------------------");
	    
	    System.out.println("Rectangle 2 \nwidth: "+ r2.width + " height: " + r2.height );
		System.out.println("Area:" + r2.getArea() + " Perimeter: " + r2.getArea());
	    
	}
}

class Rectangle
{
    double width = 1;
    double height = 1;
    
    public Rectangle() {}
    
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){ return width*height; }
    public double getPerimeter(){return 2 * (width+height);}
}