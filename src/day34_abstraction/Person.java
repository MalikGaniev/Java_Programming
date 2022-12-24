package day34_abstraction;

import day34_abstraction.animalTask.Playable;
import day34_abstraction.animalTask.Swim;

public class Person implements Swim, Playable {
    @Override
    public void play() {
        System.out.println("Person can play");
    }

    @Override
    public void Swimming() {
        System.out.println("Person can swim");
    }
}
