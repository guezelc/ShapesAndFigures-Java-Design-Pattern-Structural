package fr.iutvalence.info.dut.m3105.preamble;

public class Circle implements Shape
{
	private int radius;

	public Circle(int rayon)
	{
		this.radius=rayon;
	}
	
	@Override
	public void draw(Position pos) 
	{
		System.out.println("Circle at the position : ("+ pos.getX() +","+pos.getY()+") and of radius : "+ this.radius );				
	}
	
}
