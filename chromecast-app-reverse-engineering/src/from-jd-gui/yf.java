import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

final class yf
  extends si
{
  private boolean a;
  private boolean b;
  private boolean c;
  private lh d;
  
  public yf(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, a.G);
    this.b = paramBoolean;
    setCacheColorHint(0);
  }
  
  protected final boolean a()
  {
    if ((this.c) || (super.a())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    int i = gd.a(paramMotionEvent);
    switch (i)
    {
    default: 
      paramInt = 0;
    case 3: 
      for (bool = true;; bool = false)
      {
        label41:
        if ((!bool) || (paramInt != 0))
        {
          this.c = false;
          setPressed(false);
          drawableStateChanged();
        }
        if (!bool) {
          break;
        }
        if (this.d == null) {
          this.d = new lh(this);
        }
        this.d.a(true);
        this.d.onTouch(this, paramMotionEvent);
        label107:
        return bool;
        paramInt = 0;
      }
    }
    for (boolean bool = false;; bool = true)
    {
      int j = paramMotionEvent.findPointerIndex(paramInt);
      if (j < 0)
      {
        paramInt = 0;
        bool = false;
        break label41;
      }
      paramInt = (int)paramMotionEvent.getX(j);
      int k = (int)paramMotionEvent.getY(j);
      j = pointToPosition(paramInt, k);
      if (j == -1)
      {
        paramInt = 1;
        break label41;
      }
      View localView = getChildAt(j - getFirstVisiblePosition());
      float f2 = paramInt;
      float f1 = k;
      this.c = true;
      setPressed(true);
      layoutChildren();
      setSelection(j);
      a(j, localView, f2, f1);
      a(false);
      refreshDrawableState();
      if (i != 1) {
        break;
      }
      performItemClick(localView, j, getItemIdAtPosition(j));
      break;
      if (this.d == null) {
        break label107;
      }
      this.d.a(false);
      break label107;
    }
  }
  
  public final boolean hasFocus()
  {
    if ((this.b) || (super.hasFocus())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean hasWindowFocus()
  {
    if ((this.b) || (super.hasWindowFocus())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean isFocused()
  {
    if ((this.b) || (super.isFocused())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean isInTouchMode()
  {
    if (((this.b) && (this.a)) || (super.isInTouchMode())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */