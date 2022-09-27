#include <iostream>
#include <string>
#include <fstream>
#include <cctype>
using namespace std;

int main()
{
   string vowels = "aeiou";
   int counters[] = {0, 0, 0, 0, 0};

   cout << "Input file: " << endl;
   string input_file_name;
   cin >> input_file_name;

   ifstream in(input_file_name);
   char c; 
   int count1,count2,count3,count4,count5 = 0;
   while(in.get(c)){
      if(c == 'a' || c == 'A'){
         count1++;
         }
      if(c == 'e' || c == 'E'){
         count2++;
         }
      if(c == 'i' || c == 'I'){
         count3++;
         }
      if(c == 'o' || c == 'O'){
         count4++;
         }
      if(c == 'u' || c == 'U'){
         count5++;
         }
   }
   counters[0] = count1; 
   counters[1] = count2;
   counters[2] = count3;
   counters[3] = count4;
   counters[4] = count5;
   
   for (int i = 0; i < vowels.length(); i++)
   {
      cout << vowels[i] << ": " << counters[i] << endl;
   }
   
   return 0;
}
