#include <iostream>
using namespace std;

int main()
{
  int size;
  int* rows[10];
  for (int i = 0; i < 10; i++)
  {
    size = 10 - i;
    rows[i] = new int[size];
    
    // Adds contents to array
    for(int j = 0; j < size; j++)
    {
      rows[i][j] = i;
    }
  }
  
  size = 10
  for(int i = 0; i < 10; i++)
  {
    for(int j = 0; j < size; j++)
    {
      cout << rows[i][j] << " ";
    }
    size--;
    cout << endl;
  }
  
  // Deallocate the rows
  for (int i = 0; i < 10; i++)
  {
    delete[] rows[i];
  }
  
  return 0;
}
