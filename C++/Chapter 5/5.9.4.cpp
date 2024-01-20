#include <iostream>
using namespace std;

/**
   Finds the next occurrence of an element in an array.
   @param values an array of values
   @param searched_value the value to search for
   @param start the position at which to start the search
   @return the position of the first match at position >= start,
   or -1 if the element was not found
*/
int find_next(int values[], int size, int searched_value, int start);
   // From preceding problem

/**
   Finds the positions of all occurrences of an element in an array.
   @param values an array of values
   @param size the number of elements in values
   @param matches an array to hold the positions of all matches
   @param searched_value the value to search for
   @return the number of matches found
*/
int find_all(int values[], int size, int matches[], int searched_value)
{
   int matches_array_size = 0;
   
   int pos = -1;
   do
   {
      pos = find_next(values, size, searched_value, pos + 1);
      if (pos != -1) 
      {
         matches[matches_array_size] = pos;
         matches_array_size++;
      }
   } 
   while (pos != -1);
   return matches_array_size;
}
