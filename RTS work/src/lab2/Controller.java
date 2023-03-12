package lab2;

public class Controller extends Thread {
    private int id;
    private Model model;

    public Controller(int id, int priority, Model model) {
        this.id = id;
        this.model = model;
        setPriority(priority);
    }

    public void run(){
        int c = 0;
        while(c < 1000){
            for(int j=0; j<model.getProcessorLoad(); j++){
                j++;

            }
            c++;
            model.setProgressValue(id, c);
        }
    }
}
