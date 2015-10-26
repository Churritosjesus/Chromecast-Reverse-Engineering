import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class amn
  extends j
{
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramViewGroup = paramLayoutInflater.inflate(a.gb, paramViewGroup, false);
    String str1 = this.m.getString("stringTitle");
    String str2 = this.m.getString("stringBody");
    paramLayoutInflater = this.m.getStringArray("urlPatternLink");
    TextView localTextView = (TextView)paramViewGroup.findViewById(f.el);
    paramBundle = (TextView)paramViewGroup.findViewById(f.ek);
    localTextView.setText(str1);
    paramBundle.setText(str2);
    blx.a(paramBundle, paramLayoutInflater);
    return paramViewGroup;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\amn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */