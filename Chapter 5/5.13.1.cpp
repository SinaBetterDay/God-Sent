#include <iostream>
using namespace std;

int main()
{
   const int COLS = 3;
   const int ROWS = 6;
   int data[ROWS][COLS] =
      {
         { 1, 2, 3 }, { 3, 3, 7 }, { 1, 5, 2 },
         { 0, 1, 1 }, { 0, 0, 4 }, { 3, 1, 1 }
      };

   // Sum values in one row in data
   int row;
   cin >> row;
   int sum = 0;

   for (int i=0; i<=2; i++)
   {
      sum += data[row][i];
   }

   cout << "row " << row << ": " << sum << endl;

   return 0;
}
