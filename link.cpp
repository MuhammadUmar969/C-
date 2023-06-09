#include <iostream>

class LinkList {
private:
    class Node {
    public:
        int data;
        Node* next;

        Node(int data) {
            this->data = data;
            this->next = nullptr;
        }
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

    void display() {
        Node* current = head;
        if (current == nullptr) {
            std::cout << "List is empty" << std::endl;
            return;
        }
        std::cout << "Nodes of singly linked list: " << std::endl;
        while (current != nullptr) {
            std::cout << current->data << " -> ";
            current = current->next;
        }
        std::cout << std::endl;
    }
};

int main() {
    LinkList sList;
    sList.addNode(1);
    sList.addNode(2);
    sList.addNode(3);
    sList.addNode(4);
    sList.display();

    return 0;
}

