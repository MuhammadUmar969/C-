#include <iostream>

// Function to find the location of the minimum element in the array
int findMinLocation(int arr[], int start, int end) {
    int minIndex = start;
    for (int i = start + 1; i <= end; i++) {
        if (arr[i] < arr[minIndex]) {
            minIndex = i;
        }
    }
    return minIndex;
}

// Function to swap two elements in the array
void swap(int& a, int& b) {
    int temp = a;
    a = b;
    b = temp;
}

// Function to sort the array using selection sort
void selectionSort(int arr[], int size) {
    for (int k = 0; k < size - 1; k++) {
        int minIndex = findMinLocation(arr, k, size - 1);
        swap(arr[k], arr[minIndex]);
    }
}

int main() {
    int N;
    std::cout << "Enter the number of elements in the array: ";
    std::cin >> N;

    int* arr = new int[N];

    std::cout << "Enter the elements of the array:\n";
    for (int i = 0; i < N; i++) {
        std::cin >> arr[i];
    }

    selectionSort(arr, N);

    std::cout << "Sorted array: ";
    for (int i = 0; i < N; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;

    delete[] arr;

    return 0;
}

