#ifndef PAIR_H
#define PAIR_H

template<typename T>
class Pair
{
public:
   Pair(T a, T b);
   T get_first() const;
   T get_second() const;
   Pair<T> sum_diff() const;
private:
   T first;
   T second;
};

template<typename T>
Pair<T>::Pair(T a, T b)
{
   first = a;
   second = b;
}

template<typename T>
T Pair<T>::get_first() const
{
   return first;
}

template<typename T>
T Pair<T>::get_second() const
{
   return second;
}

template<typename T>
Pair<T> Pair<T>::sum_diff() const
{
   return Pair(first+second, first-second);
}

#endif
