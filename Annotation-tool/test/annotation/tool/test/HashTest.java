package annotation.tool.test;

import annotation.tool.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Alex
 */
public class HashTest {

    private static String testString;

    public static int hashSHA256(String in) throws NumberFormatException, NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.update(in.getBytes());
        byte[] hash = digest.digest();
        StringBuffer hex = new StringBuffer();
        for (byte b : hash) {
            hex.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
        }
        int output = Integer.parseInt(hex.toString().substring(0, 8), 16);
        return output;
    }

    public static void main(String[] args) throws NumberFormatException, NoSuchAlgorithmException {
        testString = "Hello World!";
        System.out.println(hashSHA256(testString));
    }
}
