#include <iostream>
#include <string>

int searchSubstring(const std::string& T, const std::string& P) {
    int S = T.length();
    int R = P.length();
    int K = 0;
    int MAX = S - R + 1;

    while (K <= MAX) {
        bool match = true;
        
        for (int L = 0; L < R; L++) {
            if (P[L] != T[K + L]) {
                match = false;
                break;
            }
        }
        
        if (match) {
            return K;
        }
        
        K++;
    }

    return -1; // Indicates failure to find the substring
}

int main() {
    std::string T = "This is a sample string.";
    std::string P = "sample";

    int index = searchSubstring(T, P);
    if (index != -1) {
        std::cout << "Substring found at index " << index << std::endl;
    } else {
        std::cout << "Substring not found." << std::endl;
    }

    return 0;
}

