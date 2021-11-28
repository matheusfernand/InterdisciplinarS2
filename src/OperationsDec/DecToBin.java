package OperationsDec;

public class DecToBin {

    private int entradaDecBin;

    public DecToBin() {
    }

    public DecToBin(int entradaDecBin) {
        this.entradaDecBin = entradaDecBin;
    }

    public int getEntradaDecBin() {
        return entradaDecBin;
    }

    public void setEntradaDecBin(int entradaDecBin) {
        this.entradaDecBin = entradaDecBin;
    }

    //Método que retorna a conversão de decimal para binario
    public static String conversionDecBin(int entradaDecBin) {
        String binario = "";
        int temp;
        while(entradaDecBin >= 2){
            temp = entradaDecBin % 2;
            binario = temp + binario;
            entradaDecBin = entradaDecBin / 2;
        }
        binario = entradaDecBin + binario;
        return binario;
    }
}

