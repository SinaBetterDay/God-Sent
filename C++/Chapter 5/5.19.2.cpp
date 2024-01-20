/**
   Fills a given column of a two-dimensional array with a given value.
   @param values the array
   @param rows the rows in the array
   @param column the column to fill
   @param fill_value the value to fill it with
*/

const int COLS = 2;
void fill_column(int values[][COLS], int rows, int column, int fill_value) 
{
   for (int i=0; i<rows; i++)
   {
      values[i][column] = fill_value;
   }
}
