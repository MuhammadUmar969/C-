#include<iostream>
using namespace std;
#define max 10                
 
int queue[max],front=-1,rear=-1;           //queue declaration
 
void enqueue(int num) //enqueue() inserts an element into the Queue
{
    if(rear==max)  //check if Queue is full
    {
        cout<<"OVERFLOW!";
    }
    else if(front==-1 && rear==-1) //For 1st insertion in Queue
    {
        front++;
        rear++;
        queue[rear]=num;
    }
    else
    {
        rear++;
        queue[rear]=num;
    }
} 
int dequeue() //dequeue() deletes out the 1st element from the Queue
{
    if(front==-1 || front>rear)  //check if Queue is empty
    {
        cout<<"UNDERFLOW!";
        return -1;
    }
    else
    {
        cout<<"The deleted data is : "<<queue[front++];   //printing the deleted element
        return queue[front-1];
    }
}
 
void show()
{
    int i=front;
    if(front==-1 || front>rear)    //if Queue is empty
    {
        cout<<"UNDERFLOW!";
    }
    else
    {
        while(i<=rear) //printing the current Queue elements
        {
            cout<<"\t"<<queue[i];
            i++;
        }
        cout<<endl;
    }
}
int main() 
{ 
    int ch,val;
    cout<<"   :::MENU:::";   //Menu for Queue operations
    cout<<"\n1.enqueue\n2.dequeue\n3.Show\n4.Exit";
    while(1)    
    {
        printf("\nEnter the choice:");
        scanf("%d",&ch);
          
        switch(ch)
        {
            case 1: cout<<"Enter the value to be pushed: ";
                    cin>>val;
                    enqueue(val);
                    break;
            case 2: dequeue();
                    break;
            case 3: cout<<"Stack : ";
                    show();
                    break;
            case 4: exit(0);
              
            default: printf("\nError! Invalid choice!...");
        }
    }
    return 0;
}
