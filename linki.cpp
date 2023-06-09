#include <iostream>

class LinkSearch {
private:
    struct Node {
        int data;
        Node* next;

        Node(int data) : data(data), next(nullptr) {}
    };

    Node* head = nullptr;
    Node* tail = nullptr;

public:
    void addNode(int data) {
        Node* newNode = new Node(data);
        if (head == nullptr) {
            head = newNode;
            tail = newNode;
        } else {
            tail->next = newNode;
            tail = newNode;
        }
    }

    void searchNode(int data) {
        Node* current = head;
        int i = 1;
        bool flag = false;
        if (head == nullptr) {
            std::cout << "List is empty" << std::endl;
        } else {
            while (current != nullptr) {
                if (current->data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current->next;
            }
        }
        if (flag) {
            std::cout << "Element is present in the list at position: " << i << std::endl;
        } else {
            std::cout << "Element is not present in the list" << std::endl;
        }
    }
};

int main() {
    LinkSearch sList;
    sList.addNode(1);
    sList.addNode(2);
    sList.addNode(3);
    sList.addNode(4);
    sList.searchNode(2);
    sList.searchNode(7);

    return 0;
}

