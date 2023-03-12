package lab2;

import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class View extends JFrame implements Observer {
    private ArrayList<JProgressBar> bars;

    public View(Model model) {
        setLayout(null);
        setSize(450,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init(model.getNoOfThreads());
        model.addObserver(this);
        setVisible(true);
    }

    private void init(int n){
        bars = new ArrayList<JProgressBar>();
        for(int i=0 ;i<n; i++){
            JProgressBar pb=new JProgressBar();
            pb.setMaximum(1000);
            pb.setBounds(50,(i+1)*30,350,20);
            add(pb);
            bars.add(pb);
        }
    }

    public void update(Observable obs, Object obj) {
        int id = (Integer)obj;
        int value = ((Model)obs).getProgressValue(id);
        bars.get(id).setValue(value);
    }
}

