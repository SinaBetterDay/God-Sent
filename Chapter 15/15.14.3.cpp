#include "boxedtext.h"

BoxedText::BoxedText(string text)
: Rectangle(text.size(), 1)
{
   _text = text;
}
string BoxedText::to_string() const
{
   string rect = Rectangle::to_string();
   string result = "";
   int j = 0;
   for (int i = 0; i < rect.length(); i++)
   {
      if (rect[i] == ' ')
      {
         result += _text[j];
         j++;
      }
      else
      {
         result += rect[i];
      }
   }
   return result;
}
