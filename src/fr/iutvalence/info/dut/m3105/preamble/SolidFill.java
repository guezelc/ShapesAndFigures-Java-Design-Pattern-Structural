package fr.iutvalence.info.dut.m3105.preamble;

public class SolidFill implements Shape
{
	private int red;
	private Shape shape;
	private int yellow;
	private int blue;
	
	public SolidFill(int red, int yellow, int blue, Shape shape)
	{
		this.red=red;
		this.blue=blue;
		this.yellow=yellow;
		this.shape=shape;
	}
	@Override
	public void draw(Position pos) 
	{
		System.out.println("This shape have been draw with the color : \n -red "+ this.red+"\n -blue "+this.blue+"\n -yellow "+this.yellow+"\n");
		this.shape.draw(pos);
	}

}
