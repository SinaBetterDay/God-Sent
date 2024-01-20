#ifndef MAYBE
#define MAYBE

template<typename T>
class Maybe
{
public:
   Maybe();
   Maybe(T v);
   bool is_valid() const;
   T get_value() const;
private:
   T value;
   bool valid;
};

template<typename T>
Maybe<T>::Maybe()
{
   valid = false;
}

template<typename T>
Maybe<T>::Maybe(T v)
{
   valid = true;
   value = v;
}

template<typename T>
bool Maybe<T>::is_valid() const
{
   return valid;
}

template<typename T>
T Maybe<T>::get_value() const
{
   return value;
}

#endif
