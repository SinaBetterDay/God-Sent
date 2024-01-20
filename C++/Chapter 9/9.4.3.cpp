#include <iostream>
#include <string>
#include <fstream>
using namespacestd;

void process(string name, string grade);

int main()
{
  ifstream in;
  in.open("scores.txt");
  string line;
  while (getline(in, line))
  {
    int i = line.length() - 1;
    while (isdigit(line[i]))
    {
      i--;
    }
    string grade = line.substr(i + 1);
    int j = i;
    while (j > 0 && isspace(line[j]))
    {
      j--;
    }
    string name = line.substr(0, j + 1);
    process(name, grade);
  }
  return 0;
}

void process(string name, string grade)
{
  cout << name << " " << grade << endl;
}
