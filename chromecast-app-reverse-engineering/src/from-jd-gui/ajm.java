import android.net.Uri;
import org.json.JSONArray;

public final class ajm
{
  String a;
  String b;
  
  ajm(String paramString1, String paramString2, Uri paramUri, int[] paramArrayOfInt)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  static int[] a(JSONArray paramJSONArray)
  {
    int[] arrayOfInt = null;
    if (paramJSONArray != null)
    {
      int m = paramJSONArray.length();
      arrayOfInt = new int[m];
      int j = 0;
      for (;;)
      {
        if (j < m)
        {
          int k = paramJSONArray.optInt(j, -1);
          int i = k;
          String str;
          if (k == -1)
          {
            str = paramJSONArray.optString(j);
            i = k;
            if (aji.a(str)) {}
          }
          try
          {
            i = Integer.parseInt(str);
            arrayOfInt[j] = i;
            j++;
          }
          catch (NumberFormatException localNumberFormatException)
          {
            for (;;)
            {
              aji.a("FacebookSDK", localNumberFormatException);
              i = -1;
            }
          }
        }
      }
    }
    return arrayOfInt;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ajm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */