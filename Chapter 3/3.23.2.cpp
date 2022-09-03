#include <iostream>
using namespace std;

int main() 
{
   int i;
   cin >> i;
   string str;
   cin >> str;
bool found = false;
int position = 0;
string ch = "?";
string target = str.substr(i, 1);
while (!found && position < str.length())
{
ch = str.substr(position, 1);
if (ch == target && position != i)
{
   found = true;
}
else { position++; }
}
if (!found)
{ 
   cout << target << " occurs once" << endl; 
}
   else 
   { 
      cout << target;
      cout << " occurs more than once" << endl;
   }
   return 0;
}
