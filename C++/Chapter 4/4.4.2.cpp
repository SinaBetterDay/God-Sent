#include <iostream>
using namespace std;
int first_space(string str)
{
  int position = -1;
  bool found = false;
  for (int i = 0; !found && i < str.length(); i++)
  {
    string ch = str.substr(i, 1);
    if (ch == " ")
    {
      position = i;
      found = true;
    }
  }
  return position;
}

int main() 
{
   string input_str;
   getline(cin, input_str);
   int first_space_position = first_space(input_str);
   cout << first_space_position << endl;

   return 0;
}
