package com.learn._min.Exec.Basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlg implements SortAlgorthim{
    public int[] sort(int numbers[]){
        return numbers;
    }
}
