   package com.example;

   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class ContainerTest {

       @Test
       public void testAddAndGet() {
           Container container = new Container();
           container.add("Hello");
           container.add(123);
           
           assertEquals(2, container.getSize());
           assertEquals("Hello", container.get(0));
           assertEquals(123, container.get(1));
       }

       @Test
       public void testRemove() {
           Container container = new Container();
           container.add("Hello");
           container.add(123);
           container.add(45.67);

           container.remove(1); // Удаляем элемент по индексу 1 (123)

           assertEquals(2, container.getSize());
           assertEquals("Hello", container.get(0));
           assertEquals(45.67, container.get(1));
       }

       @Test
       public void testGetOutOfBounds() {
           Container container = new Container();
           
           Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
               container.get(0);
           });
           
           assertEquals("Index: 0, Size: 0", exception.getMessage());
       }

       @Test
       public void testRemoveOutOfBounds() {
           Container container = new Container();

           Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
               container.remove(0);
           });

           assertEquals("Index: 0, Size: 0", exception.getMessage());
       }
   }
   
