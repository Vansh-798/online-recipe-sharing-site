package threads;
public class ActivityLoggerThread extends Thread{
@Override
public void run(){
synchronized(this){
try{
System.out.println("Logging Activity...");
Thread.sleep(1000);
}catch(Exception e){}
}
}
}
