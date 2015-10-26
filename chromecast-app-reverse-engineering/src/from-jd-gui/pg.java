import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public final class pg
  implements TransformationMethod
{
  private Locale a;
  
  public pg(Context paramContext)
  {
    this.a = paramContext.getResources().getConfiguration().locale;
  }
  
  public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    if (paramCharSequence != null) {}
    for (paramCharSequence = paramCharSequence.toString().toUpperCase(this.a);; paramCharSequence = null) {
      return paramCharSequence;
    }
  }
  
  public final void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */