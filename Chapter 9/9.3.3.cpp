#include <iostream>
#include <fstream>
using namespace std;

double sum(ifstream& in)   /* Fix this code line */
{
   double total = 0;
   double input;
   while (in >> input) { total = total + input; }
   return total;
}

int main()
{
   string filename;
   cin >> filename;
   ifstream in(filename);
   cout << sum(in) << endl;

   return 0;
}
