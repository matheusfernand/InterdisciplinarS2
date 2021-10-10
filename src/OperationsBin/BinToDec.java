package OperationsBin;

public class BinToDec {

    private String entradaBinDec;

    public BinToDec() {
    }

    public BinToDec(String entradaBinDec) {
        this.entradaBinDec = entradaBinDec;
    }

    public String getEntradaBinDec() {
        return entradaBinDec;
    }

    public void setEntradaBinDec(String entradaBinDec) {
        this.entradaBinDec = entradaBinDec;
    }

    //Método que retorna a conversão de binario em decimal
    public static int conversionBinDec(String entradaBinDec) {
        int potencia = 0;
        int decimal = 0;
        for (int i = entradaBinDec.length() - 1; i>=0; i-- ) {
            decimal += Math.pow(2, potencia) * Character.getNumericValue(entradaBinDec.charAt(i));
            potencia++;
        }return decimal;
    }

}
