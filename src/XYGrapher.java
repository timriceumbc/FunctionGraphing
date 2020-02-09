import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public abstract class XYGrapher extends JPanel{

	private JFrame frame;
	int xPixelStart, yPixelStart, pixelsWide,  pixelsHigh;
	abstract public Coordinate xyStart();
	abstract public double xRange();
	abstract public double yRange();
	abstract public Coordinate getPoint(int pointNum);
	public void drawGraph(int xPixelStart, int yPixelStart, int pixelsWide, int pixelsHigh){
		this.xPixelStart=xPixelStart;
		this.yPixelStart=yPixelStart;
		this.pixelsWide=pixelsWide;
		this.pixelsHigh=pixelsHigh;
		frame=new JFrame("Graph");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.setBounds(xPixelStart,yPixelStart,pixelsWide,pixelsHigh);
		frame.setVisible(true);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		double xStart=xyStart().getX();
		double yStart=xyStart().getY();

		g.setColor(Color.green);
		if(yStart<0&&yStart+yRange()>0)
			g.drawLine(0,(int)((((yStart+yRange())/yRange())*pixelsHigh)),pixelsWide,(int)((((yStart+yRange())/yRange())*pixelsHigh)));
		if(xStart<0&&xStart+xRange()>0)
			g.drawLine((int)((-xStart/xRange())*pixelsWide),0,(int)((-xStart/xRange())*pixelsWide),pixelsHigh);

		g.setColor(Color.black);
		Coordinate[] coordinates=new Coordinate[2];
		for(int i=0;getPoint(i)!=null;i++){
			coordinates[0]=coordinates[1];
			coordinates[1]=getPoint(i);

			if(i>0&&coordinates[0].drawFrom()&&coordinates[1].drawTo())
				g.drawLine((int)(((-xStart+coordinates[0].getX())/xRange())*pixelsWide),(int)(((yStart+yRange()-coordinates[0].getY())/yRange())*pixelsHigh),(int)(((-xStart+coordinates[1].getX())/xRange())*pixelsWide),(int)(((yStart+yRange()-coordinates[1].getY())/yRange())*pixelsHigh));
		}
	}

}