import android.os.Build.VERSION;
import android.os.IBinder.DeathRecipient;

public class cu
  implements IBinder.DeathRecipient
{
  private final Object a;
  private cv b;
  private boolean c = false;
  
  public cu()
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (this.a = new dg(new cw(this));; this.a = new cx(this)) {
      return;
    }
  }
  
  public void a() {}
  
  public void a(ci paramci) {}
  
  public void a(dq paramdq) {}
  
  public void binderDied()
  {
    a();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */