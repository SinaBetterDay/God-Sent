#include <iostream>
using namespace std;

class Square
{
public:
   void set_side(int initial_length);
   void grow(int amount);
   int get_perimeter() const;
   int get_side_length() const;
private:
   int perimeter;
};
void Square::set_side(int initial_length)
{
   perimeter = 4 * initial_length;
}
void Square::grow(int amount)
{
   perimeter = perimeter + 4 * amount;
}
int Square::get_perimeter() const
{
   return perimeter;
}
int Square::get_side_length() const
{
   return perimeter / 4;
}

int main()
{
   int initial_len;
   int grow_amount;
   
   cin >> initial_len;
   cin >> grow_amount;
   
   Square my_square; 
   my_square.set_side(initial_len);
   cout << "Side Length: "; 
   cout << my_square.get_side_length() << endl;
   cout << "Perimeter: "; 
   cout << my_square.get_perimeter() << endl;
   cout << "\nGrow by " << grow_amount << endl;
   my_square.grow(grow_amount);
   cout << "\nNew Side Length: "; 
   cout << my_square.get_side_length() << endl;
   cout << "New Perimeter: "; 
   cout << my_square.get_perimeter() << endl;
   
   return 0;
}
