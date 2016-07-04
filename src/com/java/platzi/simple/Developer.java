package com.java.platzi.simple;

import com.java.platzi.simple.constants.Messages;
import com.java.platzi.simple.constants.Skills;

import java.util.ArrayList;

public class Developer extends Person {
    final byte ADULT_YEARS = 18;
    final byte RETIREMENT_YEARS = 65;

    private ArrayList<Skills> technicalSkillList;

    public Developer(float height, short monthSalary, ArrayList<Skills> skills) {
        super(height, monthSalary);
        this.setTechnicalSkillList(skills);
    }

    public static ArrayList<Skills> getDefaultSkillList() {
        ArrayList<Skills> skills = new ArrayList<>();
        skills.add(Skills.FRONT);
        skills.add(Skills.BACK);
        skills.add(Skills.DB);
        return skills;
    }

    private byte getValidateYears(byte yearValidation) {
        byte validYears = (byte) (yearValidation - super.getYears());
        return validYears <= 0 ? -1 : validYears;
    }

    public void setTechnicalSkillList(ArrayList<Skills> technicalSkillList) {
        this.technicalSkillList = technicalSkillList == null ? Developer.getDefaultSkillList() : technicalSkillList;
    }

    private byte getYearsToRetirement() {
        return getValidateYears(RETIREMENT_YEARS);
    }

    private byte getYearsToBeAdult() {
        return getValidateYears(ADULT_YEARS);
    }

    public String toStringSkills() {
        String message = "";

        for (Skills skill : this.technicalSkillList) {
            message += Messages.PERSONAL_SKILLS.getValue() + skill.getName() + ": " + skill.getValue();
        }

        return message;
    }

    @Override
    public String toStringFinancialData() {
        String message = super.toStringFinancialData();

        message += this.getYearsToBeAdult() != -1 ? Messages.YEARS_MINOR.getValue() : "";
        message += Messages.YEARS_RETIREMENT.getValue();
        message += this.getYearsToRetirement() != -1 ? this.getYearsToRetirement() + Messages.YEARS.getValue() : Messages.YEARS_OLDER.getValue();
        return message;
    }
}