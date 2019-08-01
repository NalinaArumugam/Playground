#include <stdio.h>
#include <math.h>
int main()
{
int input;
  int number, output;
scanf("%d", &input);
if(input % 2 == 0)
{
number = input/2;
int x = number-1;
output = x;
printf("%d", output);
}
else
{

number = (input+1)/2;
int x = number-1;
output = 2 * x;
printf("%d", output);
}
return 0;
}