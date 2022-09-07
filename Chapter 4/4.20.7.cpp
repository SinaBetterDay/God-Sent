#include <iostream>
#include <string>
using namespace std;

/**
   Prints a string in a box with corners.
   @param contents the string to enclose in a box
*/
void box_string(string contents)
{
   int n = contents.length();
   
   cout << "+";
   for (int i = 0; i < n ; i++) { cout << "-"; }
   cout << "+" << endl;
   
   cout << "!" + contents + "!" << endl;
  
   cout << "+";
   for (int i = 0; i < n ; i++) { cout << "-"; }
   cout << "+" << endl;
}

int main() 
{
   box_string("Hello World");
   
   return 0;
}
