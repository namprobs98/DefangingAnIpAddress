/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defanginganipaddress;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class DefangingAnIpAddress {

    /**
     * @param args the command line arguments
     */
    public static String defangIPaddr(String address) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (char c : address.toCharArray()) {
            linkedList.add(String.valueOf(c));
        }
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).equals(".")) {
                linkedList.set(i, "[.]");
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : linkedList) {
            sb.append(s);
        }
        String result = sb.toString();

        return result;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String address = sc.nextLine();
        System.out.println(defangIPaddr(address));
    }

}
