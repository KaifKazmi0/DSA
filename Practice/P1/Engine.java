package Practice;

public interface Engine {
    default void engineStart(){
        System.out.println("Hey from engine");
    };

}
