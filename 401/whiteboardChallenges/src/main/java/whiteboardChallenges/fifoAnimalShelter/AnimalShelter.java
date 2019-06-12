package whiteboardChallenges.fifoAnimalShelter;

public class AnimalShelter<T> {
    // instantiate Stacks
    private AnimalStack<T> stackOne;
    private AnimalStack<T> stackTwo;

    public void enqueue(T val) {
        this.stackOne.push(val);
    }

    public T dequeue(T preference) {
        if (this.stackOne.isEmpty()) {
            // null check
            throw new IllegalArgumentException("There is no top value, operation cannot be completed");
        }

        if (preference == "dog" || preference == "cat") {
            // return first value based on preference
            while (this.stackOne.peek() != preference) {
                this.stackOne.pop();
            }

            return this.stackOne.pop();
        } else if (preference == "none") {
            // return oldest (bottom of queue) if no preference
            while (!this.stackOne.isEmpty()) {
                this.stackTwo.push(this.stackOne.pop());
            }

            return this.stackTwo.pop();
        } else {
            // if any other value besides "dog, "cat", or "none" return null
            return null;
        }

    }

    // instantiale class
    public AnimalShelter() {
        stackOne = new AnimalStack<>();
        stackTwo = new AnimalStack<>();
    }
}
