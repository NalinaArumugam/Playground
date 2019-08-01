#include <stdio.h>
void printDivisors(int n) 
{ 
    for (int i=1;i<=n;i++) 
        if (n%i==0) 
            printf("%d\n",i); 
} 
int main() 
{ 
    int n;
  scanf("%d",&n);
    printDivisors(n); 
    return 0; 
} 