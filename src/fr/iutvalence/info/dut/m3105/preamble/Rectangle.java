package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle implements Shape
{
	private int height;
	private int width;
	public Rectangle(int width, int height)
	{
		this.width=width;
		this.height=height;
	}
	@Override
	public void draw(Position pos)
	{
		System.out.println("Rectangle the position "+ pos+ " width : "+ this.width+" height : "+this.width);
		
	}

}
