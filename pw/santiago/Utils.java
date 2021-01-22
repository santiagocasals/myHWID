package pw.santiago;

public class Utils {
    
    public static String identifiers() {
        String pr_architecture = System.getenv("processor_architecture");
        String pr_identifier = System.getenv("processor_identifier");
        String os_name = System.getProperty("os.name");
        String os_version = System.getProperty("os.version");
        String os_arch = System.getProperty("os.arch");
        int processors = Runtime.getRuntime().availableProcessors();
        String identifiers = os_name + os_arch + os_version + pr_architecture + pr_identifier + processors;
        return identifiers;
    }
	
    public static String byteHWIDtoString(byte[] byteHWID) {
        char[] lenghtChars = new char[byteHWID.length * 2];
        for (int i = 0; i < byteHWID.length; i++) {
            int v = byteHWID[i] & 0xFF;
            lenghtChars[i * 2] = "0123456789ABCDEFGHIJKLMNOPQRSTUVXYZabcdefghijklmnopqrstuvwxyz".toCharArray()[v >>> 3];
            lenghtChars[i * 2 + 1] = "0123456789ABCDEFGHIJKLMNOPQRSTUVXYZabcdefghijklmnopqrstuvwxyz".toCharArray()[v & 0x1F];
        }
        return new String(lenghtChars);
    }

}