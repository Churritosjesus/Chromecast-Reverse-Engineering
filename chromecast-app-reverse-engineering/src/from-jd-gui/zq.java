import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class zq
  implements Runnable
{
  public int a;
  public int b;
  public lr c;
  public Interpolator d = RecyclerView.i();
  private boolean f = false;
  private boolean g = false;
  
  public zq(RecyclerView paramRecyclerView)
  {
    this.c = lr.a(paramRecyclerView.getContext(), RecyclerView.i());
  }
  
  public static float a(float paramFloat)
  {
    return (float)Math.sin((float)((paramFloat - 0.5F) * 0.4712389167638204D));
  }
  
  public final void a()
  {
    if (this.f) {
      this.g = true;
    }
    for (;;)
    {
      return;
      this.e.removeCallbacks(this);
      gt.a(this.e, this);
    }
  }
  
  public final void run()
  {
    this.g = false;
    this.f = true;
    RecyclerView.e(this.e);
    lr locallr = this.c;
    RecyclerView.d(this.e);
    int i6;
    int i7;
    int i4;
    int i5;
    int j;
    int m;
    int i1;
    int n;
    int i;
    int k;
    Object localObject1;
    if (locallr.e())
    {
      i6 = locallr.a();
      i7 = locallr.b();
      i4 = i6 - this.a;
      i5 = i7 - this.b;
      j = 0;
      int i3 = 0;
      m = 0;
      i1 = 0;
      this.a = i6;
      this.b = i7;
      n = 0;
      i = 0;
      k = 0;
      i2 = 0;
      if (RecyclerView.f(this.e) != null)
      {
        this.e.a();
        RecyclerView.g(this.e);
        a.a("RV Scroll");
        j = i3;
        if (i4 != 0)
        {
          j = RecyclerView.d(this.e).a(i4, this.e.a, this.e.n);
          i = i4 - j;
        }
        k = i2;
        m = i1;
        if (i5 != 0)
        {
          m = RecyclerView.d(this.e).b(i5, this.e.a, this.e.n);
          k = i5 - m;
        }
        a.b();
        if (RecyclerView.h(this.e))
        {
          i1 = this.e.c.a();
          for (n = 0; n < i1; n++)
          {
            localObject1 = this.e.c.b(n);
            Object localObject2 = this.e.a((View)localObject1);
            if ((localObject2 != null) && (((zr)localObject2).h != null))
            {
              localObject2 = ((zr)localObject2).h.a;
              i2 = ((View)localObject1).getLeft();
              i3 = ((View)localObject1).getTop();
              if ((i2 != ((View)localObject2).getLeft()) || (i3 != ((View)localObject2).getTop())) {
                ((View)localObject2).layout(i2, i3, ((View)localObject2).getWidth() + i2, ((View)localObject2).getHeight() + i3);
              }
            }
          }
        }
        RecyclerView.i(this.e);
        this.e.a(false);
        n = i;
      }
      if (!RecyclerView.j(this.e).isEmpty()) {
        this.e.invalidate();
      }
      if (gt.a(this.e) != 2) {
        RecyclerView.a(this.e, i4, i5);
      }
      if ((n != 0) || (k != 0))
      {
        i1 = (int)locallr.b.d(locallr.a);
        if (n == i6) {
          break label866;
        }
        if (n >= 0) {
          break label758;
        }
        i = -i1;
      }
    }
    label483:
    label519:
    label539:
    label661:
    label689:
    label712:
    label758:
    label791:
    label813:
    label841:
    label847:
    label853:
    label866:
    for (int i2 = i;; i2 = 0)
    {
      if (k != i7) {
        if (k < 0) {
          i = -i1;
        }
      }
      for (;;)
      {
        if (gt.a(this.e) != 2)
        {
          localObject1 = this.e;
          if (i2 >= 0) {
            break label791;
          }
          ((RecyclerView)localObject1).b();
          ((RecyclerView)localObject1).i.a(-i2);
          if (i >= 0) {
            break label813;
          }
          ((RecyclerView)localObject1).d();
          ((RecyclerView)localObject1).j.a(-i);
          if ((i2 != 0) || (i != 0)) {
            gt.d((View)localObject1);
          }
        }
        if (((i2 != 0) || (n == i6) || (locallr.c() == 0)) && ((i != 0) || (k == i7) || (locallr.d() == 0))) {
          locallr.f();
        }
        if ((j != 0) || (m != 0)) {
          this.e.c(j, m);
        }
        if (!RecyclerView.k(this.e)) {
          this.e.invalidate();
        }
        if ((i5 != 0) && (RecyclerView.d(this.e).j()) && (m == i5))
        {
          i = 1;
          if ((i4 == 0) || (!RecyclerView.d(this.e).i()) || (j != i4)) {
            break label841;
          }
          j = 1;
          if (((i4 != 0) || (i5 != 0)) && (j == 0) && (i == 0)) {
            break label847;
          }
          i = 1;
          if ((!locallr.b.a(locallr.a)) && (i != 0)) {
            break label853;
          }
          RecyclerView.b(this.e, 0);
        }
        for (;;)
        {
          this.f = false;
          if (this.g) {
            a();
          }
          return;
          if (n > 0)
          {
            i = i1;
            break;
          }
          i = 0;
          break;
          i = i1;
          if (k > 0) {
            break label483;
          }
          i = 0;
          break label483;
          if (i2 <= 0) {
            break label519;
          }
          ((RecyclerView)localObject1).c();
          ((RecyclerView)localObject1).k.a(i2);
          break label519;
          if (i <= 0) {
            break label539;
          }
          ((RecyclerView)localObject1).e();
          ((RecyclerView)localObject1).l.a(i);
          break label539;
          i = 0;
          break label661;
          j = 0;
          break label689;
          i = 0;
          break label712;
          a();
        }
        i = 0;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */