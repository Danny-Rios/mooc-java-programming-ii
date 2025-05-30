


public class Checker {

    public Checker() {
    }

    public boolean isDayOfWeek(String string) {

        if (string.toLowerCase().matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }
        return false;

    }

    public boolean allVowels(String string) {

        if (string.toLowerCase().matches("^[aeiou]*")) {         //^[aeiou]
            return true;
        }
        return false;

    }

    public boolean timeOfDay(String string) {
        //had to read this info else where as I didn't find the reading matierlaon  mooc.fi enought. I used java core vol 2
        String time = "(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])";
        return string.matches(time);
        //you just had to get creative. you didn't need to find other material.
    }

}
