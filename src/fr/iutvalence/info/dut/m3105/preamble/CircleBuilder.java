package fr.iutvalence.info.dut.m3105.preamble;

public class CircleBuilder 
{
	
	private Shape circle;

	public CircleBuilder(int radius)
	{
		this.circle= new Circle(radius);
	}
	
	public CircleBuilder border(int thickness)
	{
		this.circle= new Border(thickness,circle);
		return this;
	}
	
	public CircleBuilder Shadow(int angle, int intensity)
	{
		this.circle= new Shadow(angle,intensity,circle);
		return this;
	}
	
	public CircleBuilder SolidFill(int red, int yellow, int blue)
	{
		this.circle= new SolidFill(red,yellow,blue,circle);
		return this;
		
	}
	
	public Shape toShape() {
		return circle;
	}
}
