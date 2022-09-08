#include <iostream>
using namespace std;

void print_array(int a[], int size);

int main()
{
   const int SIZE = 18;
   int a[SIZE];

   for (int i=0; i<SIZE; i+=3)
   {
      a[i] = 0;
      a[i+1] = 1;
      a[i+2] = 2;
   }
 
   print_array(a, SIZE);

   return 0;
}

/**
   Prints an array of comma separated int.
   @param a the array of strings
   @param size the size of the array
*/
void print_array(int a[], int size)
{
   cout << "[";
   if (size > 0)
   {
      cout << a[0];
      for (int i = 1; i < size; i++)
      {
         cout << ", " << a[i];
      }
   }
   cout << "]" << endl;
}
