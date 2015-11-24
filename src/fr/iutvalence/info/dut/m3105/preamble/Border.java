package fr.iutvalence.info.dut.m3105.preamble;

public class Border implements Shape
{
	private int thickness;
	private Shape shape;

	public Border(int thickness, Shape shape)
	{
		this.thickness=thickness;
		this.shape=shape;
	}

	@Override
	public void draw(Position pos) 
	{
		System.out.println("This shape have been draw with a thickness of "+ this.thickness );
		this.shape.draw(pos);
	}
}
