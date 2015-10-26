import java.util.concurrent.ThreadFactory;

final class dgt
  implements ThreadFactory
{
  dgt(String paramString, boolean paramBoolean) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(paramRunnable, this.a);
    paramRunnable.setDaemon(this.b);
    return paramRunnable;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */