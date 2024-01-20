#include <iostream>
using namespace std;

class CashRegister
{
public:
   void clear();
   void add_item(double price);
   int get_count() const;
   double get_total() const;
private:
   int item_count;
   double total_price;
};

void CashRegister::clear()
{
   item_count = 0;
   total_price = 0;
}

void CashRegister::add_item(double price)
{
   total_price = total_price + price;
   item_count++;
}

int CashRegister::get_count() const
{
   return item_count;
}

double CashRegister::get_total() const
{
   return total_price;
}

int main() 
{
  CashRegister reg1;
  reg1.clear();
  reg1.add_item(1.21);
  reg1.add_item(2.34);
  reg1.add_item(5.76);
  cout << reg1.get_count() << endl;
  cout << reg1.get_total() << endl;
  reg1.clear();
  reg1.add_item(15.76);
  reg1.add_item(12.34);
  cout << reg1.get_count() << endl;
  cout << reg1.get_total() << endl;
  
  return 0;
}
