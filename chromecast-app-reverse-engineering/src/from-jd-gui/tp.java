import android.os.Bundle;
import java.util.List;

public final class tp
{
  final Bundle a;
  private tx b;
  
  public tp(tx paramtx, boolean paramBoolean)
  {
    if (paramtx == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    this.a = new Bundle();
    this.b = paramtx;
    this.a.putBundle("selector", paramtx.a);
    this.a.putBoolean("activeScan", paramBoolean);
  }
  
  private void c()
  {
    if (this.b == null)
    {
      this.b = tx.a(this.a.getBundle("selector"));
      if (this.b == null) {
        this.b = tx.c;
      }
    }
  }
  
  public final tx a()
  {
    c();
    return this.b;
  }
  
  public final boolean b()
  {
    return this.a.getBoolean("activeScan");
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof tp))
    {
      paramObject = (tp)paramObject;
      bool1 = bool2;
      if (a().equals(((tp)paramObject).a()))
      {
        bool1 = bool2;
        if (b() == ((tp)paramObject).b()) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    int j = a().hashCode();
    if (b()) {}
    for (int i = 1;; i = 0) {
      return i ^ j;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("DiscoveryRequest{ selector=").append(a());
    localStringBuilder1.append(", activeScan=").append(b());
    StringBuilder localStringBuilder2 = localStringBuilder1.append(", isValid=");
    c();
    tx localtx = this.b;
    localtx.b();
    if (localtx.b.contains(null)) {}
    for (boolean bool = false;; bool = true)
    {
      localStringBuilder2.append(bool);
      localStringBuilder1.append(" }");
      return localStringBuilder1.toString();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\tp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */