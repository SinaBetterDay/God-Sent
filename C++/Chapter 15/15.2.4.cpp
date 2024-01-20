class CheckingAccount : public BankAccount
{
  public:
  void month_end();
  private:
  double balance;
};

void CheckingAccount::month_end()
{
   if(get_balance() < 1000)
   {
      withdraw(10);
   }
}
