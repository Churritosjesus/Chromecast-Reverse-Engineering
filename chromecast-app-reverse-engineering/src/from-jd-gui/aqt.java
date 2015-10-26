import android.content.Context;
import android.widget.Toast;

final class aqt
  implements Runnable
{
  aqt(aqj paramaqj) {}
  
  public final void run()
  {
    String str = aqj.d(this.a).getString(b.S, new Object[] { aqj.b(this.a).g() });
    Toast.makeText(aqj.d(this.a), str, 1).show();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aqt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */