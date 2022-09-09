void swap_first_last(int values[], int len)
{
   int temp;
   if (len>0)
   {
      temp = values[0];
      values[0] = values[len-1];
      values[len-1] = temp;
   }
}
