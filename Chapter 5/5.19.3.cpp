#include <iostream>
#include <string>
using namespace std;

const int COLS = 3;
const int ROWS = 3;

void print(string a[][COLS], int rows);
int main()
{
   string board[ROWS][COLS] =
   {
      "x","o","x","o","o"," "," ","x"," "
   };

   print(board, ROWS);

   return 0;
}
