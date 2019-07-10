package LeetCode;

/**
 * Created by tvp100 on 2019/7/10.
 */
public class No_13 {
    public static void main(String[] args){
            int score = 0;
            int tip = 0;
            String s = "MCMXCIV";
            char[] a = s.toCharArray();
            for(int i = a.length - 1; i >= 0; i--){
                if(a[i] == 'I'){
                    score++;
                }else if(a[i] == 'V'){
                    if(i == 0)
                        score += 5;
                    else if(a[i-1] == 'I') {
                        score += 4;
                        tip++;
                    }
                    else
                        score += 5;
                }else if(a[i] == 'X'){
                    if(i == 0)
                        score += 10;
                    else if(a[i-1] == 'I') {
                        score += 9;
                        tip++;
                    }
                    else
                        score += 10;
                }else if(a[i] == 'L'){
                    if(i == 0)
                        score += 50;
                    else if(a[i-1] == 'X') {
                        score += 40;
                        tip += 10;
                    }
                    else
                        score += 50;
                }else if(a[i] == 'C'){
                    if(i == 0)
                        score += 100;
                    else if(a[i-1] == 'X') {
                        score += 90;
                        tip += 10;
                    }
                    else
                        score += 100;
                }else if(a[i] == 'D'){
                    if(i == 0)
                        score += 500;
                    else if(a[i-1] == 'C') {
                        score += 400;
                        tip += 100;
                    }
                    else
                        score += 500;
                }else if(a[i] == 'M'){
                    if(i == 0)
                        score += 1000;
                    else if(a[i-1] == 'C') {
                        score += 900;
                        tip += 100;
                    }
                    else
                        score += 1000;
                }
            }
            score -= tip;
            System.out.print(score);
    }
}
