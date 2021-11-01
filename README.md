# Algorithms

This repository contains implementation of Algorithms in Java.

## Divide and Conquer

### Binary Search

The Binary Search algorithm is used to search whether an element is present in an array or not.

The prerequisite of using Binary Search algorithm is that the array must be sorted. In this implementation the array must be sorted in ascending order.

#### Time Complexity:

- Best Case Complexity (When element is present in the middle): O(1)
- Average Case Complexity: O(log n)
- Worst Case Complexity: O(log n)

#### Space Complexity: 

- For Iterative Implementation - O(1)
- For Recursive Implementation (Call Stack) - O(log n)

### Maximum Minimum using Divide and Conquer

The Maximum Minimum algorithm is used to find the maximum and minimum element of an array with minimum number of comparisons.

In this algorithm, the array is divided into two subarrays and the maximum and minimum of each subarray is found. Then, the maximum is selected out of maximum of the two subarrays. 

### Merge Sort

The Merge Sort algorithm is used sort an array. In this implementation the array is sorted in ascending order.

#### Time Complexity: 

- Best Case Complexity - O(n log n)
- Average Case Complexity - O(n log n)
- Worst Case Complexity - O(n log n)

#### Space Complexity

- For Iterative and Recursive Implementation - O(n)