String::~String()
{
  delete[] buffer;
}

String::String(const String& other)
{
  buffer = new char[strlen(other.buffer) + 1];
  strcpy(buffer, other.buffer);
}
