#ifndef ChildAnimal_H
#define ChildAnimal_H

#include <iostream>
#include <string>
#include "Animal.h"

using namespace std;

class Dog : public Mammal
{
public:
    Dog() {}

    Dog(string name, COLOR c, string owner) : Mammal(name, c)
    {
        _owner = owner;
    }

    ~Dog() {}

    void speak()
    {
        cout << "Dog woofs " << endl;
    }

    void move() override
    {
        cout << "Dog walks " << endl;
    }

    void eat() override
    {
        cout << "Dog eats " << endl;
    }

private:
    string _owner;
};

class Cat : public Mammal
{
public:
    Cat() {}

    Cat(string name, COLOR c, string owner) : Mammal(name, c)
    {
        _owner = owner;
    }

    ~Cat() {}

    void speak()
    {
        cout << "Cat meows " << endl;
    }

    void move() override
    {
        cout << "Cat walks " << endl;
    }

    void eat() override
    {
        cout << "Cat eats " << endl;
    }

private:
    string _owner;
};

class Lion : public Mammal
{
public:
    Lion() {}

    Lion(string name, COLOR c, string owner) : Mammal(name, c)
    {
        _owner = owner;
    }

    ~Lion() {}

    void speak()
    {
        cout << "Lion roars " << endl;
    }

    void move() override
    {
        cout << "Lion runs " << endl;
    }

    void eat() override
    {
        cout << "Lion eats " << endl;
    }

private:
    string _owner;
};

#endif