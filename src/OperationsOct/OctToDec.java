package OperationsOct;

public class OctToDec {

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

