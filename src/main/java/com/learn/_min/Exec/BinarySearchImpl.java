package com.learn._min.Exec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    @Qualifier("bubble")
    private SortAlgorthim sortAlgorthim;

    public int binarySearch(int [] numbers, int searchForNumber){

        int sortedNumbers [] = sortAlgorthim.sort(numbers);
        System.out.println((sortAlgorthim));
        System.out.println(sortedNumbers);
        return searchForNumber;
    }
}
