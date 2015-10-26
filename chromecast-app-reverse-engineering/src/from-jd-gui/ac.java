import android.view.View;
import android.view.ViewGroup;

public abstract class ac
  extends gn
{
  private final r b;
  private af c = null;
  private j d = null;
  
  public ac(r paramr)
  {
    this.b = paramr;
  }
  
  private static String a(int paramInt, long paramLong)
  {
    return "android:switcher:" + paramInt + ":" + paramLong;
  }
  
  public abstract j a(int paramInt);
  
  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.c == null) {
      this.c = this.b.a();
    }
    long l = paramInt;
    Object localObject = a(paramViewGroup.getId(), l);
    localObject = this.b.a((String)localObject);
    if (localObject != null) {
      this.c.c((j)localObject);
    }
    for (paramViewGroup = (ViewGroup)localObject;; paramViewGroup = (ViewGroup)localObject)
    {
      if (paramViewGroup != this.d)
      {
        paramViewGroup.e(false);
        paramViewGroup.f(false);
      }
      return paramViewGroup;
      localObject = a(paramInt);
      this.c.a(paramViewGroup.getId(), (j)localObject, a(paramViewGroup.getId(), l));
    }
  }
  
  public final void a(ViewGroup paramViewGroup)
  {
    if (this.c != null)
    {
      this.c.c();
      this.c = null;
      this.b.b();
    }
  }
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (this.c == null) {
      this.c = this.b.a();
    }
    this.c.b((j)paramObject);
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    if (((j)paramObject).N == paramView) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup = (j)paramObject;
    if (paramViewGroup != this.d)
    {
      if (this.d != null)
      {
        this.d.e(false);
        this.d.f(false);
      }
      if (paramViewGroup != null)
      {
        paramViewGroup.e(true);
        paramViewGroup.f(true);
      }
      this.d = paramViewGroup;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */