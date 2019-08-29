#include<stdio.h>
int main()
{
  int year;
  scanf("%d", &year);
  if(year % 4 == 0)
  {
    if(year % 100 == 0)
    {
      if(year % 400 == 0)
      {
        printf("LEAP YEAR");
      }
      else
        printf("NOT LEAP YEAR");
    }
    else
    {
      printf("LEAP YEAR");
    }
  }
  else
    printf("NOT LEAP YEAR");
     return 0;
}