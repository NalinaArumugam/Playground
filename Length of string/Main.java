#include <stdio.h>
#include <string.h>
int main()
{
  char a[100];
  int length;
  scanf("%[^\n]s",a);
  length = strlen(a);
  printf("%d", length);
  return 0;
}