import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class zadanie1{
private static Logger logger = Logger.getLogger(zadanie1.class.getName());
private static SimpleFormatter sFormat = new SimpleFormatter();


    /**
     * @param args
     */
    public static void main(String[] args) {
           
        try {
        FileHandler fh = new FileHandler("log_zadanie1.log");
       // FileHandler fh = new FileHandler("log_zadanie2.txt");
        fh.setFormatter(sFormat);
        logger.addHandler(fh);
        } catch (Exception e) {
            e.printStackTrace();
        }
            logger.info("Тестовое логироование 1");
            int [] mas = {11, 3, 14, 16, 7};
    
            boolean isSorted = false;
            int buf;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length-1; i++) {
                    if(mas[i] > mas[i+1]){
                        isSorted = false;
    
                        buf = mas[i];
                        mas[i] = mas[i+1];
                        mas[i+1] = buf;
                    }
                }
                System.out.println(Arrays.toString(mas));
         
            }
        
           
            
            
            logger.log(Level.WARNING, "Тестовое логирование 2");
            
            


    }  
}
   


