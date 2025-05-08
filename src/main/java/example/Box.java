package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Box {

    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public static void sortBoxes(ArrayList <List<Double>> listIn, ArrayList <List<Double>> listOut){
        Iterator<List<Double>> iterator = listIn.iterator();
        while (iterator.hasNext()) {
            List<Double> x = iterator.next();
            if(x.get(0) > 30){
                iterator.remove();
                listOut.add(x);
            } 
            
        }

        System.out.println("Оставшиеся коробки: " + listIn);
        System.out.println("Перемещенные коробки: " + listOut);
    }


    public static void main(String[] args) {
       
        //создаем коробки
        Box box1 = new Box(20, 30, 12.5);
        Box box2 = new Box(35, 39, 20);
        Box box3 = new Box(29, 16.3, 18);
        Box box4 = new Box(56, 123, 15);

        //Добавляем коробки
        ArrayList <List<Double>> Boxes = new ArrayList <List<Double>>();
        Boxes.add(Arrays.asList(box1.width, box1.height, box1.depth));
        Boxes.add(Arrays.asList(box2.width, box2.height, box2.depth));
        Boxes.add(Arrays.asList(box3.width, box3.height, box3.depth));
        Boxes.add(Arrays.asList(box4.width, box4.height, box4.depth));

        //Сюда перемещаются неподходящие коробки
        ArrayList <List<Double>> invalidBoxes = new ArrayList <List<Double>>();

        //Сортируем
        sortBoxes(Boxes, invalidBoxes);

    }
}
