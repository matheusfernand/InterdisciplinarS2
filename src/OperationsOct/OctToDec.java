package OperationsOct;

public class OctToDec {

    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int calc() {

        int decimalNumber = 0, i = 0;

        while(this.index != 0)
        {
            decimalNumber += (this.index % 10) * Math.pow(8, i);
            ++i;
            this.index/=10;
        }

        return decimalNumber;
        }

    }

