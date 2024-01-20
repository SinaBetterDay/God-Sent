#include <iostream>
using namespace std;

string repeat(int n, string str)
{
  string result = "";
  for (int i = 1; i <= n; i++)
  {
    result = result + str;
  }
  return result;
}

void box_string(string contents)
{
  int n = contents.length();
  cout << repeat(n + 2, "-") << endl;
  cout << "!" << contents << "!" << endl;
  cout << repeat(n + 2, "-") << endl;
}

int main()
{
   string contents;
   getline(cin, contents);
   box_string(contents);
   
   return 0;
}
