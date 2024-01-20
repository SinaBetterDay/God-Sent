#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main()
{
   vector<string> vowels = {"a","e","i","o","u"};

   cout << "vowels: [" << vowels[0];
   for (int i = 1; i < vowels.size(); i++)
   {
      cout << ", " << vowels[i];
   }
   cout << "]" << endl;

   return 0;
}
