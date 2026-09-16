package thread.control;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class CheckExceptionMain {

    public static void main(String[] args) {
        new Thread(new CheckedRunnable()).start();
    }

    static class CheckedRunnable implements Runnable {

        @Override
        public void run() {
            sleep(1000);
            log("start");
        }

//        @Override
//        public void run() throws Exception {
//            throw new Exception();
//        }
    }
}
