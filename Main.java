import java.awt.*;
import java.applet.*;
import java.util.Date;

public class Main extends Applet implements Runnable{
	Thread th;
	int location = 0;
	public void init(){
		th = new Thread(this);
		th.start();
		}
		
	public void paint(Graphics g){
		String news = "Hello to java programming course";
		g.drawString(news.toString(), location, 100);
		
		if(location >=-news.length()*7) {location ++;}
		
		if(location == getWidth()){location =-news.length()*7;}
	}
	public void run (){
			while(true){
				repaint();
				try{
				Thread.sleep(10); //you’ll need to catch an exception here
				}
				catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
	}
}