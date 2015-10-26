import java.util.ArrayList;

public abstract class zc
{
  private ArrayList a = new ArrayList();
  public zd h = null;
  long i = 120L;
  long j = 120L;
  long k = 250L;
  long l = 250L;
  public boolean m = true;
  
  public abstract void a();
  
  public final void a(zr paramzr, boolean paramBoolean)
  {
    if (this.h != null) {
      this.h.d(paramzr);
    }
  }
  
  public abstract boolean a(zr paramzr);
  
  public abstract boolean a(zr paramzr, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract boolean a(zr paramzr1, zr paramzr2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract boolean b();
  
  public abstract boolean b(zr paramzr);
  
  public abstract void c(zr paramzr);
  
  public abstract void d();
  
  public final void d(zr paramzr)
  {
    if (this.h != null) {
      this.h.a(paramzr);
    }
  }
  
  public final void e()
  {
    int i1 = this.a.size();
    for (int n = 0; n < i1; n++) {
      this.a.get(n);
    }
    this.a.clear();
  }
  
  public final void e(zr paramzr)
  {
    if (this.h != null) {
      this.h.c(paramzr);
    }
  }
  
  public final void f(zr paramzr)
  {
    if (this.h != null) {
      this.h.b(paramzr);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */