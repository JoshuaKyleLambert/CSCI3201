/**
 * Created by Joshua Lambert on 8/16/2017.
 * CSCI3201 HW1 Binary WarmUP
 */
public class BinaryWarmUp {
        public static void main(String[] args) {
                System.out.format("DECI   BIN  HEX%n");
            for ( int i = 0; i < 16 ; i++) {
                System.out.format("%4d  %4s %4x %n", i , Integer.toBinaryString(i), i);
            }
        }
}
