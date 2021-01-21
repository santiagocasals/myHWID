package pw.santiago;

import java.security.MessageDigest;

public class Main {
    
    public static void main(String args[]) {
        String hwidfield = Utils.byteHWIDtoString(showHWID());
        System.out.println("[myHWID] Your hash code are " + hwidfield + ".");
    }
    
    public static byte[] showHWID() {
        try {
            MessageDigest myHWID = MessageDigest.getInstance("MD5");
            return myHWID.digest(Utils.all_identifiers.getBytes());
        } catch (Exception e) {
            System.out.println("[myHWID] A error has been generated, please report:");
            System.out.println(e);
        }
		return null;
    }
    
}