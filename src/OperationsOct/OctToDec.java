package OperationsOct;

public class OctToDec {

    private int entradaOctDec;

    public OctToDec () {
    }

    public OctToDec(String entradaOctToDec) {
        this.entradaOctDec = entradaOctDec;
    }

    public int getEntradaOctToDec() { return entradaOctDec; }

    public void setEntradaOctToDec(int entradaOctToDec) { this.entradaOctDec = entradaOctToDec; }

    //Método que retorna a conversão de octal em decimal
    public int conversionOctDec(int entradaOctDec) {
        int decimalNumber = 0, i = 0;
        while(entradaOctDec != 0)
        {
            decimalNumber += (entradaOctDec % 10) * Math.pow(8, i);
            ++i;
            entradaOctDec/=10;
        }

        return decimalNumber;
        }

    }

