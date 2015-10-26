import android.util.Log;

public class cui
{
  int a = 5;
  
  public void a(String paramString)
  {
    if (this.a <= 6) {
      Log.e("GoogleTagManager", paramString);
    }
  }
  
  public void a(String paramString, Throwable paramThrowable)
  {
    if (this.a <= 6) {
      Log.e("GoogleTagManager", paramString, paramThrowable);
    }
  }
  
  public void b(String paramString)
  {
    if (this.a <= 5) {
      Log.w("GoogleTagManager", paramString);
    }
  }
  
  public void b(String paramString, Throwable paramThrowable)
  {
    if (this.a <= 5) {
      Log.w("GoogleTagManager", paramString, paramThrowable);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */