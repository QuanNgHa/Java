
## Example 1: AWTCounter

How to setup a basic AWT frame

* `setLayout()` (inherited from the superclass Frame) is used to set the layout of the container. 
* `FlowLayout` is used which arranges the components in left-to-right and flows into next row in a top-to-bottom manner.
* `setSize(), setTitle()` (inherited from the superclass Frame) to set the initial size and the title of the Frame.  
* `setVisible(true)` is then invoked to show the display.

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

* ` btnCount.addActionListener(this);` to setup the event-handling mechanism. Whenever the button is clicked, the actionPerformed() will be called. In the actionPerformed(), the counter value increases by 1 and displayed on the TextField.

## Inspecting Container/Components via toString()
```
System.out.println(this);
System.out.println(lblCount);
System.out.println(tfCount);
System.out.println(btnCount);
 
setVisible(true);  // "super" Frame shows
 
System.out.println(this);
System.out.println(lblCount);
System.out.println(tfCount);
System.out.println(btnCount);
```
The output (with my comments) are as follows. You could have an insight of the variables defined in the class.
```
// Before setVisible()
AWTCounter[frame0,0,0,250x100,invalid,hidden,layout=java.awt.FlowLayout,title=AWT Counter,resizable,normal]
      // name (assigned by compiler) is "frame0"; top-left (x,y) at (0,0); width/height is 250x100 (via setSize());
java.awt.Label[label0,0,0,0x0,invalid,align=left,text=Counter]
      // name is "Label0"; align is "Label.LEFT" (default); text is "Counter" (assigned in constructor)
java.awt.TextField[textfield0,0,0,0x0,invalid,text=0,selection=0-0]
      // name is "Textfield0"; text is "0" (assigned in constructor)
java.awt.Button[button0,0,0,0x0,invalid,label=Count]
      // name is "button0"; label text is "Count" (assigned in constructor)
      // Before setVisible(), all components are invalid (top-left (x,y), width/height are invalid) 
 
// After setVisible(), all components are valid
AWTCounter[frame0,0,0,250x100,layout=java.awt.FlowLayout,title=AWT Counter,resizable,normal]
      // valid and visible (not hidden)
java.awt.Label[label0,20,41,58x23,align=left,text=Counter]
      // Top-left (x,y) at (20,41) relative to the parent Frame; width/height = 58x23
java.awt.TextField[textfield0,83,41,94x23,text=0,selection=0-0]
      // Top-left (x,y) at (83,41) relative to the parent Frame; width/height = 94x23; no text selected (0-0)
java.awt.Button[button0,182,41,47x23,label=Count]
      // Top-left (x,y) at (182,41) relative to the parent Frame; width/height = 47x23
```

**Tip 1: How to close AWT Frame in Esclipe**
![image](https://user-images.githubusercontent.com/47073386/58379588-1c8a4d00-7fd8-11e9-8414-53e41424859f.png)

To exit this program, you have to close the CMD-shell (or press "control-c" on the CMD console); or push the "red" close button in Eclipse's Application Console. This is because we have yet to write the handler for the Frame's close button. 
