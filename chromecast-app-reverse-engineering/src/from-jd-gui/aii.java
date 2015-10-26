import android.os.Bundle;
import java.util.ArrayList;
import org.json.JSONArray;

final class aii
  implements aij
{
  public final void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    JSONArray localJSONArray = (JSONArray)paramObject;
    ArrayList localArrayList = new ArrayList();
    if (localJSONArray.length() == 0) {
      paramBundle.putStringArrayList(paramString, localArrayList);
    }
    for (;;)
    {
      return;
      int i = 0;
      while (i < localJSONArray.length())
      {
        paramObject = localJSONArray.get(i);
        if ((paramObject instanceof String))
        {
          localArrayList.add((String)paramObject);
          i++;
        }
        else
        {
          paramBundle = String.valueOf(paramObject.getClass());
          throw new IllegalArgumentException(String.valueOf(paramBundle).length() + 29 + "Unexpected type in an array: " + paramBundle);
        }
      }
      paramBundle.putStringArrayList(paramString, localArrayList);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */