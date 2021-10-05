package OperationsDec;

public class DecToOct {

    private int index;

    public int getIndex(int i) {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public int conv()
    {
        int octalNumber = 0, i = 1;

        while (this.index != 0)
        {
            octalNumber += (this.index % 8) * i;
            this.index /= 8;
            i *= 10;
        }

        return octalNumber;

    }
}
