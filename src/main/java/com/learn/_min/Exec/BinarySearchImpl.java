package com.learn._min.Exec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorthim sortAlgorthim;

    public BinarySearchImpl(SortAlgorthim sortAlgorthim) {
        this.sortAlgorthim = sortAlgorthim;
    }

    public int binarySearch(int [] numbers, int searchForNumber){

        int sortedNumbers [] = sortAlgorthim.sort(numbers);
        System.out.println((sortAlgorthim));
        return searchForNumber;
    }
}
