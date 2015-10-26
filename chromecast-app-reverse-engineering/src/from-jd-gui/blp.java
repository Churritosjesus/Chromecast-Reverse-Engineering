import android.util.Log;
import java.util.Locale;

public final class blp
{
  private static final Locale c = Locale.US;
  public final boolean a;
  private final String b;
  
  public blp(String paramString)
  {
    this(paramString, false);
  }
  
  public blp(String paramString, boolean paramBoolean)
  {
    this.b = paramString;
    this.a = false;
  }
  
  public final void a(String paramString, Object... paramVarArgs)
  {
    Log.w(this.b, String.format(c, paramString, paramVarArgs));
  }
  
  public final void a(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    Log.w(this.b, String.format(c, paramString, paramVarArgs), paramThrowable);
  }
  
  public final void b(String paramString, Object... paramVarArgs)
  {
    Log.e(this.b, String.format(c, paramString, paramVarArgs));
  }
  
  public final void b(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    Log.e(this.b, String.format(c, paramString, paramVarArgs), paramThrowable);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\blp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */