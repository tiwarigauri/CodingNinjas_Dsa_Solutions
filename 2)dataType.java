package Coding_Ninjas_Dsa_Solutions;

public class dataType {
    public static int dataTypes(String type) {
        if (type.equals("Integer") || type.equals("Float")) {
            return 4;
        } else if (type.equals("Long") || type.equals("Double")) {
            return 8;
        } else if (type.equals("Character")) {
            return 1;
        }
        return 0;
    }
}
