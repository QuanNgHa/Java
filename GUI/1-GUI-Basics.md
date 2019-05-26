
## Example 1: AWTCounter

How to setup a basic AWT frame
```
import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

//An AWT program inherits from the top-level container java.awt.Frame
public class AWTCounter extends Frame implements ActionListener{
	//class variables
  private Label lblCount;
	private TextField tfCount;
	private Button btnCount;   // Declare a Button component
	private int count = 0;     // Counter's value
	
	public AWTCounter() {
		setLayout(new FlowLayout());
        	// "super" Frame, which is a Container, sets its layout to FlowLayout to arrange
        	// the components from left-to-right, and flow to next row from top-to-bottom.
	
	    	setTitle("AWT Counter");  // "super" Frame sets its title
	    	setSize(250, 100);        // "super" Frame sets its initial window size
	 
	    	setVisible(true); // "super" Frame shows
	   	     
	}
	public static void main(String[] args) {
		// Invoke the constructor to setup the GUI, by allocating an instance
	      AWTCounter app = new AWTCounter();
	    // or simply "new AWTCounter();" for an anonymous instance

	}
}

```

Tip 1: How to close AWT Frame in Esclipe
![image](https://user-images.githubusercontent.com/47073386/58379588-1c8a4d00-7fd8-11e9-8414-53e41424859f.png)

To exit this program, you have to close the CMD-shell (or press "control-c" on the CMD console); or push the "red" close button in Eclipse's Application Console. This is because we have yet to write the handler for the Frame's close button. 
