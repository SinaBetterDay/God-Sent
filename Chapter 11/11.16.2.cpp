#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;

int main()
{
   int sum = 0.0;

   bool done = false;
   while (! done)
   {
      cout << "Enter an integer, Q to quit: ";
      string input;
      cin >> input;
      cout << input << endl;
      if (input == "Q" || input == "q")
      {
         done = true;
      }
      else
      {
         sum += atoi(input.c_str());
      }

   }
   cout << "Sum: " << sum << endl;

   return 0;
}
