#include <iostream>

using namespace std;

void shout(string str)
{
   cout << str << "!!!" << endl;
}

int main()
{
   string input1;
   cin >> input1;
   string input2;
   cin >> input2;
   
   
   shout(input1);
   shout(input2);
   
   return 0;
}
