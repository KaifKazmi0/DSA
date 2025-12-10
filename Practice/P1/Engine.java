package Practice.P1;

public interface Engine {
    default void engineStart(){
        System.out.println("Hey from engine");
    };

}
