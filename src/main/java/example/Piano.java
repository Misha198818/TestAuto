package example;

public class Piano implements Playable{
    
    @Override
    public void play() {
        System.out.println("Играем на пианино используя " + strings.getCount() + " струн");
    }
    
}
