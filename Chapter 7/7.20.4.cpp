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
   int side_length;
};
void Square::set_side(int initial_length) 
{
   side_length = initial_length;
}
void Square::grow(int amount) 
{
   side_length = side_length + amount; 
}
int Square::get_perimeter() const 
{
   return 4 * side_length; 
}
int Square::get_side_length() const 
{
   return side_length; 
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
   cout << "Side Perimeter: ";
   cout << my_square.get_perimeter() << endl;
   cout << "\nGrow by ";
   cout << grow_amount << endl;
   my_square.grow(grow_amount);
   cout << "\nNew Side Length: ";
   cout << my_square.get_side_length() << endl;
   cout << "New Perimeter: ";
   cout << my_square.get_perimeter() << endl;
   
   return 0;
}
