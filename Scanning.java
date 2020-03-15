package myPackage;

import java.util.Scanner;

public class Scanning {
    public static void scans(){
        Scanner scan  = new Scanner(System.in);
        String inputA = "";
        String strCheck = inputA.toLowerCase();
        boolean check = false;
        while(check){
            System.out.print("Welcome! Input Name: ");
            inputA = scan.nextLine();
            if(strCheck== "alice"){
                System.out.println("welcome Alice");
                check = true;
            }else if(strCheck == "alice"){
                System.out.println("welcome Bob");
                    check = true;
            }
        }
    }
}
