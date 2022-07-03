package Lesson4;

public class Calc {
    public static int getMaxValue(int []decMax) {
        int max = decMax[0];
        for (int counter = 1; counter < decMax.length; counter++)
        {
            if (decMax[counter] > max)
            {
                max = decMax[counter];
            }
        }
        return max;
    }

    public static int getIndexOfMaxValue(int []decMax) {
        int maxV = Calc.getMaxValue(decMax);
        int index = 0;
        for (int i = 0; i < decMax.length; i++) {
            if (maxV == decMax[i]) {
                index = i;
            }
        }
        return index;
    }
}
