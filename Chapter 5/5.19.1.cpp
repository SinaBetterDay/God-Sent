#include <iostream>
#include <string>
using namespace std;

const int COLS = 29;
const int ROWS = 14;
void make_maze(string contents, string cells[ROWS][COLS]);

int main()
{
   string maze[ROWS][COLS];

   make_maze(
       "*****************************\n"
       "** ***                      *\n"
       "** *** * ********************\n"
       "** *** *         *          *\n"
       "** *** * ***** *   **********\n"
       "**     * ********************\n"
       "****** *************** ******\n"
       "******         ******* ******\n"
       "*      ******* ******* ******\n"
       "* **** ******* **           *\n"
       "*    * ******* ******* ******\n"
       "* **** ******* ***     ******\n"
       "************** **************\n",
      maze);

   cout << "Row: ";
   int row; 
   cin >> row;
   cout<< row << endl;
   
   cout << "Column: ";
   int col; 
   cin >> col;
   cout<< col << endl;

   // Print free neighbors
   if (maze[row][col-1]!="*") // North 
   { 
      cout << row << " " << col-1 << endl;
   }
   if (maze[row-1][col]!="*") // West 
   { 
      cout << row-1 << " " << col << endl;
   }
   if (maze[row+1][col]!="*") // East 
   { 
      cout << row+1 << " " << col << endl;
   }
   if (maze[row][col+1]!="*") // South
   { 
      cout << row << " " << col+1 << endl;
   }

   return 0;
}

/**
   Constructs a maze from a string describing its contents.
   @param contents a string consisting of *, spaces, and newlines terminating
   the rows.
*/
void make_maze(string contents, string cells[ROWS][COLS])
{
   int rows = 0;
   int columns = 0;
   int current_length = 0;
   for (int i = 0; i < contents.length(); i++)
   {
      if (contents.substr(i, 1) == "\n")
      {
         if (current_length > columns)
         {
            columns = current_length;
         }
         current_length = 0;
         rows++;
      }
      else
      {
         current_length++;
      }
   }
   int row = 0;
   int column = 0;
   for (int i = 0; i < contents.length(); i++)
   {
      if (contents.substr(i, 1) == "\n")
      {
         row++;
         column = 0;
      }
      else
      {
         cells[row][column] = contents.substr(i, 1);
         column++;
      }
   }
}
