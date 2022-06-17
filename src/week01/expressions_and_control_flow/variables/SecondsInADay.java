package week01.expressions_and_control_flow.variables;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int currentSecondSpent = ((currentHours*60*60)+currentMinutes*60+currentSeconds);
        int secondsADay = (24*60*60);
        System.out.println("There are "+ (secondsADay-currentSecondSpent) + "seconds left");

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above
    }
}
