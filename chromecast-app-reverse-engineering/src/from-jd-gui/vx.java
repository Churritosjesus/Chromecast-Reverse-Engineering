import android.view.View;

final class vx
  implements Runnable
{
  private wa a;
  
  public vx(vu paramvu, wa paramwa)
  {
    this.a = paramwa;
  }
  
  public final void run()
  {
    Object localObject = this.b.c;
    if (((qa)localObject).b != null) {
      ((qa)localObject).b.a((qa)localObject);
    }
    localObject = (View)this.b.e;
    if ((localObject != null) && (((View)localObject).getWindowToken() != null) && (this.a.c())) {
      this.b.j = this.a;
    }
    this.b.l = null;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\vx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */