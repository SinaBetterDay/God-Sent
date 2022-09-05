#include <iostream>
#include <string>
using namespace std;

/**
   Prints a string in a box.
   @param contents the string to enclose in a box
*/
void box_string(string contents)
{
   int n = contents.length();
   for (int i = 0; i < n + 2; i++) { cout << "-"; }
   cout << endl;
   cout << "!" << contents << "!" << endl;
   for (int i = 0; i < n + 2; i++) { cout << "-"; }
   cout << endl;
}

int main()
{

   string bye = "Hello";
   string uwu = " C++ ";
   string ihavebraindamage = "World";
   
   box_string(bye);
   box_string(uwu);
   box_string(ihavebraindamage);
   
   return 0;
}
