import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

final class cus
  implements ComponentCallbacks2
{
  cus(cuq paramcuq) {}
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onLowMemory() {}
  
  public final void onTrimMemory(int paramInt)
  {
    if (paramInt == 20) {
      this.a.b.c();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */