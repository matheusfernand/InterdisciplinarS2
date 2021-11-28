package OperationsDec;

public class DecToOct {

    private int entradaDecOct;

    public DecToOct(){
    }

    public DecToOct(int entradaDecToOct) {
        this.entradaDecOct = entradaDecToOct;
    }

    public int getEntradaDecOct() {
        return entradaDecOct;
    }

    public void setEntradaDecOct(int entradaDecOct) {
        this.entradaDecOct = entradaDecOct;
    }

    //Método que retorna a conversão de decimal em octal
    public int conversionDecOct(int entradaDecOct)
    {
        int octalNumber = 0, i = 1;

        while (entradaDecOct != 0)
        {
            octalNumber += (entradaDecOct % 8) * i;
            entradaDecOct /= 8;
            i *= 10;
        }

        return octalNumber;

    }
}
