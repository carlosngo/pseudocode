#include <bits/stdc++.h> 
using namespace std; 
  
void insertionSort(int arr[], int n)  
{  
    int i, key, j;  
    for (i = 1; i < n; i++) 
    {  
        key = arr[i];  
        j = i - 1;  
        int index = j;
        while (j >= 0) 
        {  
            if (arr[index] > key) {
                arr[index + 1] = arr[index];  
                index = index - 1;
            }
            j = j - 1;  
        }  
        arr[index + 1] = key;  
    }  
}  
    
void printArray(int arr[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        cout << arr[i] << " ";  
    cout << endl; 
}  
  
int main()
{  
    int numberOfNumbers;
    cout << "How many numbers? ";
    cin >> numberOfNumbers;
    
    int arr[numberOfNumbers];  

    for(int i = 0; i<numberOfNumbers; i++){
        cout << "Enter number: ";
        int temp;
        cin >> temp;
        arr[i] = temp;
    } 
  
    insertionSort(arr, numberOfNumbers);
    cout << "Sorted: ";
    printArray(arr, numberOfNumbers);  
  
    return 0;  
}  