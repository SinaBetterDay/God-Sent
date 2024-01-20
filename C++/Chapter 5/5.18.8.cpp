#include <iostream>
#include <vector>
using namespace std;

int main()
{
   vector<int> inputs;

   int input;
   while (cin >> input) 
   {
      inputs.push_back(input);
   }
   for (int i = inputs.size()-1; i>=0; i--)
   {
      int value = inputs[i];
      cout << value << " ";
   }
   cout << endl;
   
   return 0;
}
