package cl.task;

import java.util.Scanner;

public class ReadIntegerFromTerminal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Integer num = null;
        Integer highestNum = null;
        Integer lowestNum = null;
        Integer sumAllNum = 0;
        Integer sumAllPositive = 0;
        Integer sumAllNegative = 0;

        do {
            num = scanner.nextInt();
            if(highestNum == null || highestNum < num) {
                highestNum = num;
            }
            if(lowestNum == null || lowestNum > num){
                lowestNum = num;
            }
            sumAllNum = sumAllNum + num;
            if(num>0){
                sumAllPositive = sumAllPositive + num;
            }else if(num<0){
                sumAllNegative = sumAllNegative + num;
            }


        }while (num != -1);

        System.out.println(String.format("highest number is %d",highestNum));
        System.out.println(String.format("lowest number is %d",lowestNum));
        System.out.println(String.format("total of all numbers is %d",sumAllNum));
        System.out.println(String.format("total of all positive numbers is %d",sumAllPositive));
        System.out.println(String.format("total of all negative numbers is %d",sumAllNegative));
    }
}
