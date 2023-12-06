/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod10;

/**
 *
 * @author MSI MODERN 14
 */
public class lampu implements ActivityLampu{
    public int statuslampu;
    
    @Override
    public void matikanlampu(){
        if(statuslampu==0){
            System.out.println("Lampu sudah dalam kondisi mati");
        }else if(statuslampu==1){
            statuslampu=-1;
                System.out.println("Lampu sudah dimatikan");
        }
    }
    @Override
    public void hidupkanlampu(){
        if(statuslampu==1){
            System.out.println("Lampu sudah dinyalakan\n***");
        }else{
            statuslampu=+1;
                System.out.println("Lampu sudah dalam kondisi menyala");
        }
    }
    public int setsaklar(int saklar){
        return statuslampu = saklar;
    }
}
