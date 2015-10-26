import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class ata
  extends j
{
  public static j a(String paramString)
  {
    ata localata = new ata();
    Bundle localBundle = new Bundle();
    localBundle.putString("spinnerDescription", paramString);
    localata.f(localBundle);
    return localata;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramViewGroup = paramLayoutInflater.inflate(a.gK, null);
    paramLayoutInflater = this.m.getString("spinnerDescription");
    ((TextView)paramViewGroup.findViewById(f.dd)).setText(paramLayoutInflater);
    return paramViewGroup;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */