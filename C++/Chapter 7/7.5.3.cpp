#include <iostream>
using namespace std;

class CashRegister
{
public:
   void add_item(double price);
   double get_total() const;
   void enter_payment(double amount);
   double give_change();
private:
   double total_price;
};

void CashRegister::add_item(double amount)
{
   total_price = total_price + amount;
}
double CashRegister::get_total() const
{
   return total_price;
}
double CashRegister::give_change()
{
double change = -total_price;
total_price = 0;
return change;
}
void CashRegister::enter_payment(double amount)
{
total_price = total_price - amount;
}
int main()
{
   CashRegister reg1;
   reg1.add_item(5.67);
   reg1.add_item(1.42);
   cout << "Amount due: ";
   cout << reg1.get_total() << endl;
   reg1.enter_payment(10);
   cout << "Amount paid: 10" << endl;
   cout << "Change returned: ";
   cout << reg1.give_change() << endl;
   cout << "Amount due: ";
   cout << reg1.get_total() << endl;
   return 0;
}
