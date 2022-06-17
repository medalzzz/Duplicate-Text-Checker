
/*
    Project "Duplicate Text Checker" to remove found duplicates from string

        by: Hieron A. Soares

    Simple project made just for practicing/playing
*/

import java.util.Scanner;

class Duplicate{

    public static void main(String[] args){

        System.out.print("Enter your message: ");//ask input
        Scanner sc = new Scanner(System.in);//scans input
        String msg = sc.nextLine();//parses input to actual var
        sc.close();//closes scanner
        msg = msg.replace(",", "");//removes commas, if there's any
        String[] split = msg.split(" ");//split string on array based on spaces
        msg="";//removes text from var

        
        for (int i=0;i<split.length;i++){
            for (int j=0;j<split.length;j++){
                if(i!=j && split[i].equals(split[j])){
                    split[j]="null";//adding null as string to prevent .lang exceptions
                }
            }

            //if index value is not null, adds it to msg var
            if(!split[i].equals("null")){
                msg = msg + " " + split[i];
            }
        }

        msg=msg.trim();//removes spaces from start and end of string
        System.out.print(msg);
    }
}