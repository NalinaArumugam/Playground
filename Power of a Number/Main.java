#include<math.h>
int main()
{
    long int base, exponent,i;
    long int result = 1;
    scanf("%ld", &base);
    scanf("%ld", &exponent);
  if(exponent>=0)
  {
    for(i=1;i<=exponent;i++)
    {
      result=result*base;
    }
  printf("%ld",result);
}
  else
  {
    printf("Wrong input");
  }
}