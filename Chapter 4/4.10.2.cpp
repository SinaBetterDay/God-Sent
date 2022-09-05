#include <iostream>
#include <math.h>
using namespace std;

double balance(double initial_balance, double rate, int years)
{
  return initial_balance * pow(1 + rate / 100, years);
}

int main() 
{
   double initial_balance;
   double rate;
   double years;
   
   cin >> initial_balance;
   cin >> rate;
   cin >> years;
   
   cout << balance(initial_balance, rate, years) << endl;
   
   return 0;
}
