/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod10;

import java.util.Scanner;

/**
 *
 * @author MSI MODERN 14
 */
public class demolampu {
    public static void main(String[] args){
        lampu lamp = new lampu();
        Scanner sc = new Scanner(System.in);
        lamp.statuslampu = lamp.setsaklar(0);
        System.out.println("Status Lampu = "+lamp.statuslampu+"\nketikkan");
        System.out.println("1 untuk menyalakan lampu\n0 untuk mematikan lampu");
        
        if (lamp.setsaklar(sc.nextInt())==0){
            lamp.matikanlampu();
        }else{
            lamp.hidupkanlampu();
        }
    }
}
