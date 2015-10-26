import android.view.View;

final class sn
  implements Runnable
{
  sn(sm paramsm, View paramView) {}
  
  public final void run()
  {
    int j = this.a.getLeft();
    int i = (this.b.getWidth() - this.a.getWidth()) / 2;
    this.b.smoothScrollTo(j - i, 0);
    this.b.a = null;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\sn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */