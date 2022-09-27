#include <iostream>
#include <sstream>
#include <fstream>
using namespace std;

void process(string name, int grade)
{
   cout << name << "   " << grade << endl;
}

int main()
{
   string input_file; 
   cin >> input_file;
   
   // Construct the input
   ifstream in(input_file);
int grade;
string next;
string name;
string line;
while (getline(in, line))
{
istringstream string_in;
string_in.str(line);
string_in >> name;
while (string_in >> next)
{
if (isdigit(next[0]))
{
   grade = stoi(next);
}
else
{
   name = name + " " + next;
}
}
process(name, grade);
}
   return 0;
}
