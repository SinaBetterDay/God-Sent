#include <iostream>
#include <string>
using namespace std;
/**
   Prints a string in a box.
   @param contents the string to enclose in a box
*/

/* Modify this function */
void box_string(string contents)
{
   int n = contents.length();
   for (int i = 0; i < n + 4; i++) { cout << "-"; }
   cout << endl;
   cout << "! " << contents << " !" << endl;
   for (int i = 0; i < n + 4; i++) { cout << "-"; }
   cout << endl;
}

int main()
{
   box_string("Hello");

   return 0;
}
