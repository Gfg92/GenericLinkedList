public class Element<T> {
    private T object = null;
    private Element<T> next = null;

    public Element(T newObject) {
        object = newObject;
    }

    public void setNext(Element<T> newNext) {
        next = newNext;
    }

    public Element<T> getNext() {
        return next;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T newObject) {
        object = newObject;
    }

    public void delete() {
        object = null;
        next = null;
    }
}
