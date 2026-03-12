package mathss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo_Arraylist {
    public static void main(String[] args) {
        // ArrayList<String> studentname = new ArrayList<>();
        List<String> studentname = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the total no of student you wants to add: ");
        int count = scn.nextInt();
        scn.nextLine();

        // studentname.add("Ashish");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name : "+(i+1));
            studentname.add(scn.nextLine());
        }
        for (String string : studentname) {
            System.out.println(string);
            
        }
        System.out.println(studentname.size());
    }
}
