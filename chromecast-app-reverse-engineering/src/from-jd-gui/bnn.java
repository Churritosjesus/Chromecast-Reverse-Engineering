import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class bnn
  implements View.OnClickListener
{
  bnn(bmu parambmu, String paramString, atu paramatu) {}
  
  public final void onClick(View paramView)
  {
    Object localObject = asr.a(this.a, paramView.getContext());
    paramView.getContext().startActivity((Intent)localObject);
    localObject = this.b.e;
    paramView = ape.a();
    if (localObject == null) {}
    for (int i = 0;; i = ((dbw)localObject).b)
    {
      paramView.a(new apd(64, Integer.valueOf(i)));
      paramView = this.a;
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bnn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */