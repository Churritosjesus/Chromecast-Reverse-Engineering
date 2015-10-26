import android.content.ComponentName;
import java.util.ArrayList;

public final class ug
{
  final tq a;
  public final ArrayList b = new ArrayList();
  tv c;
  private final tt d;
  
  ug(tq paramtq)
  {
    this.a = paramtq;
    this.d = paramtq.b;
  }
  
  final int a(String paramString)
  {
    int j = this.b.size();
    int i = 0;
    if (i < j) {
      if (!((uh)this.b.get(i)).a.equals(paramString)) {}
    }
    for (;;)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }
  
  public final String a()
  {
    return this.d.a.getPackageName();
  }
  
  public final ComponentName b()
  {
    return this.d.a;
  }
  
  public final String toString()
  {
    return "MediaRouter.RouteProviderInfo{ packageName=" + a() + " }";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */