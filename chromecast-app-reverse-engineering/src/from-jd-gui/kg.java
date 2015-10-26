import android.view.animation.AnimationUtils;

final class kg
  implements Runnable
{
  kg(ke paramke) {}
  
  public final void run()
  {
    if (!ke.a(this.a)) {}
    for (;;)
    {
      return;
      if (ke.b(this.a))
      {
        ke.a(this.a, false);
        localkf = ke.c(this.a);
        localkf.e = AnimationUtils.currentAnimationTimeMillis();
        localkf.i = -1L;
        localkf.f = localkf.e;
        localkf.j = 0.5F;
        localkf.g = 0;
        localkf.h = 0;
      }
      kf localkf = ke.c(this.a);
      if ((localkf.i > 0L) && (AnimationUtils.currentAnimationTimeMillis() > localkf.i + localkf.k)) {}
      for (int i = 1;; i = 0)
      {
        if ((i == 0) && (ke.d(this.a))) {
          break label143;
        }
        ke.b(this.a, false);
        break;
      }
      label143:
      if (ke.e(this.a))
      {
        ke.c(this.a, false);
        ke.f(this.a);
      }
      if (localkf.f == 0L) {
        throw new RuntimeException("Cannot compute scroll delta before calling start()");
      }
      long l1 = AnimationUtils.currentAnimationTimeMillis();
      float f = localkf.a(l1);
      f = f * 4.0F + -4.0F * f * f;
      long l2 = l1 - localkf.f;
      localkf.f = l1;
      localkf.g = ((int)((float)l2 * f * localkf.c));
      localkf.h = ((int)((float)l2 * f * localkf.d));
      i = localkf.h;
      this.a.a(i);
      gt.a(ke.g(this.a), this);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\kg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */