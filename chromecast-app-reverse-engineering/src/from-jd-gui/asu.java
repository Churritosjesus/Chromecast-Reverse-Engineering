import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView.CommaTokenizer;
import com.google.android.apps.chromecast.app.backdrop.PeoplePickerRecipientView;

public final class asu
  extends j
{
  private static final String b = null;
  private static dcj c;
  private aqw a;
  
  public static asu a(dcj paramdcj)
  {
    asu localasu = new asu();
    c = paramdcj;
    Bundle localBundle = new Bundle();
    localBundle.putString("peoplePickerSettingDescription", paramdcj.d);
    localBundle.putString(null, paramdcj.toString());
    localasu.f(localBundle);
    return localasu;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(a.fy, paramViewGroup, false);
    this.a.c(a(b.cI));
    paramViewGroup = (PeoplePickerRecipientView)paramLayoutInflater.findViewById(f.bb);
    paramViewGroup.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    paramViewGroup.setAdapter(new aav(this.y));
    ((Button)paramLayoutInflater.findViewById(f.bG)).setOnClickListener(new asv(this, paramViewGroup));
    return paramLayoutInflater;
  }
  
  public final void a()
  {
    super.a();
    this.a = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.a = ((aqw)paramActivity);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\asu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */