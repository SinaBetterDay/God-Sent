#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() 
{
   string file_name = "test.txt";
   int pos1 = 0;
   int pos2 = 6;
   cout << "File contents before: Hello World" << endl;
fstream strm;
strm.open(file_name.c_str(), 
   ios::in | ios::out | ios::binary);
strm.seekg(pos1);
int value1 = strm.get();
strm.seekg(pos2);
int value2 = strm.get();
strm.seekp(pos2);
strm.put(value1);
strm.seekp(pos1);
strm.put(value2);
   strm.close();

   cout << "File contents after: ";
   strm.open(file_name.c_str(), 
      ios::in | ios::out | ios::binary);
   string print_out;
   while (getline(strm, print_out))
   {
      cout << print_out << endl;
   }

   return 0;
}
