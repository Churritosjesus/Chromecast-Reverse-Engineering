import android.view.View;

final class yd
  implements Runnable
{
  yd(yc paramyc) {}
  
  public final void run()
  {
    View localView = this.a.g;
    if ((localView != null) && (localView.getWindowToken() != null)) {
      this.a.c();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */