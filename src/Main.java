/*
Joshua Lambert
CSCI3201
HW 2
*/

public class Main {

    public static void main(String[] args) {

        System.out.println("AND logic table");
        System.out.println("-------------------");
        System.out.println("1  |  1   |  " + (true && true));
        System.out.println("0  |  1   |  " + (false && true));
        System.out.println("1  |  0   |  " + (true && false));
        System.out.println("0  |  0   |  " + (false && false) + "\n");

        System.out.println("OR logic table");
        System.out.println("-------------------");
        System.out.println("1  |  1   |  " + (true || true));
        System.out.println("0  |  1   |  " + (false || true));
        System.out.println("1  |  0   |  " + (true || false));
        System.out.println("0  |  0   |  " + (false || false) + "\n");

        System.out.println("NOT logic table");
        System.out.println("-------------------");
        System.out.println("0  |  " + !true);
        System.out.println("1  |  " + !false);

    }
}
