package Module1;

import org.junit.jupiter.api.Test;

import static Module1.Task1.uniqueCount;
import static Module1.Task3.areaOFtriangle;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    public void test(){
        double a=6;
        double b=3;
        double c=8;
        double h=areaOFtriangle(a,b,c);
        double p=(a+b+c)/2;
        double square=Math.sqrt(p * (p - a) * (p - b) * (p - c));

        assertEquals(square, h);

    }

}