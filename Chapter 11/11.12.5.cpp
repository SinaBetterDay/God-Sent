#include <iostream>
#include <string>
using namespace std;

struct StreetAddress
{
   int house_number;
   string street_name;
};

void print_address(StreetAddress address, bool number_first)   
{
   if(number_first == false){
      cout <<  address.street_name << " " << address.house_number;
      }
   else{

       cout << address.house_number << " " << address.street_name;
      }
}
