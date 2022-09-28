import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
public class keyListener {
    // ------ Standard variables for mouse and keyboard ------
    public static KeyListener klis;
    public static int keypr;   // key pressed?
    public static int rkey;    // key   (for press/release)
    // ----------------------------------------------------
    static public void listener(enigma.console.Console cn) throws InterruptedException, IOException {
        // ------ Standard code for mouse and keyboard ------ Do not change
        klis=new KeyListener() {
            public void keyTyped(KeyEvent e) {}
            public void keyPressed(KeyEvent e) {
                if(keypr==0) {
                    keypr=1;
                    rkey=e.getKeyCode();
                }
            }
            public void keyReleased(KeyEvent e) {}
        };
        cn.getTextWindow().addKeyListener(klis);
        //Example code-------------------------------------------
        while(true) {
			Thread.sleep(50);
            if(keyListener.keypr==1) {                      // if keyboard button pressed
                if(keyListener.rkey==KeyEvent.VK_LEFT) {       
                    System.out.print("left");
                }
                else if(keyListener.rkey==KeyEvent.VK_RIGHT) {    
                	System.out.print("right");
                }
                else if(keyListener.rkey==KeyEvent.VK_ESCAPE) {    
                	break;
                }           
            }
            keyListener.keypr=0;    // last action;
        }
      //Example code-------------------------------------------
    }
}
