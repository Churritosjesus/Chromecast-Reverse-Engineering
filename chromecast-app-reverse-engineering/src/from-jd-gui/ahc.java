import android.os.Handler;

final class ahc
{
  final long a;
  long b;
  long c;
  long d;
  private final aga e;
  private final Handler f;
  
  ahc(Handler paramHandler, aga paramaga)
  {
    this.e = paramaga;
    this.f = paramHandler;
    this.a = afv.g();
  }
  
  final void a()
  {
    if (this.b > this.c)
    {
      Object localObject = this.e.e;
      if ((this.d > 0L) && ((localObject instanceof agh)))
      {
        long l2 = this.b;
        long l1 = this.d;
        localObject = (agh)localObject;
        if (this.f != null) {
          this.f.post(new ahd(this, (agh)localObject, l2, l1));
        }
        this.c = this.b;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ahc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */