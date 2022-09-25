#include <iostream>
#include <fstream>
using namespace std;

int main() 
{
ifstream in;
in.open("input.txt");
ofstream out;
out.open("words.txt");
int counter = 0;
string word;
while (in >> word)
{
counter++;
out << counter << ". " << word << endl;
}

   return 0;
}
