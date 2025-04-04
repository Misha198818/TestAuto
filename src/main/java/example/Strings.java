package example;


public class Strings {
    
    private enum Enums{

        COUNT(12);

        private final int count;

        Enums(int count) {
            this.count = count;
        }
    }

    public int getCount(){      
        return Enums.COUNT.count;
    }
    
}
