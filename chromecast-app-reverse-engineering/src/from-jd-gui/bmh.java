import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.widget.EditText;
import com.google.android.apps.chromecast.app.DeviceSettingsActivity;
import java.util.HashMap;

final class bmh
  implements DialogInterface.OnClickListener
{
  bmh(bmg parambmg) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = bmg.a(this.a).getText().toString().trim();
    if ((!TextUtils.isEmpty(str)) && (!str.equals(bmg.b(this.a))))
    {
      paramDialogInterface = bmg.c(this.a);
      if (paramDialogInterface.g()) {
        paramDialogInterface.e.a(str);
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("friendly_name", str);
      paramDialogInterface.a(localHashMap, new alv(paramDialogInterface, str), 37);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bmh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */