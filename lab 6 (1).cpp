#include <iostream>

void matrixMultiply(int** A, int** B, int** C, int M, int P, int N) {
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            C[i][j] = 0;
            for (int k = 0; k < P; k++) {
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }
}

int main() {
    int M, P, N;
    std::cout << "Enter the number of rows in matrix A (M): ";
    std::cin >> M;
    std::cout << "Enter the number of columns in matrix A and rows in matrix B (P): ";
    std::cin >> P;
    std::cout << "Enter the number of columns in matrix B (N): ";
    std::cin >> N;

    // Allocate memory for matrices A, B, and C
    int** A = new int*[M];
    for (int i = 0; i < M; i++) {
        A[i] = new int[P];
    }

    int** B = new int*[P];
    for (int i = 0; i < P; i++) {
        B[i] = new int[N];
    }

    int** C = new int*[M];
    for (int i = 0; i < M; i++) {
        C[i] = new int[N];
    }

    // Input elements of matrix A
    std::cout << "Enter the elements of matrix A:\n";
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < P; j++) {
            std::cin >> A[i][j];
        }
    }

    // Input elements of matrix B
    std::cout << "Enter the elements of matrix B:\n";
    for (int i = 0; i < P; i++) {
        for (int j = 0; j < N; j++) {
            std::cin >> B[i][j];
        }
    }

    // Perform matrix multiplication
    matrixMultiply(A, B, C, M, P, N);

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

    for (int i = 0; i < P; i++) {
        delete[] B[i];
    }
    delete[] B;

    for (int i = 0; i < M; i++) {
        delete[] C[i];
    }
    delete[] C;

    return 0;
}

