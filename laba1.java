public class Container
{
    private Obj[] elems;
    private int size;
    private int static final initialCapacity =10;
}

public Container0()
{
    elems=new Obj[initialCapacity];
    size=0;
}

public void add(Obj elem)
{
    if(size == elems.length)
    {
        resize();
    }
    elements[size++]=elem;
}

public Obj get(int index)
{
 if(index<0||index>=size)
 {
    throw new indexOutBoundsException("Index: "+index+"Size: "+size);
 }
 return elems[index];
}

public int getSize()
{
    return size;
}

private void resize()
{
    int newCapacity = elems.length*2;
    Obj[] newElements=new Obj[newCapacity];
    System.arraycopy(elems, 0,newElements, 0, elems.length);
    elems=newElements;
}

public void remove(int index)
{
if(index <0 || index>=size)
{
    throw new indexOutBoundsException("Index: "+index+"Size: "+size);
}
for (int i=index; i<size-1; i++)
{
    elems[i]=elems[i+1];
}
elems[--size]=null;
}

public static void main(String[] args)
{
    Container conteiner = new Container();
    container.add("cat");
    container.add(2512);
    container.add(5.1);

    System.out.println("Size: " + container.getSize());

    System.out.println(container.get(0));
    System.out.println(container.get(1));
    container.remove(1);

    System.out.println("Size after remove: " + container.getSize());
    System.out.println(container.get(1));



}

