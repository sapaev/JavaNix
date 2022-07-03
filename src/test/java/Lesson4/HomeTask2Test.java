package Lesson4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeTask2Test {

    @Test
    void main() {
        int[] array = new int[]{12, 65, 52, 74, -5, 51, 54, 7};
        for (int j=0; j< array.length; j++){
            if(j%2!=0){
                array[j]=0;
            }
        }
        assertTrue(array[1]==0 && array[3]==0 && array[5]==0 && array[7]==0);
    }
}