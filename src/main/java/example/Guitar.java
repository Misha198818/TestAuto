package example;

public class Guitar implements Playable{
    
    @Override
    public void play() {
        System.out.println("Играем на гитаре используя " + strings.getCount() + " струн");
    }
    
}
