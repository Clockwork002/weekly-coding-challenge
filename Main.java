import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting program...");
        String[] doors = new String[100];
        for (int k =0; k<100;k++){
            doors[k] = "closed";
        }
        for (int i = 0;i<100;i++) {
            int opendoors = i + 1;
            for (int j=i;j < 101; j = j + opendoors){
                if (Objects.equals(doors[j], "closed")){
                    doors[j] = "open";
                    
                }
                if (Objects.equals(doors[j], "open")){
                    doors[j] = "closed";
                }
            }
        }
        for (int h =0; h < 100; h++){
            int counter = 0;
            if (Objects.equals(doors[h], "open")){
                counter++;
            }
            System.out.println(counter);
        }
        
    }

}