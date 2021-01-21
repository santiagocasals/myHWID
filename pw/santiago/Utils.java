package pw.santiago;

public class Utils {
	
    public static String pr_architecture = System.getenv("processor_architecture");
    public static String pr_identifier = System.getenv("processor_identifier");
    public static String os_name = System.getProperty("os.name");
    public static String os_version = System.getProperty("os.version");
    public static String os_arch = System.getProperty("os.arch");
    public static int processors = Runtime.getRuntime().availableProcessors();
	
	public static String all_identifiers =  os_name + 
											os_version + 
											os_arch + 
											pr_architecture + 
											pr_identifier + 
											processors;
	
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