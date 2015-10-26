import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

final class my
  implements View.OnClickListener
{
  my(mx parammx) {}
  
  public final void onClick(View paramView)
  {
    if ((paramView == this.a.n) && (this.a.p != null)) {
      paramView = Message.obtain(this.a.p);
    }
    for (;;)
    {
      if (paramView != null) {
        paramView.sendToTarget();
      }
      this.a.K.obtainMessage(1, this.a.b).sendToTarget();
      return;
      if ((paramView == this.a.q) && (this.a.s != null)) {
        paramView = Message.obtain(this.a.s);
      } else if ((paramView == this.a.t) && (this.a.v != null)) {
        paramView = Message.obtain(this.a.v);
      } else {
        paramView = null;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\my.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */