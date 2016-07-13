package test.com.platzi.simple;

import main.com.platzi.simple.Developer;
import main.com.platzi.simple.constants.Skills;

import java.util.ArrayList;
import java.util.Calendar;

public class DeveloperTest implements Runnable {
    private static final Thread thread = new Thread(new DeveloperTest(), "Thread-developer");

    @Override
    public void run() {
        DeveloperTest.shouldInitializeProperties();
    }

    public static Thread getThread() {
        return DeveloperTest.thread;
    }

    private static void shouldInitializeProperties() {
        ArrayList<Skills> myDevSkills = Developer.getDefaultSkillList();
        Developer emilio = new Developer("Emilio Sanchez", 1.85F, (short) 1300, myDevSkills);
        emilio.setMyCalendarBirthDate((short) 1985, (byte) Calendar.DECEMBER, (byte) 11);
        emilio.printInformationInDocument();
        System.out.println(emilio.readInformationFromDocument());
    }
}