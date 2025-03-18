package example;
public class human {
    public String name;
    public String soname;
    public static int count;

    //будет считать количество экземляров класса и определять переменные
    public human(String name, String soname){
        this.name = name;
        this.soname = soname;
        count++;
    }
    
    //проверить всего созданных экземпляров
    public static void check(){
        System.out.println("Всего экземпляров создано: " + count);
    }
  
}