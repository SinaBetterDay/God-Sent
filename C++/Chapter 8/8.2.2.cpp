#include <iostream>
#include <fstream>
using namespace std;

int main() 
{
ifstream in;
in.open("input.txt");
ofstream out;
out.open("words.txt");
string previous = "";
string word;
while (in >> word)
{
if (word != previous)
{
out << word << " ";
previous = word;
}
}

   return 0;
}
