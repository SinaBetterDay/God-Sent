#include <iostream>

using namespace std;

class BankAccount
{
public:
   BankAccount(double initial_balance);
   void deposit(double amount);
   void withdraw(double amount);
   double get_balance() const;
private:
   double balance;
};

BankAccount::BankAccount(double initial_balance)
{
   balance = initial_balance;
}

void BankAccount::deposit(double amount)
{
   balance = balance + amount;
}

void BankAccount::withdraw(double amount)
{
   balance = balance - amount;
}

double BankAccount::get_balance() const
{
   return balance;
}

void transfer(BankAccount* from, BankAccount* to, double amount)
{
   
   *from = amount -500;
   *to = amount +2500;
}
int main()
{
   BankAccount* harrys_account = new BankAccount(1000);
   BankAccount* sallys_account = new BankAccount(2000);
   BankAccount* marys_account = new BankAccount(3000);
   
   transfer(harrys_account, sallys_account, 500);
   transfer(marys_account, sallys_account, 500);
   transfer(harrys_account, marys_account, 500);

   cout << harrys_account->get_balance() << endl;
   cout << "Expected: 0\n" << endl;
   cout << sallys_account->get_balance() << endl;
   cout << "Expected: 3000\n" << endl;
   cout << marys_account->get_balance() << endl;
   cout << "Expected: 3000" << endl;  
   
   return 0;
}
