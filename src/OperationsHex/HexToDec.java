package OperationsHex;

public class HexToDec {

    private String entradaHexDec;

    public HexToDec() {
    }

    public HexToDec(String entradaHexDec) {
        this.entradaHexDec = entradaHexDec;
    }

    public String getEntradaHexDec() {
        return this.entradaHexDec;
    }

    public void setEntradaHexDec(String entradaHexDec) {
        this.entradaHexDec = entradaHexDec;
    }

    //Método que retorna a conversão de hexadecimal em decimal
    public int conversionHexDec(String entradaHexDec) {
        String digits = "0123456789ABCDEF";
        entradaHexDec = entradaHexDec.toUpperCase();
        int value = 0;

        for (int i = 0; i < entradaHexDec.length(); ++i) {
            char c = entradaHexDec.charAt(i);
            int d = digits.indexOf(c);
            value = 16 * value + d;
        }
        return value;
    }
}
