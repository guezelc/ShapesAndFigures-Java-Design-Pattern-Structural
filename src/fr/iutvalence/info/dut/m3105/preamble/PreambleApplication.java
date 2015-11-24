package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Shape c1= new Circle(1);
		c1.draw(new Position(1,0));
		Shape c1wb1=new Border(5,c1);
		c1wb1.draw(new Position(1,0));
		
		CircleBuilder c2= new CircleBuilder(2);
		c2.toShape().draw(new Position(1,0));
		c2.border(3);
		c2.toShape().draw(new Position(1,0));
		c2.Shadow(15, 80);
		c2.toShape().draw(new Position(1,0));
		c2.SolidFill(120, 50,0);
		c2.toShape().draw(new Position(1,0));
	}

}
