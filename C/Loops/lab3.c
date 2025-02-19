#include <stdio.h>
#include <stdlib.h>

int main() {
   int num = 0;

   printf("Input a number: \n");
   scanf("%i", &num);

   for (int i=1; i<num; i++) {
      if(i%2==1) {
         printf("for %d\n", i);
      }
   }

   int count = 1;
   while(count<8 && count<=num) {
      printf("while %d\n", count);
      count++;
   }

   count = 1;
   do {
      printf("do while %d\n", count);
      count++;
   } while(count <= num);

   return EXIT_SUCCESS;
}
