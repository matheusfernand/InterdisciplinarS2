package OperationsDec;

public class DecToHex {

    //Método que retorna a conversão de decimal em Hexadecimal
    public static String conversionDecHex(int entradaDecHex){
        int rem;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(entradaDecHex>0)
        {
            rem=entradaDecHex % 16;
            hex=hexchars[rem]+hex;
            entradaDecHex=entradaDecHex/16;
        }
        return hex;
    }
}
