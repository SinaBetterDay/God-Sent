const int COLS = 3;

int even_elements(int values[][COLS], int rows)
{
   int count = 0;

   for (int i = 0; i < rows; i++)
   {
      for (int j = 0; j < COLS; j++)
      {
         if (values[i][j] % 2 == 0)
         {
            count++;
         }
      }
   }

   return count;
}
