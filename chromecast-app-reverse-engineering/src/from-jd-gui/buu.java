import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

public final class buu
{
  private static boolean b = false;
  String a;
  private String c;
  private boolean d;
  private boolean e;
  
  public buu(String paramString)
  {
    this(paramString, false);
  }
  
  private buu(String paramString, boolean paramBoolean)
  {
    this.c = paramString;
    this.d = paramBoolean;
    this.e = false;
  }
  
  private String e(String paramString, Object... paramVarArgs)
  {
    if (paramVarArgs.length == 0) {}
    for (;;)
    {
      paramVarArgs = paramString;
      if (!TextUtils.isEmpty(this.a)) {
        paramVarArgs = this.a + paramString;
      }
      return paramVarArgs;
      paramString = String.format(Locale.ROOT, paramString, paramVarArgs);
    }
  }
  
  public final void a(String paramString, Object... paramVarArgs) {}
  
  public final void a(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    if (this.d) {
      e(paramString, paramVarArgs);
    }
  }
  
  public final void b(String paramString, Object... paramVarArgs)
  {
    if (this.d) {
      e(paramString, paramVarArgs);
    }
  }
  
  public final void c(String paramString, Object... paramVarArgs)
  {
    e(paramString, paramVarArgs);
  }
  
  public final void d(String paramString, Object... paramVarArgs)
  {
    Log.w(this.c, e(paramString, paramVarArgs));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\buu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */