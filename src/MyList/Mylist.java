package MyList;

public class Mylist<E> {
    private Object[] element;
    protected static int size = 0;
    protected static int CAPACITY = 10;


    public Mylist() {
        element = new Object[CAPACITY];
    }

    public Object[] getElement() {
        return element;
    }

    public void setElement(Object[] element) {
        this.element = element;
    }

    public Object[] copyElement(int capacity) {
        Object[] newArr = new Object[capacity];
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                newArr[i] = this.element[i];
            }
        }
        return newArr;
    }

    public void insert(int index, E element) {
        if (size == CAPACITY) {
            CAPACITY += 2;
            this.element = copyElement(CAPACITY);
        }
        if (index >= 0 && index <= size) {
            for (int i = size; i >= 0; i--) {
                if (i == index) {
                    this.element[i] = element;
                    break;
                }
                this.element[i] = this.element[i - 1];
            }
            size++;
        } else {
            System.err.println("err");
        }
    }

    public void add(E element) {
        if (size == CAPACITY) {
            CAPACITY += 2;
            this.element = copyElement(CAPACITY);
        }
        this.element[size] = element;
        size++;

    }

    public E get(int index) {
        return (E) this.element[index];
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            Object[] newArr = new Object[CAPACITY];
            if (index == size - 1) {
                for (int i = 0; i < index; i++) {
                    newArr[i] = this.element[i];
                }
                size--;
                this.element = newArr;
            } else {
                for (int i = 0; i < size - 1; i++) {
                    if (i < index) {
                        newArr[i] = this.element[i];
                    } else {
                        newArr[i] = this.element[i + 1];
                    }
                }
                size--;
                this.element = newArr;

            }
        } else {
            System.err.println("index không tồn tại");
        }
    }
}