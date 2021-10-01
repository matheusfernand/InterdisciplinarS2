package OperationsHex;

public class HexToDec {
    String imput;

    public String getImput() {
        return imput;
    }

    public void setImput(String imput) {
        this.imput = imput;
    }

    public int converter(String hex) {
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int value = 0;

        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            value = 16 * value + d;
        }
        return value;
    }


}
