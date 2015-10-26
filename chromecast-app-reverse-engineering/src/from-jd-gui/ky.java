import android.os.SystemClock;
import android.support.v4.widget.DrawerLayout;
import android.view.MotionEvent;
import android.view.View;

final class ky
  implements Runnable
{
  ky(kx paramkx) {}
  
  public final void run()
  {
    int k = 0;
    Object localObject2 = this.a;
    int m = ((kx)localObject2).b.k;
    int i;
    Object localObject1;
    int j;
    if (((kx)localObject2).a == 3)
    {
      i = 1;
      if (i == 0) {
        break label217;
      }
      localObject1 = ((kx)localObject2).c.b(3);
      if (localObject1 == null) {
        break label211;
      }
      j = -((View)localObject1).getWidth();
      label53:
      j += m;
    }
    for (;;)
    {
      label60:
      if ((localObject1 != null) && (((i != 0) && (((View)localObject1).getLeft() < j)) || ((i == 0) && (((View)localObject1).getLeft() > j) && (((kx)localObject2).c.a((View)localObject1) == 0))))
      {
        ku localku = (ku)((View)localObject1).getLayoutParams();
        ((kx)localObject2).b.a((View)localObject1, j, ((View)localObject1).getTop());
        localku.c = true;
        ((kx)localObject2).c.invalidate();
        ((kx)localObject2).b();
        localObject1 = ((kx)localObject2).c;
        if (!((DrawerLayout)localObject1).e)
        {
          long l = SystemClock.uptimeMillis();
          localObject2 = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
          j = ((DrawerLayout)localObject1).getChildCount();
          i = k;
          for (;;)
          {
            if (i < j)
            {
              ((DrawerLayout)localObject1).getChildAt(i).dispatchTouchEvent((MotionEvent)localObject2);
              i++;
              continue;
              i = 0;
              break;
              label211:
              j = 0;
              break label53;
              label217:
              localObject1 = ((kx)localObject2).c.b(5);
              j = ((kx)localObject2).c.getWidth();
              j -= m;
              break label60;
            }
          }
          ((MotionEvent)localObject2).recycle();
          ((DrawerLayout)localObject1).e = true;
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */