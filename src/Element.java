public class Element <T> {
    private T object = null;
    private Element next = null;

    public Element(T newObject) {
        object = newObject;
    }

    public void setNext(Element newNext) {
        next = newNext;
    }

    public Element getNext() {
        return next;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object newObject) {
        object = (T) newObject;
    }

    public void delete() {
        object = null;
        next = null;
    }
}
