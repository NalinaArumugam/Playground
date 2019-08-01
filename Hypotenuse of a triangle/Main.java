#include <stdio.h>
#include <math.h>
int main()
{
    double p, b;
  scanf("%lf%lf",&p,&b);
    double hypotenuse;
    hypotenuse = hypot(p, b);
    printf("%.2lf",hypotenuse);
    return 0;
}