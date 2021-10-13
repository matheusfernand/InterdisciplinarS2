package OperationsDec;

public class DecToOct {

    private int entradaDecToOct;

    public DecToOct(){
    }

    public DecToOct(int entradaDecToOct) {
        this.entradaDecToOct = entradaDecToOct;
    }

    public int getEntradaDecToOct() {
        return entradaDecToOct;
    }

    public void setEntradaDecToOct(int entradaDecToOct) {
        this.entradaDecToOct = entradaDecToOct;
    }

    //Método que retorna a conversão de decimal em octal
    public int conversionDecOct()
    {
        int octalNumber = 0, i = 1;

        while (entradaDecToOct != 0)
        {
            octalNumber += (entradaDecToOct % 8) * i;
            entradaDecToOct /= 8;
            i *= 10;
        }

        return octalNumber;

    }
}
