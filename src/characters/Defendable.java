package oop.characters;

public interface Defendable {

    int baseDefense = 10;

    // TODO: make defend() and spDefend() return an int, which will be subtracted from the attacker's attack value
    void defend();
    void spDefend();
}
