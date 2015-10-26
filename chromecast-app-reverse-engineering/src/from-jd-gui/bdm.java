import android.content.Context;
import java.util.Locale;

public abstract class bdm
{
  public int c = 0;
  
  public bdm(int paramInt)
  {
    this.c = paramInt;
  }
  
  public abstract void a();
  
  public final void a(int paramInt)
  {
    if (paramInt != 0) {
      this.c = paramInt;
    }
  }
  
  public abstract void a(int paramInt, bdn parambdn);
  
  public abstract void a(int paramInt, Locale paramLocale, boolean paramBoolean, bdn parambdn);
  
  public abstract void a(Context paramContext, String paramString, bdn parambdn);
  
  public abstract void a(bdn parambdn);
  
  public abstract void a(bdn parambdn, int paramInt);
  
  public abstract void a(bfs parambfs, bdn parambdn);
  
  public abstract void b(bdn parambdn);
  
  public abstract boolean b();
  
  public abstract boolean c();
  
  public abstract void d(bdn parambdn);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */