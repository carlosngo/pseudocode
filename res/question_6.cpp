#include <iostream>
using namespace std;

int main()
{
    int i, j, tableSize;

    cout << "Enter table size: ";
    cin >> tableSize;

    for (i = 1; i <= tableSize; i++) 
    {
        for (j = 1; j <= tableSize; j++) 
        {
            if (j <= tableSize - 1)
                cout << i * j << " ";
            else
                cout << i * j << " ";
        }
        cout << endl;
    }
}