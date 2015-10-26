import android.util.Log;
import android.view.View;

public class zr
{
  public final View a;
  public int b = -1;
  public int c = -1;
  long d = -1L;
  public int e = -1;
  int f = -1;
  public zr g = null;
  public zr h = null;
  int i;
  zl j = null;
  private int k = 0;
  
  public zr(View paramView)
  {
    if (paramView == null) {
      throw new IllegalArgumentException("itemView may not be null");
    }
    this.a = paramView;
  }
  
  public final void a()
  {
    this.c = -1;
    this.f = -1;
  }
  
  public final void a(int paramInt)
  {
    this.i |= paramInt;
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    this.i = (this.i & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    if (this.c == -1) {
      this.c = this.b;
    }
    if (this.f == -1) {
      this.f = this.b;
    }
    if (paramBoolean) {
      this.f += paramInt;
    }
    this.b += paramInt;
    if (this.a.getLayoutParams() != null) {
      ((zi)this.a.getLayoutParams()).e = true;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    int m;
    if (paramBoolean)
    {
      m = this.k - 1;
      this.k = m;
      if (this.k >= 0) {
        break label61;
      }
      this.k = 0;
      Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    }
    for (;;)
    {
      return;
      m = this.k + 1;
      break;
      label61:
      if ((!paramBoolean) && (this.k == 1)) {
        this.i |= 0x10;
      } else if ((paramBoolean) && (this.k == 0)) {
        this.i &= 0xFFFFFFEF;
      }
    }
  }
  
  public final boolean b()
  {
    if ((this.i & 0x80) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  @Deprecated
  public final int c()
  {
    if (this.f == -1) {}
    for (int m = this.b;; m = this.f) {
      return m;
    }
  }
  
  public final int d()
  {
    if (this.f == -1) {}
    for (int m = this.b;; m = this.f) {
      return m;
    }
  }
  
  final boolean e()
  {
    if (this.j != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  final void f()
  {
    this.j.b(this);
  }
  
  final boolean g()
  {
    if ((this.i & 0x20) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  final void h()
  {
    this.i &= 0xFFFFFFDF;
  }
  
  public final void i()
  {
    this.i &= 0xFEFF;
  }
  
  public final boolean j()
  {
    if ((this.i & 0x4) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  final boolean k()
  {
    if ((this.i & 0x2) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean l()
  {
    if ((this.i & 0x40) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  final boolean m()
  {
    if ((this.i & 0x1) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean n()
  {
    if ((this.i & 0x8) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean o()
  {
    if ((this.i & 0x100) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  final void p()
  {
    this.i = 0;
    this.b = -1;
    this.c = -1;
    this.d = -1L;
    this.f = -1;
    this.k = 0;
    this.g = null;
    this.h = null;
  }
  
  public final boolean q()
  {
    if (((this.i & 0x10) == 0) && (!gt.c(this.a))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.b + " id=" + this.d + ", oldPos=" + this.c + ", pLpos:" + this.f);
    if (e()) {
      localStringBuilder.append(" scrap");
    }
    if (j()) {
      localStringBuilder.append(" invalid");
    }
    if (!m()) {
      localStringBuilder.append(" unbound");
    }
    if (k()) {
      localStringBuilder.append(" update");
    }
    if (n()) {
      localStringBuilder.append(" removed");
    }
    if (b()) {
      localStringBuilder.append(" ignored");
    }
    if (l()) {
      localStringBuilder.append(" changed");
    }
    if (o()) {
      localStringBuilder.append(" tmpDetached");
    }
    if (!q()) {
      localStringBuilder.append(" not recyclable(" + this.k + ")");
    }
    if (((this.i & 0x200) != 0) || (j())) {}
    for (int m = 1;; m = 0)
    {
      if (m != 0) {
        localStringBuilder.append("undefined adapter position");
      }
      if (this.a.getParent() == null) {
        localStringBuilder.append(" no parent");
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */