#include "maybe.h"

Maybe::~Maybe()
{
   delete value_ptr;
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

bool Maybe::is_valid() const
{   
   return value_ptr != nullptr;
}

int Maybe::get_value() const
{
   return *value_ptr;
}
