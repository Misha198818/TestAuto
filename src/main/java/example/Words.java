package example;

public class Words {

    public static void main(String[] args){

       String words[] = new String[]{"привет", "ПОКА", "гипербола"};


       for(int i = 0; i < words.length; i++){
        
            //выводим первую строку в верхнем регистре
            if(i == 0){              
                System.out.println(words[i].toUpperCase());
            //выводим вторую строку в нижнем регистре
            } else if (i == 1){                
                System.out.println(words[i].toLowerCase());
            }
            
            //Выводим слово где вторая буква О
            //Добавляем пробел между третьей и четвертой буквой
            if(words[i].toLowerCase().indexOf("о") == 1){
                StringBuilder strSpace = new StringBuilder(words[i]);
                System.out.println(strSpace.insert(3, " "));
            }
            
       }

    }

}
