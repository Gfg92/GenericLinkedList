public class GenericLinkedList {
    private Element firstElement = null;
    private Element lastElement = null;

    public GenericLinkedList() {
    }

    public void insertFirst(Object obj) {
        Element element = new Element(obj);
        if (firstElement == null) {
            firstElement = element;
            lastElement = firstElement;
        } else {
            element.setNext(firstElement);
            firstElement = element;
        }
    }

    public void insertLast(Object obj) {
        Element element = new Element(obj);
        if (lastElement == null) {
            lastElement = element;
            firstElement = lastElement;
        } else {
            lastElement.setNext(element);
            lastElement = element;
        }
    }

    public void print() {
        Element element = firstElement;
        while (element != null) {
            System.out.println(element.getObject());
            element = element.getNext();
        }
    }

    public boolean isEmpty() {
        if (firstElement == null) {
            return true;
        } else {
            return false;
        }
    }

    public void remove(Object obj) {
        Element element = new Element(obj);
        Element first = firstElement;
        Element aux;
        while (first != null) {
            if (first.equals(element)) {
                if (first.getNext() == null) {
                    first.delete();
                    break;
                }
                aux = first.getNext();
                first.setObject(aux.getObject());
                if (aux.getNext() != null) {
                    first.setNext(aux.getNext());
                }
                aux.delete();
            }
            first = first.getNext();
        }
    }

    private Object getObjectAtPosition(int index) {
        Element element = firstElement;
        int contador = 0;
        while (element != null) {
            if (contador == index) {
                return element.getObject();
            }
            contador++;
            element = element.getNext();
        }
        return element.getObject();
    }


    public Object getFirstObject() {
        Element element;
        element = firstElement;
        return element.getObject();
    }

    public Object getLastObject() {
        Element element;
        element = lastElement;
        return element.getObject();
    }
}
