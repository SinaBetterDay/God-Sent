template<typename T>
void Repeat<T>::print(ostream& out) const
{
  for (int i = 1; i <= count; i++)
  {
    out << item;
  }
}
