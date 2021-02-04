#include <iostream>
using namespace std;

void printF(int fontSize){
    for(int i = 0; i<fontSize; i++){
        cout << "*";
    }

    cout << endl;

    cout << "*";

    cout << endl;

    for (int j = 0; j < fontSize -1; j++){
            cout << "*";
    }
    
    cout << endl;

    for(int i = 0; i<fontSize-2; i++){
        cout << "*" << endl;
    }
}

void printT(int fontSize){
    int space = fontSize/2;
    for(int i = 0; i<fontSize; i++){
        cout << "*";
    }

    cout << endl;

    for(int i = 0; i<fontSize-1; i++){
        for(int j = 0; j<space; j++){
            cout << " ";
        }
        cout << "*" << endl;
    }

}

void printL(int fontSize){
    for(int i = 0; i<fontSize-1; i++){
        cout << "*" << endl;
    }

    for(int i = 0; i<fontSize; i++){
        cout << "*";
    }
}

int main()
{
    char c;
    int fontSize;

    cout << "Enter char: ";
    cin >> c;

    if(c != 'F' && c != 'T' && c != 'L'){
        cout << "Please only enter characters F, T, or L" << endl;
    } else{
        cout << "Enter font size: ";
    cin >> fontSize;

    if(fontSize<5){
        cout << "Font size must be 5 or greater";
    } else {
        if(c == 'F'){
        printF(fontSize);
    } else if(c == 'T'){
        printT(fontSize);
    } else if (c == 'L'){
        printL(fontSize);
    }
    }
    }

}