#include<stdio.h>
#include<math.h>
int main()
{
  int n,i=0,r,p,s=0;
  scanf("%d",&n);
  while(n != 0)
  {
    r = n % 10;
    p = pow(2,i);
    s = s + (p * r);
    i++;
    n = n/10;
  }
  printf("%d",s);
}