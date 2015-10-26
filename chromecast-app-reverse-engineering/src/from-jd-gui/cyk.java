import android.content.Context;
import android.net.Uri;
import java.util.Map;

final class cyk
  implements cua
{
  private final Context a;
  
  public cyk(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a(Map paramMap)
  {
    Object localObject = paramMap.get("gtm.url");
    if (localObject == null)
    {
      paramMap = paramMap.get("gtm");
      if ((paramMap == null) || (!(paramMap instanceof Map))) {}
    }
    for (paramMap = ((Map)paramMap).get("url");; paramMap = (Map)localObject)
    {
      if ((paramMap == null) || (!(paramMap instanceof String))) {}
      for (;;)
      {
        return;
        paramMap = Uri.parse((String)paramMap).getQueryParameter("referrer");
        if (paramMap != null) {
          cvr.b(this.a, paramMap);
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cyk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */