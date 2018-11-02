package com.POO;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Montagne");
        Robot robot2 = new Robot("Echo");
        Robot robot3 = new Robot("Thermite");
        Robot robot4 = new Robot("Kapkan");

        robot1.sePresenter();
        System.out.println("\n");
        robot2.sePresenter();

        ArrayList listeRobot = new ArrayList();
        listeRobot.add(robot1);
        listeRobot.add(robot2);
        listeRobot.add(robot3);
        listeRobot.add(robot4);

       //for (int i = 0; i <listeRobot.size() ; i++) { // demande que méthode soit static mais variables static & robots ont le meme nom
        //    Robot.sePresenter();
        //}

        for (Robot robot : listeRobot) {
            robot.sePresenter();
        }

    }
}
