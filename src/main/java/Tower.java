import javax.swing.*;
import java.awt.*;

public class Tower {

	private static final String    pathToTower1 = "src/main/resources/tower_1.png";
	private static final String    pathToTower2= "src/main/resources/tower_2.png";

	public static Image getImage(String nameTower) {
		switch (nameTower) {
			case ("tower1"):
				return new ImageIcon(pathToTower1).getImage();
			case ("tower2"):
				return new ImageIcon(pathToTower2).getImage();
			default:
				break;
		}
		return null;
	}
}
