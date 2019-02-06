package basepatterns.behavioral.iterator;


public class IteratorRunner {
    public static void main(String[] args) {
//        String [] test = {"first","second","third"};
        Integer [] test = {1,2,3,44,5};
        Collection collection = new ConcreteCollection(test);
        Iterator it = collection.getIterator();

        while(it.hasNext()){
//            System.out.println((String)it.next());
            System.out.print((Integer)it.next() + " ");  // 1 2 3 44 5
        }
    }
}
//-------------------------------------------------------
interface Iterator{
    boolean hasNext();
    Object next();
}
//-------------------------------------------------------
interface Collection{
    Iterator getIterator();
}
//-------------------------------------------------------
class ConcreteCollection implements Collection{//-------------------------------------------------------
    public  Object[] tasks;

    public ConcreteCollection(Object[] tasks) {
        this.tasks = tasks;
    }

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    private class TaskIterator implements Iterator{ // inner class
        int index = 0;
        @Override
        public boolean hasNext() {
            if(index<tasks.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

}//---------------------------------------------------------------------------------------
