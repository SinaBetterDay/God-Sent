#include <iostream>
#include <vector>
using namespace std;

class CashRegister
{
  public:
  void add_item(double price);
  int get_count() const;
  private:
  vector<double> prices;
};

int CashRegister::get_count() const
{
  return prices.size();
}

void CashRegister::add_item(double price)
{
  prices.push_back(price);
}

int main()
{
   double n;
   CashRegister reg1;
   
   while(cin >> n)
   {
      reg1.add_item(n);
   }
   
   cout << "Number of items purchased: "
        << reg1.get_count();

   return 0;
}
