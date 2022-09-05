#include <iostream>
#include <iomanip>
using namespace std;

void transfer(double& balance1, double& balance2, double& amount)
{
  if (balance1 >= amount)
  {
    balance1 = balance1 - amount;
    balance2 = balance2 + amount;
  }
}

int main()
{
   double balance1;
   double balance2;
   double amount;
   
   cin >> balance1;
   cin >> balance2;
   cin >> amount;
   
   cout << fixed << setprecision(2);
   
   cout << "balance1:  $" << balance1 << endl;
   cout << "balance2:  $" << balance2 << endl;
   
   cout << "\nTransfer amount:  $" 
    << amount << endl;
   
   transfer(balance1, balance2, amount);
   
   cout << "\nbalance1:  $" << balance1 << endl;
   cout << "balance2:  $" << balance2 << endl;
   
   return 0;
}
