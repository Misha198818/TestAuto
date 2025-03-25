package example;

public class Car {
    public String model;
    public int year;
   
    //база марок авто
     static String models[] = new String[] {"nissan", "toyota", "opel", "saab", "renault"};
     
    //Будет проверять существующую в базе марку авто
    //Если авто будет не найдено выведет все марки в базе
    //Если авто найдется то взависимости от года будет выбран цвет
    public static void makeBeBe(String model, int year){
            
        String modelOut = null;
        String color;

        for (String x:models) {
            if (x.equals(model.toLowerCase())){
                modelOut = x;
            }
        };

        if (modelOut != null && year >= 2020){
            color = "цвет красный";
            System.out.println("Произведена " + model + " " +  year + "г." + color);
        } else if(modelOut != null && year < 2020){
            color = "цвет синий";
            System.out.println("Произведена " + model + " " + year + "г." + color);
        } else {
            System.out.println("Марки " + model + " не найдено в базе");
            System.out.println("Вы можете выбрать из:");
            for (String x:models) {              
                    System.out.println(x);
            };
        }
        
};

}
