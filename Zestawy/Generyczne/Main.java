import java.io.Serializable;
import java.util.*;

public class Main {
    // Zadanie 1
    class Box<T> {
        private T object;

        public void set(T object) {
            this.object = object;
        }

        public T get() {
            return object;
        }
    }

    // Zadanie 2
    class Utils {
        public static <T> boolean isEqual(T obj1, T obj2) {
            return Objects.equals(obj1, obj2);
        }
    }

    // Zadanie 3
    class Counter<T> {
        private int count = 0;

        public void add(T element) {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    // Zadanie 4
    class Triple2<T, U, V> {
        private final T first;
        private final U second;
        private final V third;

        public Triple2(T first, U second, V third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        public T getFirst() {
            return first;
        }

        public U getSecond() {
            return second;
        }

        public V getThird() {
            return third;
        }
    }

    // Zadanie 5
    class ArrayUtils {
        public static <T extends Comparable<T>> T max(T[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Tablica nie może być pusta.");
            }
            T max = array[0];
            for (T element : array) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
            return max;
        }
    }

    // Zadanie 6
    interface Stack<T> {
        void push(T item);

        T pop();

        T peek();

        boolean isEmpty();
    }

    class ArrayStack<T> implements Stack<T> {
        private final List<T> stack = new ArrayList<>();

        @Override
        public void push(T item) {
            stack.add(item);
        }

        @Override
        public T pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return stack.remove(stack.size() - 1);
        }

        @Override
        public T peek() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return stack.get(stack.size() - 1);
        }

        @Override
        public boolean isEmpty() {
            return stack.isEmpty();
        }
    }

    // Zadanie 7
    class Storage<T> {
        private T item;

        public void store(T item) {
            this.item = item;
        }

        public T retrieve() {
            return item;
        }
    }

    // Zadanie 8
    class Printer {
        public static <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.println(element);
            }
        }
    }

    // Zadanie 9
    class Pair<T> {
        private final T first;
        private final T second;

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }
    }

    // Zadanie 10
    class Swapper {
        public static <T> void swap(T[] array, int index1, int index2) {
            if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
                throw new IndexOutOfBoundsException("Indeksy poza zakresem tablicy.");
            }
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    // Zadanie 11
    class GenericQueue<T> {
        private final Queue<T> queue = new LinkedList<>();

        public void enqueue(T element) {
            queue.add(element);
        }

        public T dequeue() {
            if (queue.isEmpty()) {
                throw new NoSuchElementException("Kolejka jest pusta.");
            }
            return queue.poll();
        }
    }

    // Zadanie 12: Metoda swap
    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Indeksy poza zakresem tablicy.");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Zadanie 13: Metoda reverseArray
    public static <T> void reverseArray(T[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null.");
        }
        for (int i = 0; i < array.length / 2; i++) {
            swap(array, i, array.length - 1 - i);
        }
    }

    // Zadanie 14: Metoda minValue
    public static <T extends Comparable<T>> T minValue(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null ani pusta.");
        }
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    // Zadanie 15: Metoda maxValue
    public static <T extends Comparable<T>> T maxValue(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null ani pusta.");
        }
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    // Zadanie 16: Metoda sortAndReturnFirst
    public static <T extends Comparable<T>> T sortAndReturnFirst(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null ani pusta.");
        }
        Arrays.sort(array);
        return array[0];
    }

    // Zadanie 17: Metoda printArray
    public static <T> void printArray(T[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null.");
        }
        for (T element : array) {
            System.out.println(element);
        }
    }

    // Zadanie 18: Metoda sumElements
    public static <T extends Number> double sumElements(Collection<T> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("Kolekcja nie może być null.");
        }
        double sum = 0;
        for (T element : collection) {
            sum += element.doubleValue();
        }
        return sum;
    }

    // Zadanie 19: Metoda compareElements
    public static <T> boolean compareElements(T element1, T element2) {
        return Objects.equals(element1, element2);
    }

    // Zadanie 20: Metoda printObjectInfo
    public static <T> void printObjectInfo(T object) {
        if (object == null) {
            throw new IllegalArgumentException("Obiekt nie może być null.");
        }
        System.out.println("Klasa: " + object.getClass().getName());
        System.out.println("HashCode: " + object.hashCode());
        System.out.println("ToString: " + object.toString());
    }

    // Zadanie 21: Metoda findMax dla Animal
    static class Animal {
        int age;

        Animal(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Animal (wiek=" + age + ")";
        }
    }

    static class Dog extends Animal {
        Dog(int age) {
            super(age);
        }
    }

    public static <T extends Animal> T findMax(T element1, T element2) {
        return element1.age >= element2.age ? element1 : element2;
    }

    // Zadanie 22: Metoda compareObjects dla Car
    static class Car {
    }

    static class ElectricCar extends Car {
    }

    public static <T extends Car> boolean compareObjects(T object1, T object2) {
        return object1.getClass().equals(object2.getClass());
    }

    // Zadanie 23: Metoda findMax dla Pair
    static class Pair2<T> {
        private T first;
        private T second;

        public Pair2(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public void setFirst(T first) {
            this.first = first;
        }

        public T getSecond() {
            return second;
        }

        public void setSecond(T second) {
            this.second = second;
        }
    }

    static class AnimalUtils {
        public static Animal findMax(Pair2<? extends Animal> pair, Comparator<? super Animal> comparator) {
            Animal first = pair.getFirst();
            Animal second = pair.getSecond();
            return comparator.compare(first, second) > 0 ? first : second;
        }
    }

    // Zadanie 24 i 25: Klasa Triple i metoda findMin
    static class Triple<T> {
        T first;
        T second;
        T third;

        Triple(T first, T second, T third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }

        public T getThird() {
            return third;
        }
    }

    static class Bird {
        int wysokoscLotu;

        Bird(int wysokoscLotu) {
            this.wysokoscLotu = wysokoscLotu;
        }

        @Override
        public String toString() {
            return "Bird (wysokość lotu=" + wysokoscLotu + ")";
        }
    }

    static class Eagle extends Bird {
        Eagle(int wysokoscLotu) {
            super(wysokoscLotu);
        }
    }

    public static <T extends Bird> T findMin(Triple<? extends T> triple) {
        T min = triple.getFirst();
        if (triple.getSecond().wysokoscLotu < min.wysokoscLotu) {
            min = triple.getSecond();
        }
        if (triple.getThird().wysokoscLotu < min.wysokoscLotu) {
            min = triple.getThird();
        }
        return min;
    }

    // Zadanie 26: Klasa Shape i metoda findLargest
    static class ElementPair<T> {
        private final T first;
        private final T second;

        public ElementPair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }
    }

    static class Shape {
    }

    static class Circle extends Shape {
    }

    static class ShapeUtils {
        public static <T extends Shape> T findLargest(ElementPair<? extends Shape> pair, Comparator<? super Shape> comparator) {
            Shape first = pair.getFirst();
            Shape second = pair.getSecond();
            return comparator.compare(first, second) > 0 ? (T) first : (T) second;
        }
    }

    // Zadanie 27: Klasa DoubleElement i metoda findYoungest
    static class DoubleElement<T> {
        private final T first;
        private final T second;

        public DoubleElement(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }
    }

    static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    static class Student extends Person {
        public Student(String name, int age) {
            super(name, age);
        }
    }

    static class PersonUtils {
        public static <T extends Person> T findYoungest(DoubleElement<? extends Person> pair) {
            Person first = pair.getFirst();
            Person second = pair.getSecond();
            return first.getAge() < second.getAge() ? (T) first : (T) second;
        }
    }

    // Zadanie 28: Metoda findMinMaxAge dla Dog
    static class DogUtils {
        public static void findMinMaxAge(Dog[] dogs, Pair2<? super Dog> result) {
            if (dogs == null || dogs.length == 0) {
                throw new IllegalArgumentException("Tablica psów nie może być pusta.");
            }
            Dog min = dogs[0];
            Dog max = dogs[0];

            for (Dog dog : dogs) {
                if (dog.age < min.age) {
                    min = dog;
                }
                if (dog.age > max.age) {
                    max = dog;
                }
            }
            result.setFirst(min);
            result.setSecond(max);
        }
    }

    // Zadanie 29: Metoda findMinMaxHeight dla Tree
    static class Plant {
        private final String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static class Tree extends Plant {
        private final int height;

        public Tree(String name, int height) {
            super(name);
            this.height = height;
        }

        public int getHeight() {
            return height;
        }
    }

    static class PlantUtils {
        public static void findMinMaxHeight(Tree[] trees, Pair2<? super Tree> result) {
            if (trees == null || trees.length == 0) {
                throw new IllegalArgumentException("Tablica drzew nie może być pusta.");
            }
            Tree min = trees[0];
            Tree max = trees[0];

            for (Tree tree : trees) {
                if (tree.getHeight() < min.getHeight()) {
                    min = tree;
                }
                if (tree.getHeight() > max.getHeight()) {
                    max = tree;
                }
            }
            result.setFirst(min);
            result.setSecond(max);
        }
    }

    public void main(String[] args) {
        // Zadanie 1
        Box<String> box = new Box<>();
        box.set("Witaj");
        System.out.println("Box zawiera: " + box.get());

        // Zadanie 2
        System.out.println("Czy równe: " + Utils.isEqual(5, 5));

        // Zadanie 3
        Counter<Integer> counter = new Counter<>();
        counter.add(1);
        counter.add(2);
        System.out.println("Licznik: " + counter.getCount());

        // Zadanie 4
        Triple<? extends Serializable> triple = new Triple<>(1, "Witaj", 3.14);
        System.out.println("Triple: " + triple.getFirst() + ", " + triple.getSecond() + ", " + triple.getThird());

        // Zadanie 5
        Integer[] numbers = {3, 7, 2, 9};
        System.out.println("Maksimum: " + ArrayUtils.max(numbers));

        // Zadanie 6
        Stack<String> stack = new ArrayStack<>();
        stack.push("Pierwszy");
        stack.push("Drugi");
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());

        // Zadanie 7
        Storage<Double> storage = new Storage<>();
        storage.store(2.718);
        System.out.println("Storage: " + storage.retrieve());

        // Zadanie 8
        Printer.printArray(new String[]{"Ala", "ma", "kota"});

        // Zadanie 9
        Pair<Integer> pair = new Pair<>(10, 20);
        System.out.println("Pair: " + pair.getFirst() + ", " + pair.getSecond());

        // Zadanie 10
        String[] strings = {"A", "B", "C"};
        Swapper.swap(strings, 0, 2);
        System.out.println("Po zamianie: " + Arrays.toString(strings));

        // Zadanie 11
        GenericQueue<String> queue = new GenericQueue<>();
        queue.enqueue("Element1");
        queue.enqueue("Element2");
        System.out.println("Dequeue: " + queue.dequeue());
        // Zadanie 12
        Integer[] numbersToSwap = {1, 2, 3};
        swap(numbersToSwap, 0, 2);
        System.out.println("Po zamianie: " + Arrays.toString(numbersToSwap));

        // Zadanie 13
        Integer[] numbersToReverse = {1, 2, 3, 4, 5};
        reverseArray(numbersToReverse);
        System.out.println("Po odwróceniu: " + Arrays.toString(numbersToReverse));

        // Zadanie 14
        Integer[] numbersForMinValue = {3, 7, 2, 9};
        System.out.println("Minimum: " + minValue(numbersForMinValue));

        // Zadanie 15
        Integer[] numbersForMaxValue = {3, 7, 2, 9};
        System.out.println("Maksimum: " + maxValue(numbersForMaxValue));

        // Zadanie 16
        Integer[] numbersToSort = {3, 7, 2, 9};
        System.out.println("Pierwszy po posortowaniu: " + sortAndReturnFirst(numbersToSort));

        // Zadanie 17
        String[] stringsToPrint = {"Ala", "ma", "kota"};
        printArray(stringsToPrint);

        // Zadanie 18
        List<Integer> numbersForSum = Arrays.asList(1, 2, 3, 4);
        System.out.println("Suma elementów: " + sumElements(numbersForSum));

        // Zadanie 19
        System.out.println("Czy elementy są równe: " + compareElements(5, 5));

        // Zadanie 20
        String exampleString = "Hello";
        printObjectInfo(exampleString);

        // Zadanie 21
        Dog dog1 = new Dog(3);
        Dog dog2 = new Dog(5);
        System.out.println("Starszy pies: " + findMax(dog1, dog2));

        // Zadanie 22
        ElectricCar car1 = new ElectricCar();
        ElectricCar car2 = new ElectricCar();
        System.out.println("Czy obiekty są tego samego typu: " + compareObjects(car1, car2));

        // Zadanie 23
        Pair2<Animal> animalPair = new Pair2<>(new Dog(3), new Dog(5));
        Animal maxAnimal = AnimalUtils.findMax(animalPair, Comparator.comparingInt(animal -> animal.age));
        System.out.println("Starsze zwierzę: " + maxAnimal);

        // Zadanie 24
        Triple<Bird> birdTriple = new Triple<>(new Eagle(100), new Bird(50), new Bird(80));
        System.out.println("Najniższy ptak: " + findMin(birdTriple));

        // Zadanie 26

        ElementPair<Shape> shapePair = new ElementPair<>(new Circle(), new Circle());
        Shape largestShape = ShapeUtils.findLargest(shapePair, (shape1, shape2) -> 1); // Tymczasowy komparator
        System.out.println("Największy kształt: " + largestShape);

        // Zadanie 27
        DoubleElement<Person> personPair = new DoubleElement<>(new Student("Jan", 20), new Student("Anna", 22));
        System.out.println("Najmłodsza osoba: " + PersonUtils.findYoungest(personPair));

        // Zadanie 28
        Dog[] dogs = {new Dog(3), new Dog(5), new Dog(2)};
        Pair2<Dog> dogAgePair = new Pair2<>(null, null);
        DogUtils.findMinMaxAge(dogs, dogAgePair);
        System.out.println("Młodszy pies: " + dogAgePair.getFirst() + ", starszy pies: " + dogAgePair.getSecond());

        // Zadanie 29
        Tree[] trees = {new Tree("Dąb", 15), new Tree("Sosna", 30), new Tree("Brzoza", 20)};
        Pair2<Tree> treeHeightPair = new Pair2<>(null, null);
        PlantUtils.findMinMaxHeight(trees, treeHeightPair);
        System.out.println("Najmniejsze drzewo: " + treeHeightPair.getFirst().getName() + ", najwyższe drzewo: " + treeHeightPair.getSecond().getName());
    }
}
