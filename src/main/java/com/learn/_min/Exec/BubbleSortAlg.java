package com.learn._min.Exec;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlg implements SortAlgorthim{
    public int[] sort(int numbers[]){
        return numbers;
    }
}
