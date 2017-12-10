
import java.awt.*;
import java.applet.*;


public class NicoloFrisianiGraphicsLab02st extends Applet
{
	public void paint(Graphics g)
	{
		
		g.drawRect(10, 10, 1000, 600);	
	
		
		
		int y1 = 10;
		int x1 = 1010;
		int y2 = 10;
		int x2 = 10;
		int y3 = 10;
		int x3 = 1010;
		int y4 = 10;
		int x4 = 10;
		
		
		
		
		while (y1 <= 610 && x1 >= 10 ) {
		
			
		
			g.drawLine(1010, y1, x1, 610 );
			
			y1 += 12;
			x1 -= 20;
			
		}
		
		while (y2 <= 610 && x2 <= 1010) {
			
		
			
			g.drawLine(10, y2, x2, 610);
			
			y2 += 12;
			x2 += 20;
			
		}
		
		
		while (y3 <= 610 && x3 >= 10) {
			
			
			
			g.drawLine(10, y3, x3, 10);
			
			y3 += 12;
			x3 -= 20;
	}
		
		
		while (y4 <= 610 && x4 <= 1010) {
			
			
			g.drawLine(1010, y4, x4, 10);
			
			y4 += 12;
			x4 += 20;
		}
		
		
		
		
		
		
		
		
		
		
		int y5 = 160;
		int x5 = 760;
		int y6 = 160;
		int x6 = 260;
		int y7 = 160;
		int x7 = 760;
		int y8 = 160;
		int x8 = 260;
		
		
		
		
		while (y5 <= 460 && x5 >= 260 ) {
			
			
			
			g.drawLine(760, y5, x5, 460 );
			
			y5 += 6;
			x5 -= 10;
			
		}
		
		
		
		while (y6 <= 460 && x6 <= 760 ) {
			
			
			
			g.drawLine(260, y6, x6, 460 );
			
			y6 += 6;
			x6 += 10;
			
		}
		
		
		
		while (y7 <= 460 && x7 >= 260 ) {
			
			
			
			g.drawLine(260, y7, x7, 160 );
			
			y7 += 6;
			x7 -= 10;
			
		}
		
		
		
		
		while (y8 <= 460 && x8 <= 760 ) {
			
			
			
			g.drawLine(760, y8, x8, 160 );
			
			y8 += 6;
			x8 += 10;
			
		}
		
		
		
		
	}
}

