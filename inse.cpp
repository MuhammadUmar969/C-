#include <iostream>

void insertionSort(int arr[], int size) {
    for (int k = 1; k < size; k++) {
        int temp = arr[k];
        int ptr = k - 1;

        while (ptr >= 0 && temp < arr[ptr]) {
            arr[ptr + 1] = arr[ptr];
            ptr--;
        }

        arr[ptr + 1] = temp;
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

    insertionSort(arr, N);

    std::cout << "Sorted array: ";
    for (int i = 0; i < N; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;

    delete[] arr;

    return 0;
}

