#include "maybe.h"

Maybe::Maybe(const Maybe& other)
{

   if (this != &other)
   {
      if(other.value_ptr != nullptr)
      {
         value_ptr = new Int;
         *value_ptr = *other.value_ptr;
      }
      else
      {
         value_ptr = nullptr;
      }
   }

}

Maybe::Maybe()
{
   value_ptr = nullptr;
}

Maybe::Maybe(int v)
{
   value_ptr = new Int;
   *value_ptr = v;
}

Maybe::~Maybe()
{
   delete value_ptr;
} 

bool Maybe::is_valid() const
{   
   return value_ptr != nullptr;
}

int Maybe::get_value() const
{
   return *value_ptr;
}
