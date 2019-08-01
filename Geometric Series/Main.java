#include <iostream> 
#include <math.h> 
using namespace std; 
void findNthTerm(int n) 
{ 
    if (n % 2 == 0) { 
        n = n / 2; 
        cout << pow(3, n - 1) << endl; 
    }  
    else { 
        n = (n / 2) + 1; 
        cout << pow(2, n - 1) << endl; 
    } 
}  
int main() 
{ 
    int N; 
  cin>>N;
    findNthTerm(N); 
    return 0; 
} 