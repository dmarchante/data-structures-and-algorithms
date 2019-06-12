package whiteboardChallenges.fifoAnimalShelter;

public class AnimalStack<T> {
    private Animal<T> topNode;
    private int size;

    public void push (T val) {
        Animal<T> newNode = new Animal(val);

        if (this.topNode == null) {
            this.topNode = newNode;
        } else {
            newNode.nextNode = this.topNode;
            this.topNode = newNode;
        }

        size ++;
    }

    public T pop() {
        if (this.topNode == null) {
            throw new IllegalArgumentException("There is no top value, operation cannot be completed");
        }

        T newNode = this.topNode.animalSpecies;
        this.topNode = this.topNode.nextNode;

        size --;

        return newNode;
    }

    public T peek () {
        if (this.topNode == null) {
            throw new IllegalArgumentException("There is no top value, operation cannot be completed");
        } else {
            return this.topNode.animalSpecies;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public AnimalStack() {
        topNode = null;
    }

    public class Animal<T> {
        T animalSpecies;
        Animal<T> nextNode;

        public Animal(T value) {
            this.animalSpecies = value;
        }
    }
}
