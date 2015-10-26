import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public abstract class bjq
  extends j
{
  public int c = -1;
  
  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    if (paramBundle != null) {
      b(paramBundle.getInt("currentPercent"));
    }
  }
  
  public void b(int paramInt)
  {
    this.c = paramInt;
    TextView localTextView = p();
    if ((localTextView != null) && (paramInt != -1)) {
      localTextView.setText(e().getString(b.cG, new Object[] { Integer.valueOf(this.c) }));
    }
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("currentPercent", this.c);
  }
  
  protected abstract TextView p();
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bjq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */