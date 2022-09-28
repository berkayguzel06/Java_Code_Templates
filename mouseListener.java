import enigma.event.TextMouseEvent;
import enigma.event.TextMouseListener;
public class mouseListener {
	public static int mousepr;          // mouse pressed?
    public static int mousex;   // mouse text coordinates.
	public static int mousey;
	public static TextMouseListener tmlis; 
	static public void listener(enigma.console.Console cn) throws InterruptedException {
		tmlis=new TextMouseListener() {                       // mouse listener standart code
			public void mouseClicked(TextMouseEvent arg0) {}
			public void mousePressed(TextMouseEvent arg0) {
				 if(mousepr==0) {
				    mousepr=1;
				    mousex=arg0.getX();
				    mousey=arg0.getY();
				 }
			}
		    public void mouseReleased(TextMouseEvent arg0) {}
		};
		cn.getTextWindow().addTextMouseListener(tmlis);    // adding text mouse listener
		//Example code-------------------------------------------
		while(true) {
			Thread.sleep(50);
			if(mouseListener.mousepr==1) {
				int px=mouseListener.mousex;
				int py=mouseListener.mousey;
				Console.cn.getTextWindow().setCursorPosition(px, py);
				System.out.print("O");
			}
			if(mouseListener.mousex==1&&mouseListener.mousey==1) {
				break;
			}
			mouseListener.mousepr=0;
		}
		//Example code-------------------------------------------
	}
}
