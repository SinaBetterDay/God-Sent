template<typename T>
class Repeat
{
  private:
  int count;
  T item;
  public:
  Repeat(T item_to_repeat, int repeat_count);
  void print(ostream& out) const;
};
