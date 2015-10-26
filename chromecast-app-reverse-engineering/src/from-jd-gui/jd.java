import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;

public final class jd
{
  public static final jh a;
  public final Object b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 22) {
      a = new jf();
    }
    for (;;)
    {
      return;
      if (Build.VERSION.SDK_INT >= 21) {
        a = new je();
      } else if (Build.VERSION.SDK_INT >= 19) {
        a = new jk();
      } else if (Build.VERSION.SDK_INT >= 18) {
        a = new jj();
      } else if (Build.VERSION.SDK_INT >= 16) {
        a = new ji();
      } else if (Build.VERSION.SDK_INT >= 14) {
        a = new jg();
      } else {
        a = new jh();
      }
    }
  }
  
  public jd(Object paramObject)
  {
    this.b = paramObject;
  }
  
  public static jd a(jd paramjd)
  {
    paramjd = a.a(paramjd.b);
    if (paramjd != null) {}
    for (paramjd = new jd(paramjd);; paramjd = null) {
      return paramjd;
    }
  }
  
  public final int a()
  {
    return a.b(this.b);
  }
  
  public final void a(int paramInt)
  {
    a.a(this.b, paramInt);
  }
  
  public final void a(Rect paramRect)
  {
    a.a(this.b, paramRect);
  }
  
  public final void a(View paramView)
  {
    a.b(this.b, paramView);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    a.a(this.b, paramCharSequence);
  }
  
  public final void a(Object paramObject)
  {
    a.b(this.b, ((jm)paramObject).a);
  }
  
  public final void a(boolean paramBoolean)
  {
    a.c(this.b, paramBoolean);
  }
  
  public final void b(Rect paramRect)
  {
    a.b(this.b, paramRect);
  }
  
  public final void b(boolean paramBoolean)
  {
    a.d(this.b, paramBoolean);
  }
  
  public final boolean b()
  {
    return a.k(this.b);
  }
  
  public final void c(boolean paramBoolean)
  {
    a.f(this.b, paramBoolean);
  }
  
  public final boolean c()
  {
    return a.l(this.b);
  }
  
  public final boolean d()
  {
    return a.p(this.b);
  }
  
  public final boolean e()
  {
    return a.i(this.b);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      if (paramObject == null)
      {
        bool = false;
      }
      else if (getClass() != paramObject.getClass())
      {
        bool = false;
      }
      else
      {
        paramObject = (jd)paramObject;
        if (this.b == null)
        {
          if (((jd)paramObject).b != null) {
            bool = false;
          }
        }
        else if (!this.b.equals(((jd)paramObject).b)) {
          bool = false;
        }
      }
    }
  }
  
  public final boolean f()
  {
    return a.m(this.b);
  }
  
  public final boolean g()
  {
    return a.j(this.b);
  }
  
  public final CharSequence h()
  {
    return a.e(this.b);
  }
  
  public final int hashCode()
  {
    if (this.b == null) {}
    for (int i = 0;; i = this.b.hashCode()) {
      return i;
    }
  }
  
  public final CharSequence i()
  {
    return a.c(this.b);
  }
  
  public final CharSequence j()
  {
    return a.d(this.b);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    Object localObject = new Rect();
    a((Rect)localObject);
    localStringBuilder.append("; boundsInParent: " + localObject);
    b((Rect)localObject);
    localStringBuilder.append("; boundsInScreen: " + localObject);
    localStringBuilder.append("; packageName: ").append(h());
    localStringBuilder.append("; className: ").append(i());
    localStringBuilder.append("; text: ").append(a.f(this.b));
    localStringBuilder.append("; contentDescription: ").append(j());
    localStringBuilder.append("; viewId: ").append(a.t(this.b));
    localStringBuilder.append("; checkable: ").append(a.g(this.b));
    localStringBuilder.append("; checked: ").append(a.h(this.b));
    localStringBuilder.append("; focusable: ").append(b());
    localStringBuilder.append("; focused: ").append(c());
    localStringBuilder.append("; selected: ").append(d());
    localStringBuilder.append("; clickable: ").append(e());
    localStringBuilder.append("; longClickable: ").append(f());
    localStringBuilder.append("; enabled: ").append(g());
    localStringBuilder.append("; password: ").append(a.n(this.b));
    localStringBuilder.append("; scrollable: " + a.o(this.b));
    localStringBuilder.append("; [");
    int i = a();
    if (i != 0)
    {
      int j = 1 << Integer.numberOfTrailingZeros(i);
      i = (j ^ 0xFFFFFFFF) & i;
      switch (j)
      {
      default: 
        localObject = "ACTION_UNKNOWN";
      }
      for (;;)
      {
        localStringBuilder.append((String)localObject);
        if (i != 0) {
          localStringBuilder.append(", ");
        }
        break;
        localObject = "ACTION_FOCUS";
        continue;
        localObject = "ACTION_CLEAR_FOCUS";
        continue;
        localObject = "ACTION_SELECT";
        continue;
        localObject = "ACTION_CLEAR_SELECTION";
        continue;
        localObject = "ACTION_CLICK";
        continue;
        localObject = "ACTION_LONG_CLICK";
        continue;
        localObject = "ACTION_ACCESSIBILITY_FOCUS";
        continue;
        localObject = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        continue;
        localObject = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        continue;
        localObject = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        continue;
        localObject = "ACTION_NEXT_HTML_ELEMENT";
        continue;
        localObject = "ACTION_PREVIOUS_HTML_ELEMENT";
        continue;
        localObject = "ACTION_SCROLL_FORWARD";
        continue;
        localObject = "ACTION_SCROLL_BACKWARD";
        continue;
        localObject = "ACTION_CUT";
        continue;
        localObject = "ACTION_COPY";
        continue;
        localObject = "ACTION_PASTE";
        continue;
        localObject = "ACTION_SET_SELECTION";
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\jd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */