package fr.iutvalence.info.dut.m3105.preamble;

public class Shadow implements Shape
{
	private int angle;
	private int intensity;
	private Shape shape;

	public Shadow(int angle, int intensity,Shape shape)
	{
		this.angle=angle;
		this.intensity=intensity;
		this.shape=shape;
	}

	@Override
	public void draw(Position pos) 
	{
		System.out.println("This shape have been draw with a shadow of "+ this.angle+ " of angle and an intensity of "+this.intensity );
		this.shape.draw(pos);
	}
}
