#include <string>
#include <cctype>
#include <iostream>
using namespace std;

/**
   Cleans a string containing an integer and converts it.
   @param number a string containing an integer and possibly extraneous 
      characters
   @return the value of the number inside the string
*/
int clean(string number)
{
  int n;
  string temp = "";
  for (int i = 0; i < number.size(); i++)
  {
     if (number[i] >= '0' && number[i] <= '9' || number[i] == '-')
     {
        temp = temp + number[i];
     }
  }
  n = stoi(temp);
  return n;
}

int main()
{
   string str;
   cin >> str;
   
   cout << clean(str);  
 
   return 0;  
}
