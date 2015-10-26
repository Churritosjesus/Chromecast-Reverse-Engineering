import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class lq
  extends kj
{
  private int e;
  private int f;
  private LayoutInflater g;
  
  public lq(Context paramContext, int paramInt, Cursor paramCursor, boolean paramBoolean)
  {
    super(paramContext, null, true);
    this.f = paramInt;
    this.e = paramInt;
    this.g = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.g.inflate(this.e, paramViewGroup, false);
  }
  
  public final View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.g.inflate(this.f, paramViewGroup, false);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\lq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */