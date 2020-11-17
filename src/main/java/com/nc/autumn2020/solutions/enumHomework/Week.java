package com.nc.autumn2020.solutions.enumHomework;

public enum Week {
    MONDAY("New iteration"),
    TUESDAY("Most productive day"),
    WEDNESDAY("It's a little Friday"),
    THURSDAY("Not a Hell, not a Heaven"),
    FRIDAY("Last battle is the hardest one"),
    SATURDAY("Remember! Red&White closes at 10 p.m."),
    SUNDAY("Today will be a good day, if u give me an aspirin");

    private String phrase;

    Week(String phrase){
        this.phrase = phrase;
    }

    public String phrase(){
        return phrase;
    }
}
