package pkgListas;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSample {

    public static void ejemplo1() {
        List<String> taskList = new ArrayList<>(); // Fixed variable name here
        taskList.add("Sacar al perro");
        taskList.add("Ir de compras");
        taskList.add("Hacer la cama");
        taskList.add("Ir a votar"); // Fixed typo "Is a votar"

        //interar
        int pos = 0;
        for (String item : taskList) {
            System.out.println("Tarea: " + pos + ":" + item);

            pos++;
        }


        //String primerElemento=taskList.get(0);
        //System.out.println("primer elemento= "+primerElemento);

        //System.out.println(("elimina la pos 0 "));
        //taskList.remove(0);
        //primerElemento=taskList.get(0);
        //System.out.println("primer elemento= "+primerElemento);
    }


    public void ListaTareas() {
        List<ClsTaskList> tl = new ArrayList<>();
        ClsTaskList tarea = new ClsTaskList();

        tarea.setTaskName("ir a votar");
        tarea.setTaskDescription("Escuela, mesa 5");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

        tarea.setTaskName("sacar al chucho");
        tarea.setTaskDescription("llevarlo al parque");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

        tarea.setTaskName("hacer la cama");
        tarea.setTaskDescription("mi mama me regaña");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

        for (ClsTaskList item : tl) {
            System.out.println("Tarea: " + item.getTaskName());
        }
    }
}


