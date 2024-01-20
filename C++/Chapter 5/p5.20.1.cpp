#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main()
{
   vector<string> words;

   string word;
   while (cin>>word)
   {
      words.push_back(word);
   }

   for (int i = words.size()-1; i>=0; i--)
   {
      cout << words[i] << " ";
   }
   
   return 0;
}
