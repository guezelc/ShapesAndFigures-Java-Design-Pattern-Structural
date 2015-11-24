package fr.iutvalence.info.dut.m3105.preamble;

public class Circle implements Shape
{
	private int rayon;

	public Circle(int rayon)
	{
		this.rayon=rayon;
	}
	
	@Override
	public void draw(Position pos) 
	{
		System.out.println("Circle at the position : "+ pos +" and of radius : "+ this.rayon );				
	}
	
}
