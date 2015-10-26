import android.content.Context;
import android.widget.ArrayAdapter;

public final class nc
  extends ArrayAdapter
{
  public nc(Context paramContext, int paramInt1, int paramInt2, CharSequence[] paramArrayOfCharSequence)
  {
    super(paramContext, paramInt1, 16908308, paramArrayOfCharSequence);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final boolean hasStableIds()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */