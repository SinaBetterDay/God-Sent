#include <iostream>
#include <string>
using namespace std;

/**
   Prints a line of hyphens followed by a newline.
   @param count the number of - characters to print
*/
void print_line(int len)
{
   for (int i=0; i <= len+1; i++)
   {
      cout << "-";
   }
   cout << endl;
}

/**
   Prints a string in a box.
   @param contents the string to enclose in a box
*/
void box_string(string contents)
{
   int n = contents.length();
   print_line(n);
   cout << "! " << contents << " !" << endl;
   print_line(n);
}

int main()
{
   box_string("Hello World");

   return 0;
}
