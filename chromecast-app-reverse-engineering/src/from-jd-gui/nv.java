import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;

final class nv
  extends FrameLayout
{
  public nv(no paramno, Context paramContext)
  {
    super(paramContext);
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return this.a.a(paramKeyEvent);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    int i;
    if (paramMotionEvent.getAction() == 0)
    {
      int j = (int)paramMotionEvent.getX();
      i = (int)paramMotionEvent.getY();
      if ((j < -5) || (i < -5) || (j > getWidth() + 5) || (i > getHeight() + 5))
      {
        i = 1;
        if (i == 0) {
          break label83;
        }
        paramMotionEvent = this.a;
        paramMotionEvent.a(paramMotionEvent.e(0), true);
      }
    }
    for (;;)
    {
      return bool;
      i = 0;
      break;
      label83:
      bool = super.onInterceptTouchEvent(paramMotionEvent);
    }
  }
  
  public final void setBackgroundResource(int paramInt)
  {
    setBackgroundDrawable(tf.a(getContext(), paramInt));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */