#include <stdio.h>

int fun1(int num);
int fun2(int num);
float fun3(int num);

int main(int argc, char *argv[]) {
   int num;
   printf("\nRunning program %s with parameter %s\n", argv[0], argv[1]);

    while (1) {
        printf("\nEnter an integer (0 to exit): ");
        if (scanf("%i", &num) != 1) {
           continue;    
        }

        if (num == 0) {
            break;
        }

        printf("The square of %i is %i\n", num, fun1(num));
        printf("The next num is %i\n", fun2(num));
        printf("The half of %i is %6.2f\n", num, fun3(num));
    }

    return 0;
}
