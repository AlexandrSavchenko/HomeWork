package com.company;

public class IntList {

    private int[] arr = new int[0];

    public void add(int value) {
        int[] newArr = new int[size() + 1];
        for (int i = 0; i < size(); i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = value;
        arr = newArr;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        String result = "";
        if (size() == 0) {
            result = "[]";
        } else {
            result = "[";
            boolean isFirst = true;
            for (int value : arr) {
                result = result + (isFirst ? "" : ",") + value;
                isFirst = false;
            }
            result = result + "]";
        }
        return result;
    }
}

