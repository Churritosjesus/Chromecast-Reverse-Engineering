import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

final class bzb
{
  private final String a;
  private final ComponentName b;
  
  public bzb(ComponentName paramComponentName)
  {
    this.a = null;
    this.b = ((ComponentName)a.c(paramComponentName));
  }
  
  public bzb(String paramString)
  {
    this.a = a.f(paramString);
    this.b = null;
  }
  
  public final Intent a()
  {
    if (this.a != null) {}
    for (Intent localIntent = new Intent(this.a).setPackage("com.google.android.gms");; localIntent = new Intent().setComponent(this.b)) {
      return localIntent;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof bzb))
      {
        bool = false;
      }
      else
      {
        paramObject = (bzb)paramObject;
        if ((!a.e(this.a, ((bzb)paramObject).a)) || (!a.e(this.b, ((bzb)paramObject).b))) {
          bool = false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.a, this.b });
  }
  
  public final String toString()
  {
    if (this.a == null) {}
    for (String str = this.b.flattenToString();; str = this.a) {
      return str;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */