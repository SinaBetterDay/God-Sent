String& String::operator=(const String& other)
{
  if (this != &other)
  {
    delete[] buffer;
    buffer = new char[strlen(other.buffer) + 1];
    strcpy(buffer, other.buffer);
  }
  return *this;
}
