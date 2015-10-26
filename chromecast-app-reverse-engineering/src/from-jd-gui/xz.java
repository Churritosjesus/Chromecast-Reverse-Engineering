import android.view.View;
import java.util.List;

final class xz
{
  boolean a = true;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h = 0;
  int i;
  List j = null;
  
  final View a(zl paramzl)
  {
    int k;
    if (this.j != null)
    {
      int m = this.j.size();
      k = 0;
      if (k < m)
      {
        paramzl = (zr)this.j.get(k);
        if ((!paramzl.n()) && (this.d == paramzl.d()))
        {
          a(paramzl);
          paramzl = paramzl.a;
        }
      }
    }
    for (;;)
    {
      return paramzl;
      k++;
      break;
      paramzl = null;
      continue;
      paramzl = paramzl.a(this.d, false);
      this.d += this.e;
    }
  }
  
  public final void a(zr paramzr)
  {
    int i1 = this.j.size();
    Object localObject = null;
    int k = Integer.MAX_VALUE;
    int m = 0;
    if (m < i1)
    {
      zr localzr = (zr)this.j.get(m);
      if ((localzr == paramzr) || (localzr.n())) {
        break label124;
      }
      int n = (localzr.d() - this.d) * this.e;
      if ((n < 0) || (n >= k)) {
        break label124;
      }
      localObject = localzr;
      if (n != 0)
      {
        localObject = localzr;
        k = n;
      }
    }
    label124:
    for (;;)
    {
      m++;
      break;
      if (localObject == null) {}
      for (k = -1;; k = ((zr)localObject).d())
      {
        this.d = k;
        return;
      }
    }
  }
  
  final boolean a(zp paramzp)
  {
    if ((this.d >= 0) && (this.d < paramzp.a())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\xz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */