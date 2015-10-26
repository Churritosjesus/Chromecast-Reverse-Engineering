import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

final class bly
  extends URLSpan
{
  bly(String paramString, Intent paramIntent)
  {
    super(paramString);
  }
  
  public final void onClick(View paramView)
  {
    if (this.a != null) {
      paramView.getContext().startActivity(this.a);
    }
    for (;;)
    {
      return;
      super.onClick(paramView);
    }
  }
  
  public final void updateDrawState(TextPaint paramTextPaint)
  {
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setUnderlineText(false);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */