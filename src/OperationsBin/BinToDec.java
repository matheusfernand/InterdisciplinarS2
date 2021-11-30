package OperationsBin;

public class BinToDec {

    //Método que retorna a conversão de binario em decimal
    public static int conversionBinDec(int entradaBinDec) {
            int decimal = 0;
            int n = 0;
            while(true){
                if(entradaBinDec == 0){
                    break;
                } else {
                    int temp = entradaBinDec%10;
                    decimal += temp*Math.pow(2, n);
                    entradaBinDec = entradaBinDec/10;
                    n++;
                }
            }
            return decimal;
        }
    }

