import android.os.Handler;
import java.util.concurrent.Executor;

public class aeb
{
  final Executor a;
  
  public aeb(Handler paramHandler)
  {
    this.a = new adk(this, paramHandler);
  }
  
  public void a(ads paramads, ady paramady)
  {
    a(paramads, paramady, null);
  }
  
  public void a(ads paramads, ady paramady, Runnable paramRunnable)
  {
    paramads.h = true;
    paramads.a("post-response");
    this.a.execute(new adl(this, paramads, paramady, paramRunnable));
  }
  
  public void a(ads paramads, aef paramaef)
  {
    paramads.a("post-error");
    paramaef = ady.a(paramaef);
    this.a.execute(new adl(this, paramads, paramaef, null));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aeb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */