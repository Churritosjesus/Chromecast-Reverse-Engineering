import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class bok
  extends j
{
  public static bok b(int paramInt)
  {
    bok localbok = new bok();
    Bundle localBundle = new Bundle();
    localBundle.putInt("layoutResId", paramInt);
    localbok.f(localBundle);
    return localbok;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(this.m.getInt("layoutResId"), paramViewGroup, false);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */