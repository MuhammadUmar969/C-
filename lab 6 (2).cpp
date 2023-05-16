#include <iostream>

void matrixAddition(int** A, int** B, int** C, int M, int N) {
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            C[i][j] = A[i][j] + B[i][j];
        }
    }
}

int main() {
    int M, N;
    std::cout << "Enter the number of rows in the matrices (M): ";
    std::cin >> M;
    std::cout << "Enter the number of columns in the matrices (N): ";
    std::cin >> N;

    // Allocate memory for matrices A, B, and C
    int** A = new int*[M];
    for (int i = 0; i < M; i++) {
        A[i] = new int[N];
    }

    int** B = new int*[M];
    for (int i = 0; i < M; i++) {
        B[i] = new int[N];
    }

    int** C = new int*[M];
    for (int i = 0; i < M; i++) {
        C[i] = new int[N];
    }

    // Input elements of matrix A
    std::cout << "Enter the elements of matrix A:\n";
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            std::cin >> A[i][j];
        }
    }

    // Input elements of matrix B
    std::cout << "Enter the elements of matrix B:\n";
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            std::cin >> B[i][j];
        }
    }

    // Perform matrix addition
    matrixAddition(A, B, C, M, N);

    // Print the resulting matrix C
    std::cout << "Resulting matrix C:\n";
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            std::cout << C[i][j] << " ";
        }
        std::cout << std::endl;
    }

    // Deallocate memory
    for (int i = 0; i < M; i++) {
        delete[] A[i];
    }
    delete[] A;

    for (int i = 0; i < M; i++) {
        delete[] B[i];
    }
    delete[] B;

    for (int i = 0; i < M; i++) {
        delete[] C[i];
    }
    delete[] C;

    return 0;
}

