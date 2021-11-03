package calculations.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

// Write a java code to take the following details as input from
// the user, store them into a HashMap and print the entire
// HashMap. The details to be taken as input: full name, phone,
// height, gender, marital status.

// class peronInfo {
//     String fullName;
//     String phoneNum;
//     float height;
//     String gender;
//     String maritalStatus;

//     public peronInfo(String fullName, String phoneNum, float height, String gender, String maritalStatus) {}
// }

class Question1 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String fullname = src.next();
        String phoneNum = src.next();
        String height = src.next();
        String gender = src.next();
        String maritalStatus = src.next();

        System.out.println(fullname);
        HashMap<String, String> map = new HashMap<>();
        map.put("fullname", fullname);
        map.put("phoneNum", phoneNum);
        map.put("height", height);
        map.put("gender", gender);
        map.put("maritalStatus", maritalStatus);
        System.out.println(map);
    }
}
