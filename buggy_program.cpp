#include <iostream>
using namespace std;

// Bug fixed by tanveer41 - Fixed function definition and cout operator
int calculateSquare(int n) {
    return n * n; 
}

int main() {
    int number = 5;
    cout << "Square is: " << calculateSquare(number) << endl;
    return 0;
}
