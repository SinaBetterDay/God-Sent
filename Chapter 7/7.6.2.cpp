#include <vector>
#include <iostream>
#include <iomanip>
using namespace std;

class BankAccount
{
public:
BankAccount();
BankAccount(double initial_deposit);
   void deposit(double amount);
   void withdraw(double amount);
   double get_balance() const;
private:
   vector<double> amounts;
};
BankAccount::BankAccount()
{
amounts = vector<double>();
}
BankAccount::BankAccount(double initial_deposit)
{
amounts.push_back(initial_deposit);
}
void BankAccount::deposit(double amount)
{
   amounts.push_back(amount);
}

void BankAccount::withdraw(double amount)
{
   amounts.push_back(-amount);
}

double BankAccount::get_balance() const
{
   double total = 0;
   for (double amount : amounts)
   {
      total = total + amount;
   }
   return total;
}

int main()
{
   cout << "Account 1:" << endl;
   BankAccount acct1(1000);
   cout << "Initial balance: ";
   cout << fixed << setprecision(2);
   cout << acct1.get_balance() << endl;
   acct1.deposit(340.33);
   cout << "Balance after deposit: ";
   cout << acct1.get_balance() << endl;
   acct1.withdraw(40.90);
   cout << "Balance after withdrawal: ";
   cout << acct1.get_balance() << endl;
   BankAccount acct2;
   cout << "\nAccount 2:" << endl;
   cout << "Initial balance: ";
   cout << acct2.get_balance() << endl;
   return 0;
}
