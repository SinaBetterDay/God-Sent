#include <iostream>
#include <vector>
using namespace std;

void PrintVectors(vector<int> numsList) {
   unsigned int i;

   for (i = 0; i < numsList.size(); ++i) {
      cout << numsList.at(i) << " ";
   }
   cout << endl;
}

int main() {
   vector<int> numsList;
   int userInput;
   int i;

   for (i = 0; i < 3; ++i) {
      cin >> userInput;
      numsList.push_back(userInput);
   }

   numsList.insert(numsList.begin() , 100);
   numsList.erase(numsList.begin() + 2);
   numsList.insert(numsList.begin() + 2 , 102);

   PrintVectors(numsList);

   return 0;
}
