package com.learn._min.Exec;

public class BinarySearchImpl {

    private SortAlgorthim sortAlgorthim;

    public BinarySearchImpl(SortAlgorthim sortAlgorthim) {
        this.sortAlgorthim = sortAlgorthim;
    }

    public int binarySearch(int [] numbers, int searchForNumber){

        int bubbleSortResult [] = sortAlgorthim.sort(numbers);
        System.out.println((sortAlgorthim));
        return searchForNumber;
    }
}
