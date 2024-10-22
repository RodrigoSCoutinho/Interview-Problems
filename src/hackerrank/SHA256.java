package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256 {

    public class Solution {
        public static void main(String[] args) {
            // Ler a entrada
            Scanner keyboard = new Scanner(System.in);
            String input = keyboard.nextLine();

            try {
                // Obter uma instância de SHA-256
                MessageDigest md = MessageDigest.getInstance("SHA-256");

                // Aplicar o hash na string de entrada
                byte[] hashBytes = md.digest(input.getBytes());

                // Converter os bytes do hash para uma string hexadecimal
                StringBuilder hexString = new StringBuilder();
                for (byte b : hashBytes) {
                    String hex = String.format("%02x", b);
                    hexString.append(hex);
                }

                // Imprimir o valor do hash em formato hexadecimal
                System.out.println(hexString.toString());
            } catch (NoSuchAlgorithmException e) {
                // Tratamento da exceção caso o SHA-256 não esteja disponível
                e.printStackTrace();
            }

            keyboard.close();
        }
    }
}