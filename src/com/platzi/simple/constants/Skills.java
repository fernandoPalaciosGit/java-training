package com.platzi.simple.constants;

import java.util.ArrayList;
import java.util.Objects;

public enum Skills {
    FRONT("frontend developer"),
    BACK("backend developer"),
    DB("database administrator");

    private String skillValue;
    private String skillName;

    Skills(String skill) {
        this.skillValue = skill.toLowerCase();
        this.skillName = this.name();
    }

    public boolean isSkillVAlidate(String selected) {
        boolean isValid = false;

        for (Skills skill : Skills.values()) {
            if (!selected.isEmpty() ||
                    Objects.equals(selected, skill.name().toLowerCase()) ||
                    Objects.equals(selected, skill.toString().toLowerCase())) {
                isValid = true;
                break;
            }
        }

        return isValid;
    }


    public String getValue() {
        return this.skillValue;
    }

    public String getName() {
        return this.skillName;
    }
}
