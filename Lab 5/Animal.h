#ifndef Animal_H
#define Animal_H

#include <iostream>
#include <string>

using namespace std;

enum COLOR
{
    Green,
    Blue,
    White,
    Black,
    Brown
};

static const char *color_str[] = {"Green", "Blue", "White", "Black", "Brown"};

COLOR str_to_color(string c)
{
    COLOR result;

    if (c == "Green")
        result = COLOR::Green;
    else if (c == "Blue")
        result = COLOR::Blue;
    else if (c == "White")
        result = COLOR::White;
    else if (c == "Black")
        result = COLOR::Black;
    else
        result = COLOR::Brown;

    return result;
}

class Animal
{
public:
    Animal() : _name("unknown")
    {
        cout << "constructing Animal object " << _name << endl;
    }

    Animal(string n, COLOR c)
    {
        _name = n;
        _color = c;
        cout << "Name: " << _name << endl;
        cout << "Color: " << color_str[_color] << endl;
    }

    ~Animal()
    {
        cout << "destructing Animal object " << _name << endl;
    }

    virtual void speak()
    {
        cout << "Animal speaks " << endl;
    }

    virtual void move() = 0;

private:
    string _name;
    COLOR _color;
};

class Mammal : public Animal
{
public:
    Mammal() {}

    Mammal(string name, COLOR c) : Animal(name, c) {}

    ~Mammal()
    {
    }

    virtual void eat()
    {
        cout << "Mammal eats " << endl;
    }

    void move()
    {
        cout << "Mammal moves " << endl;
    }
};

#endif