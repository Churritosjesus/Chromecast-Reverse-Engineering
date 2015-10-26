import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class bth
{
  private static final String[] d = { null, "String", "int", "double", "ISO-8601 date String" };
  private static final bti e = new bti().a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).a("com.google.android.gms.cast.metadata.TITLE", "title", 1).a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).a("com.google.android.gms.cast.metadata.WIDTH", "width", 2).a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
  public final List a = new ArrayList();
  final Bundle b = new Bundle();
  public int c;
  
  public bth()
  {
    this(0);
  }
  
  public bth(int paramInt)
  {
    this.c = paramInt;
  }
  
  private static void a(String paramString, int paramInt)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("null and empty keys are not allowed");
    }
    int i = e.a(paramString);
    if ((i != paramInt) && (i != 0)) {
      throw new IllegalArgumentException("Value for " + paramString + " must be a " + d[paramInt]);
    }
  }
  
  private boolean a(Bundle paramBundle1, Bundle paramBundle2)
  {
    boolean bool;
    if (paramBundle1.size() != paramBundle2.size()) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      Iterator localIterator = paramBundle1.keySet().iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          Object localObject2 = paramBundle1.get(str);
          Object localObject1 = paramBundle2.get(str);
          if (((localObject2 instanceof Bundle)) && ((localObject1 instanceof Bundle)) && (!a((Bundle)localObject2, (Bundle)localObject1)))
          {
            bool = false;
            break;
          }
          if (localObject2 == null)
          {
            if ((localObject1 == null) && (paramBundle2.containsKey(str))) {
              continue;
            }
            bool = false;
            break;
          }
          if (!localObject2.equals(localObject1))
          {
            bool = false;
            break;
          }
        }
      }
      bool = true;
    }
  }
  
  void a(JSONObject paramJSONObject, String... paramVarArgs)
  {
    paramVarArgs = new HashSet(Arrays.asList(paramVarArgs));
    for (;;)
    {
      Object localObject2;
      try
      {
        Iterator localIterator = paramJSONObject.keys();
        if (localIterator.hasNext())
        {
          Object localObject1 = (String)localIterator.next();
          if ("metadataType".equals(localObject1)) {
            continue;
          }
          localObject2 = (String)e.a.get(localObject1);
          if (localObject2 != null)
          {
            boolean bool = paramVarArgs.contains(localObject2);
            if (!bool) {
              continue;
            }
            try
            {
              localObject1 = paramJSONObject.get((String)localObject1);
              if (localObject1 == null) {
                continue;
              }
              switch (e.a((String)localObject2))
              {
              }
            }
            catch (JSONException localJSONException) {}
            if (!(localObject1 instanceof String)) {
              continue;
            }
            this.b.putString((String)localObject2, (String)localObject1);
            continue;
            continue;
            if ((!(localJSONException instanceof String)) || (cjf.a((String)localJSONException) == null)) {
              continue;
            }
            this.b.putString((String)localObject2, (String)localJSONException);
            continue;
            if (!(localJSONException instanceof Integer)) {
              continue;
            }
            this.b.putInt((String)localObject2, ((Integer)localJSONException).intValue());
            continue;
            if (!(localJSONException instanceof Double)) {
              continue;
            }
            this.b.putDouble((String)localObject2, ((Double)localJSONException).doubleValue());
            continue;
          }
          localObject2 = paramJSONObject.get(localJSONException);
          if ((localObject2 instanceof String)) {
            this.b.putString(localJSONException, (String)localObject2);
          }
        }
        else
        {
          return;
        }
      }
      catch (JSONException paramJSONObject) {}
      if ((localObject2 instanceof Integer)) {
        this.b.putInt(localJSONException, ((Integer)localObject2).intValue());
      } else if ((localObject2 instanceof Double)) {
        this.b.putDouble(localJSONException, ((Double)localObject2).doubleValue());
      }
    }
  }
  
  public final boolean a(String paramString)
  {
    return this.b.containsKey(paramString);
  }
  
  public final String b(String paramString)
  {
    a(paramString, 1);
    return this.b.getString(paramString);
  }
  
  public final int c(String paramString)
  {
    a(paramString, 2);
    return this.b.getInt(paramString);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof bth))
      {
        bool = false;
      }
      else
      {
        paramObject = (bth)paramObject;
        if ((!a(this.b, ((bth)paramObject).b)) || (!this.a.equals(((bth)paramObject).a))) {
          bool = false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    Iterator localIterator = this.b.keySet().iterator();
    String str;
    for (int i = 17; localIterator.hasNext(); i = this.b.get(str).hashCode() + i * 31) {
      str = (String)localIterator.next();
    }
    return i * 31 + this.a.hashCode();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */