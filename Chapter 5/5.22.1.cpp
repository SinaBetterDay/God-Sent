#include <iostream>
using namespace std;

int main() {
   int board[8][8];
   
  for (int i = 0; i < 8; i++)
  {
    for (int j = 0; j < 8; j++)
    {
      board[i][j] = (i + j) % 2;
    }
  }
   
   for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
         cout << board[i][j];
      }
      cout << endl;
   }
   return 0;
}
