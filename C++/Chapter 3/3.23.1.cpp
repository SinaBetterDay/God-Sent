#include <iostream>
#include <string>
using namespace std;

int main()
{
   bool found = false;
   string str;
   cin >> str;
   string target = str.substr(0, 1);
int position = 1;
while (!found && position < str.length())
{
string ch = str.substr(position, 1);
if (ch == target) { found = true; }
else { position++; }
}
if (!found) { cout << target << " occurs once"; }
   else { cout << target << " occurs more than once"; }
   cout << endl;
   
   return 0;
}
