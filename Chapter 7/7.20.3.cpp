#include <iostream>
#include "bankaccount.h"
using namespace std;

int main() 
{
   BankAccount peters_account(2000);
   BankAccount pauls_account(1000);
   BankAccount marys_account(3000);
   cout << "Account balances before: " << endl;
   cout << "Peter : " << peters_account.get_balance() << endl;
   cout << "Paul : " << pauls_account.get_balance() << endl;
   cout << "Mary : " << marys_account.get_balance() << endl;
double fee = 10;
double amount = 1000;
peters_account.withdraw(amount + fee);
pauls_account.deposit(amount + fee);
pauls_account.withdraw(amount);
marys_account.deposit(amount);
   
   cout << "\nAccount balances after: " << endl;
   cout << "Peter : " << peters_account.get_balance() << endl;
   cout << "Paul : " << pauls_account.get_balance() << endl;
   cout << "Mary : " << marys_account.get_balance() << endl;
   return 0;
}
