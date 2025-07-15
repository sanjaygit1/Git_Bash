package FrameWork;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliEx {

	public static void main(String[] args) throws Throwable {

		Screen scr = new Screen();

		Pattern mini = new Pattern("C:\\Users\\Shobha\\Downloads\\minimizeBar.png");
		scr.click(mini);

		Pattern search = new Pattern("C:\\Users\\Shobha\\Downloads\\searchBar.png");
		scr.type(search, "NotePad");

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		Pattern page = new Pattern("C:\\Users\\Shobha\\Downloads\\page.png");
		scr.type(page, "Qspiders");

	}

}
