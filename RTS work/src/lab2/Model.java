package lab2;

import java.util.ArrayList;
import java.util.Observable;

public class Model extends Observable {
    private int noOfThreads;
    private int processorLoad;
    private ArrayList<Integer> progressValues;

    public Model(int noOfThreads, int processorLoad) {
        this.noOfThreads = noOfThreads;
        this.processorLoad = processorLoad;
        this.progressValues = new ArrayList<Integer>();
        for (int i = 0; i < noOfThreads; i++) {
            this.progressValues.add(0);
        }
    }

    public int getNoOfThreads() {
        return noOfThreads;
    }

    public int getProcessorLoad() {
        return processorLoad;
    }

    public int getProgressValue(int id) {
        return progressValues.get(id);
    }

    public void setProgressValue(int id, int value) {
        progressValues.set(id, value);
        setChanged();
        notifyObservers(id);
    }
}