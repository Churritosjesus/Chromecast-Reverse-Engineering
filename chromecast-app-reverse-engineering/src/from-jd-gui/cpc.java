import android.os.Process;

final class cpc
  extends Thread
{
  cpc(Runnable paramRunnable, String paramString)
  {
    super(paramRunnable, paramString);
  }
  
  public final void run()
  {
    Process.setThreadPriority(10);
    super.run();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cpc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */