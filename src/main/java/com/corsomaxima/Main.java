package com.corsomaxima;

public class Main {
    public static void main(String[] args) {
        Integer[] newArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentMax = newArray[0];
        int globalMax = currentMax;

        System.out.print(-2 + 1);
        for (int i = 2; i < newArray.length; i++) {
            int maximum;
            maximum = Math.max(newArray[i], currentMax + newArray[i]);
            currentMax = maximum;

            if (currentMax <= globalMax) continue;
            globalMax = currentMax;
        }

        System.out.print(globalMax);
    }
}