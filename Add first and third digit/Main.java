#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int m=n%10;
  int k=n/100;
  printf("%d",m+k);
  return 0;
}