
public class Stopwatch {
  private long start;
  private long stop;
  public void start()
    /*begins keeping track of time*/
  {
    start = System.nanoTime();//your code here
  }
  public void stop()
    /* stops keeping track of time */
  {
     stop = System.nanoTime();//your code here
  }
  public long elapsedTime()
    /* uses System.out to display the elapsed time in seconds */
  {
    System.out.println(stop-start);// Replace the following line with your code
    return stop-start;
  }
  public void reset()
    /* resets the elapsed time to 0 */
  {
    start = 0;
    stop = 0;//your code here
  }
}

