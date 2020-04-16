package LeetCode201_300;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeetCode202_HappyNumber {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.nextLine();
            int n = Integer.valueOf(input);
            System.out.println(isHappy(n));
        }
    }

    public static boolean isHappy(int n){
        List<Integer> list = new ArrayList<>();

        while(true){
            if(happy(n)==1){
                return  true;
            }else {
                if(list.contains(happy(n))) return false;
                else {
                    list.add(happy(n));
                    n=happy(n);
                }
            }
        }
    }

    public static int happy(int n){
        String input = String.valueOf(n);
        int sum = 0;
        for(int i = 0;i<input.length();i++){
            char c = input.charAt(i);
            int a = c-'0';
            sum += a*a;
        }
        return sum;
    }
}
