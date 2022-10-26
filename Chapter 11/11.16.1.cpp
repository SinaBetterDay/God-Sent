void replace_zeroes(int* values, int size, int replacement)
{
   int* p = values;
   
   int* end = values + size;
   while (p != end)
   {
      if (*p == 0) 
      {
         *p = replacement;
      }
      p++;
   }

}










/*
   for(int i = 0; i < size; i++)
   {
      //p[i] == *(p + i)
      if(p[i] == 0)
      {
         p[i] = replacement;
      }
   }
*/
