package LeetCode;


/**
 * Created by tvp100 on 2019/7/10.
 */
public class No_12 {
    public static void main(String[] args){
        int num = 1994;
        String str = "";
        while(num > 0) {
            if (num >= 1000) {
                for (int i = 1; i <= (num / 1000); ) {
                    str += "M";
                    num -= 1000;
                }
            } else if (num >= 900) {
                str += "CM";
                num -= 900;
            } else if (num >= 500) {
                for (int i = 1; i <= (num / 500); ) {
                    str += "D";
                    num -= 500;
                }
            } else if (num >= 400) {
                str += "CD";
                num -= 400;
            } else if (num >= 100) {
                for (int i = 1; i <= (num / 100); ) {
                    str += "C";
                    num -= 100;
                }
            } else if (num >= 90) {
                str += "XC";
                num -= 90;
            } else if (num >= 50) {
                str += "L";
                num -= 50;
            } else if (num >= 40) {
                str += "XL";
                num -= 40;
            } else if (num >= 10) {
                for (int i = 1; i <= (num / 10); ) {
                    str += "X";
                    num -= 10;
                }
            } else if (num >= 9) {
                str += "IX";
                num -= 9;
            } else if (num >= 5) {
                str += "V";
                num -= 5;
            } else if (num >= 4) {
                str += "IV";
                num -= 4;
            } else if (num >= 1) {
                for (int i = 1; i <= num; ) {
                    str += "I";
                    num--;
                }
            }
        }
        System.out.print(str);
    }
}
