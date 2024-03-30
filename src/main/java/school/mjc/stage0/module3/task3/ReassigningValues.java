package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1, second = 10, third = 100;

        // Initial values
       // System.out.println("Initial values:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        // Reassigning references
        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;

        // Reassigning values
        first = 15;
        second = 6;
        third = 4;

        // Final values
       // System.out.println("Final values:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
    }
}



