#ifndef VECTOR_H_INCLUDED
#define VECTOR_H_INCLUDED

#include <iostream>
using namespace std;

namespace Vector
{
    // an almost real vector of Ts:
    template<class T> class vector {	// read "for all types T" (just like in math)
        size_t sz;		// the size
        T* elem;		// a pointer to the elements
        size_t space;		// size+free_space
    public:
        vector() : sz{0}, elem{0}, space{0} {}		// default constructor
        explicit vector(size_t s) :sz{s}, elem{new T[s]}, space{s} { }	// constructor
        vector(const vector&);			// copy constructor
        vector& operator=(const vector&);		// copy assignment

        ~vector() { delete[ ] elem; }			// destructor

        T& at(size_t n);				// checked access
        const T& at(size_t n) const;		// checked access

        T& operator[](size_t n);			// unchecked access
        const T& operator[](size_t n) const;	// unchecked access

        size_t size() const { return sz; }			// the current size

        void resize(size_t newsize);			// grow
        void push_back(T d);			// add element

        void reserve(size_t newalloc);			// get more space
        int capacity() const { return space; }		// current available space

        // …
    };

    struct out_of_range_ { /* … */ };

    template<class T> T& vector<T>::operator[](size_t n)
    {
        return elem[n];
    }

    template<class T> const T& vector<T>::operator[](size_t n) const
    {
        return elem[n];
    }

    template<class T> T& vector<T>::at(size_t n)
    {
        if (n<0 || sz<=n) throw out_of_range("error");
        return elem[n];
    }

    template<class T> const T& vector<T>::at(size_t n) const
    {
        if (n<0 || sz<=n) throw out_of_range("error");
        return elem[n];
    }


    template<class T> vector<T>::vector(const vector<T>& a)
        :sz{a.sz},  elem{new T[a.sz]}, space{a.sz}
    // allocate space for elements, then initialize them (by copying)
    {
        cout << "Copy constructor" << endl;
        for (size_t i = 0; i<sz; ++i)
            elem[i] = a.elem[i];
    }

    template<class T> vector<T>& vector<T>::operator=(const vector<T>& a)
    {
        cout << "Copy assignment" << endl;
        if (this==&a) return *this;	// self-assignment, no work needed

        if (a.sz<=space) {		// enough space, no need for new allocation
            for (size_t i = 0; i<a.sz; ++i) elem[i] = a.elem[i];	// copy elements
            sz = a.sz;
            return *this;
        }

        T* p = new T[a.sz];			// copy and swap
        for (size_t i = 0; i<a.sz; ++i) p[i] = a.elem[i];
        delete[ ] elem;
        sz = a.sz;
        space = a.sz;
        elem = p;
        return *this;
    }

    template<class T> void vector<T>::reserve(size_t newalloc)
        // make the vector have space for newalloc elements
    {
        if (newalloc<=space) return;		// never decrease allocation
        T* p = new T[newalloc];	// allocate new space
        for (size_t i=0; i<sz; ++i) p[i]=elem[i];	// copy old elements
        delete[ ] elem;			// deallocate old space
        elem = p;
        space = newalloc;
    }

    template<class T> void vector<T>::resize(size_t newsize)
        // make the vector have newsize elements
        // initialize each new element with the default value 0.0
    {
        reserve(newsize);		// make sure we have sufficient space
        for(size_t i = sz; i<newsize; ++i) elem[i] = T();	// initialize new elements
        sz = newsize;
    }

    template<class T> void vector<T>::push_back(T d)
        // increase vector size by one
        // initialize the new element with d
    {
        if (sz==0) 		// no space: grab some
            reserve(8);
        else if (sz==space) 	// no more free space: get more space
            reserve(2*space);
        elem[sz] = d;		// add d at end
        ++sz;		// and increase the size (sz is the number of elements)
    }

    template<class T> ostream& operator<<(ostream& os, vector<T> v)
    {
        for(size_t i = 0; i < v.size(); i++)
        {
            os << v[i] << " ";
        }
        return os;
    }
}

#endif // VECTOR_H_INCLUDED
