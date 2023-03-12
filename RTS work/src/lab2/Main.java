package lab2;


    public class Main {
        private static final int noOfThreads = 6;
        private static final int processorLoad = 1000000;

        public static void main(String args[]) {
            Model model = new Model(noOfThreads, processorLoad);
            new View(model);

            for(int i =0; i<noOfThreads; i++){
                new Controller(i, i+2, model).start();
            }
        }
    }


