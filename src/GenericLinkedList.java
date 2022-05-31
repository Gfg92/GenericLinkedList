public class GenericLinkedList<T> {
    private Element<T> firstElement = null;
    private Element<T> lastElement = null;

    public GenericLinkedList() {
    }

    public void insertFirst(T obj) {
        Element<T> element = new Element<>(obj);
        if (firstElement == null) {
            firstElement = element;
            lastElement = firstElement;
        } else {
            element.setNext(firstElement);
            firstElement = element;
        }
    }

    public void insertLast(T obj) {
        Element<T> element = new Element<>(obj);
        if (lastElement == null) {
            lastElement = element;
            firstElement = lastElement;
        } else {
            lastElement.setNext(element);
            lastElement = element;
        }
    }

    public void print() {
        Element<T> element = firstElement;
        while (element != null) {
            System.out.println(element.getObject());
            element = element.getNext();
        }
    }

    public boolean isEmpty() {
        return firstElement == null;
    }

    public void remove(T obj) {
        Element<T> element = firstElement;
        Element<T> previous = null;
        while (element != null){
            if(element.getObject().equals(obj)){
                if(element == firstElement){
                    firstElement = element.getNext();
                }else {
                    previous.setNext(element.getNext());
                    if(element == lastElement){
                        lastElement = previous;
                    }
                }
                element.delete();
            }
            previous = element;
            element = element.getNext();
        }
    }

    private T getObjectAtPosition(int index) {
        Element<T> element = firstElement;
        int contador = 0;
        while (element != null) {
            if (contador == index) {
                return element.getObject();
            }
            contador++;
            element = element.getNext();
        }
        return null;
    }


    public T getFirstObject() {
        if(firstElement == null){
            return null;
        }
        return firstElement.getObject();
    }

    public T getLastObject() {
        if(lastElement == null){
            return null;
        }
        return lastElement.getObject();
    }
}
