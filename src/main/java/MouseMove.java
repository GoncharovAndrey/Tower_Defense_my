
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMove implements MouseListener, MouseMotionListener {

	private static int newX;
	private static int newY;
	private static Image image;
	private static boolean moved;
	Game game;
	private static int xForBuild;
	private static int yForBuild;
	private static boolean build;

	public MouseMove(Game game) {
		this.game = game;
	}

	public static Image getImage() {
		return image;
	}

	public static int getNewX() {
		return newX;
	}

	public static int getNewY() {
		return newY;
	}
	public static boolean towerInMove() {
		return moved;
	}

	public static boolean getBuild() {
		return build;
	}
	public static void  cleanForBuild() {
		xForBuild = 0;
		yForBuild = 0;
		image = null;
		build = false;
	}
	public static int getxForBuild() {
		return xForBuild;
	}

	public static int getyForBuild() {
		return yForBuild;
	}

	@Override
	public void mouseClicked(MouseEvent mouseEvent) {

	}

	@Override
	public void mousePressed(MouseEvent mouseEvent) {
		if (mouseEvent.getX() > 1400 && mouseEvent.getX() < 1470 && mouseEvent.getY() > 100 && mouseEvent.getY() < 170) {
			moved = true;
		}
	}

	@Override
	public void mouseReleased(MouseEvent mouseEvent) {
		newX = 0;
		newY = 0;
		moved = false;
		xForBuild = mouseEvent.getX();
		yForBuild = mouseEvent.getY();
		build = true;
	}

	@Override
	public void mouseEntered(MouseEvent mouseEvent) {

	}

	@Override
	public void mouseExited(MouseEvent mouseEvent) {

	}

	@Override
	public void mouseDragged(MouseEvent mouseEvent) {
		newX = mouseEvent.getX() - 32;
		newY = mouseEvent.getY() - 32;
		image = Tower.getImage("tower1");
		}


	@Override
	public void mouseMoved(MouseEvent mouseEvent) {

	}


}
