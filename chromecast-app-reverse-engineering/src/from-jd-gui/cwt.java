import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;

final class cwt
  extends cvf
{
  private static final String b = cip.p.toString();
  private final Context c;
  
  public cwt(Context paramContext)
  {
    super(b, new String[0]);
    this.c = paramContext;
  }
  
  public final cje a(Map paramMap)
  {
    paramMap = new DisplayMetrics();
    ((WindowManager)this.c.getSystemService("window")).getDefaultDisplay().getMetrics(paramMap);
    int j = paramMap.widthPixels;
    int i = paramMap.heightPixels;
    return cyh.a(j + "x" + i);
  }
  
  public final boolean a()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cwt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */