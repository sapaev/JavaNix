package Module1;

import org.junit.jupiter.api.Test;

import static Module1.Task1.uniqueCount;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    public void test(){
        int[] array=new int[]{45, 8, 8, 9, 9, 74, 9};
        int a=uniqueCount(array);
        assertEquals(4, a);

    }

}