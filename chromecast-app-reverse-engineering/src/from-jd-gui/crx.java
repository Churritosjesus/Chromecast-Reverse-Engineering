import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

public final class crx
  extends bya
  implements csq
{
  public crx(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public final String a()
  {
    return a("account_name");
  }
  
  public final String b()
  {
    String str2 = a("display_name");
    String str1 = str2;
    if (TextUtils.isEmpty(str2)) {
      str1 = a("account_name");
    }
    return str1;
  }
  
  public final String c()
  {
    return crz.a.a(a("avatar"));
  }
  
  public final String d()
  {
    return a("page_gaia_id");
  }
  
  public final String e()
  {
    return crz.a.a(a("cover_photo_url"));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\crx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */