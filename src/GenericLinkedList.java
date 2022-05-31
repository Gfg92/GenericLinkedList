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
        return firstElement == null;
    }

    public void remove(Object obj) {
        Element element = firstElement;
        Element previous = null;
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
        return null;
    }


    public Object getFirstObject() {
        if(firstElement == null){
            return null;
        }
        return firstElement.getObject();
    }

    public Object getLastObject() {
        if(lastElement == null){
            return null;
        }
        return lastElement.getObject();
    }
}
