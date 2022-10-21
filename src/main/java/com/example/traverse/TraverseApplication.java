package com.example.traverse;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TraverseApplication {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        Solution s = new Solution();
        s.traverse(arr, 4, 4);
    }
}
