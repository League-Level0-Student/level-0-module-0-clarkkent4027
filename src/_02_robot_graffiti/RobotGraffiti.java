package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot clark=new Robot();
		clark.setSpeed(100);
		clark.penDown();
		clark.move(250);
		clark.turn(125);
		clark.move(95);
		clark.turn(35);
		clark.move(95);
		clark.turn(35);
		clark.move(95);
		clark.turn(35);
		clark.move(95);
		clark.penUp();
		clark.turn(215);
		clark.move(200);
}
}