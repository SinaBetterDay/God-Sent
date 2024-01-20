int Time::operator-(const Time& other) const
{
  return hours * 60 + minutes - other.hours * 60 - other.minutes;
}
