#include <iostream>

using namespace std;

int main()
{
   cout << "Enter values, Q to quit: " << endl;
   bool done = false;
   int sum = 0;
   int count = 0;

  string sentinel;
  int input;
  while (!done)
   {
      cin >> input;
      if (cin.fail())
      {
         cin.clear();
         cin >> sentinel;
         if (sentinel == "Q")
         {
            done=true;
         }
      }
      else if (input > 0)
      {
         sum += input;
         count++;
      }
   }
   
   if (count > 0)
   {
      cout << "Sum: " << sum << endl;
      cout << "Average: " << (sum*1.0) / count << endl;
   }
   else
   {
      cout << "No data" << endl;
   }
      
   return 0;
}
