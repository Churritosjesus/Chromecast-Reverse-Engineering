import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

public final class xb
{
  public final xd a;
  public final xc b;
  public final List c;
  
  public xb(xd paramxd)
  {
    this.a = paramxd;
    this.b = new xc();
    this.c = new ArrayList();
  }
  
  public final int a()
  {
    return this.a.a() - this.c.size();
  }
  
  int a(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = -1;
    }
    for (;;)
    {
      return paramInt;
      int j = this.a.a();
      int i = paramInt;
      for (;;)
      {
        if (i >= j) {
          break label71;
        }
        int k = paramInt - (i - this.b.d(i));
        if (k == 0) {
          for (;;)
          {
            paramInt = i;
            if (!this.b.b(i)) {
              break;
            }
            i++;
          }
        }
        i += k;
      }
      label71:
      paramInt = -1;
    }
  }
  
  public final void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    if (paramInt < 0) {}
    for (paramInt = this.a.a();; paramInt = a(paramInt))
    {
      this.b.a(paramInt, paramBoolean);
      if (paramBoolean) {
        this.c.add(paramView);
      }
      this.a.a(paramView, paramInt, paramLayoutParams);
      return;
    }
  }
  
  public final void a(View paramView, int paramInt, boolean paramBoolean)
  {
    if (paramInt < 0) {}
    for (paramInt = this.a.a();; paramInt = a(paramInt))
    {
      this.b.a(paramInt, paramBoolean);
      if (paramBoolean) {
        this.c.add(paramView);
      }
      this.a.a(paramView, paramInt);
      return;
    }
  }
  
  final boolean a(View paramView)
  {
    return this.c.contains(paramView);
  }
  
  public final int b()
  {
    return this.a.a();
  }
  
  public final View b(int paramInt)
  {
    paramInt = a(paramInt);
    return this.a.b(paramInt);
  }
  
  public final View c(int paramInt)
  {
    return this.a.b(paramInt);
  }
  
  public final String toString()
  {
    return this.b.toString() + ", hidden list:" + this.c.size();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\xb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */