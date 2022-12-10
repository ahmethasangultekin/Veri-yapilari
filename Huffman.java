/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.huffman;

/**
 *
 * @author ahmet
 */
public class Huffman {

    public static void main(String[] args) {
       int[] donustur = new int[]{'a', 'b' ,'c', 'd'};
System.out.println("Huffman kodu:");
String[] huffman = huffman(donustur);
for (int i = 0; i < huffman.length; i++) {  // i kücük oldugu sürece döngüye gir
    if (donustur[i] > 0) {            // diziden gelen değer 0 dan büyük oldugu sürece
        System.out.println(i + "] " + huffman[i]); //Döngü her döndüğünde artan diziyi yazdır
    }
}
    }
    public static String[] huffman(int[] donustur) {
    String[] codage = new String[donustur.length];
    int valeur1;
    int valeur2;
    int index1 = 0;
    int index2 = 0;
    for (int i = 0; i < donustur.length; i++) {
        codage[i] = new String();
    }

    do {
        valeur1 = Integer.MAX_VALUE;
        valeur2 = Integer.MAX_VALUE;
        for (int i = 0; i < donustur.length; i++) {
            if (donustur[i] > 0) {
                if (donustur[i] < valeur1) {
                    valeur2 = valeur1;
                    valeur1 = donustur[index1 = i];
                } else if (donustur[i] < valeur2) {
                    valeur2 = donustur[index2 = i];
                }
            }
        }
        donustur[index1] = 0;
        donustur[index2] += valeur1;
        codage[index1] = codage[index1] + "0";
        codage[index2] = codage[index2] + "1";
    } while (valeur2 != Integer.MAX_VALUE);

    return codage;

}
}
