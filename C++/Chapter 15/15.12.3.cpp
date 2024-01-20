#include "bankaccount.h"

class CheckingAccount : public BankAccount
{
  public:
  void withdraw(double amount);
  double balance;
};

void CheckingAccount::withdraw(double amount)
{
  if (amount < 100)
  {
    BankAccount::withdraw(amount + 5);
  }
  else
  {
    BankAccount::withdraw(amount);
  }
}
