public class ThreadPlay {
    public static void main(String[] args) throws InterruptedException {
        GitHub ghObj = new GitHub();
        GitHub ghObj1 = new GitHub();
        ghObj.start();
        ghObj1.start();
        ghObj.join();
        ghObj1.join();
        System.out.println("Profile viewed "+ GitHub.profileViews+" times");

    }
}

class GitHub extends Thread{
    static int profileViews = 0;
    
    public synchronized void run(){
        for (int i = 0; i < 1000; i++) {
            profileViews++;     
        }
    }
}


