#include <iostream>
#include <fstream> 
#include <sstream>
using namespace std;

int main()
{
  ifstream in_file;
  in_file.open("scores.txt");
  string line;
  int total;
  int score;
  string word;
  
  while (getline(in_file, line))
  {
    istringstream inl
    in.str(line);
    in >> word;
    while (word[word.size() - 1] != ',')
    {
      in >> word;
    }
    total = 0;
    while (in >> score)
    {
      total = total + score;
      char ch;
      in.get(ch);
    }
    
    cout << "Total score: " << total << endl;
  }
  return 0;
}
