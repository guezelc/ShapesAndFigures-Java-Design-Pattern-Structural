package fr.iutvalence.info.dut.m3105.preamble;

public class Position 
{
	private int absicsse;
	private int ordonnee;

	public Position(int x,int y)
	{
		this.absicsse=x;
		this.ordonnee=y;
	}
	public int getX()
	{
		return this.absicsse;
	}
	
	public int getY()
	{
		return this.ordonnee;
	}
	
}
