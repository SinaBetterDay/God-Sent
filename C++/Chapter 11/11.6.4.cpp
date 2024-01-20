#include <iostream>
using namespace std;

int main()
{
  int value;
  bool done;
  cout << "Enter an integer, Q to quit" << endl;
  
  string input;
  cin >> input;
  cin >> value;
  if (input == "Q") { done = true; }
  else { value = atoi(input.c_str()); }
  
  if (done != true) { cout << value << endl; }
  
  return 0;
}
