import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class tn
{
  final Bundle a;
  List b;
  
  tn(Bundle paramBundle, List paramList)
  {
    this.a = paramBundle;
    this.b = paramList;
  }
  
  public final String a()
  {
    return this.a.getString("id");
  }
  
  public final String b()
  {
    return this.a.getString("name");
  }
  
  public final String c()
  {
    return this.a.getString("status");
  }
  
  public final boolean d()
  {
    return this.a.getBoolean("enabled", true);
  }
  
  public final boolean e()
  {
    return this.a.getBoolean("connecting", false);
  }
  
  public final boolean f()
  {
    return this.a.getBoolean("canDisconnect", false);
  }
  
  public final IntentSender g()
  {
    return (IntentSender)this.a.getParcelable("settingsIntent");
  }
  
  public final List h()
  {
    i();
    return this.b;
  }
  
  void i()
  {
    if (this.b == null)
    {
      this.b = this.a.getParcelableArrayList("controlFilters");
      if (this.b == null) {
        this.b = Collections.emptyList();
      }
    }
  }
  
  public final int j()
  {
    return this.a.getInt("playbackType", 1);
  }
  
  public final int k()
  {
    return this.a.getInt("playbackStream", -1);
  }
  
  public final int l()
  {
    return this.a.getInt("volume");
  }
  
  public final int m()
  {
    return this.a.getInt("volumeMax");
  }
  
  public final int n()
  {
    return this.a.getInt("volumeHandling", 0);
  }
  
  public final int o()
  {
    return this.a.getInt("presentationDisplayId", -1);
  }
  
  public final Bundle p()
  {
    return this.a.getBundle("extras");
  }
  
  public final boolean q()
  {
    i();
    if ((TextUtils.isEmpty(a())) || (TextUtils.isEmpty(b())) || (this.b.contains(null))) {}
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MediaRouteDescriptor{ ");
    localStringBuilder.append("id=").append(a());
    localStringBuilder.append(", name=").append(b());
    localStringBuilder.append(", description=").append(c());
    localStringBuilder.append(", isEnabled=").append(d());
    localStringBuilder.append(", isConnecting=").append(e());
    localStringBuilder.append(", controlFilters=").append(Arrays.toString(h().toArray()));
    localStringBuilder.append(", playbackType=").append(j());
    localStringBuilder.append(", playbackStream=").append(k());
    localStringBuilder.append(", volume=").append(l());
    localStringBuilder.append(", volumeMax=").append(m());
    localStringBuilder.append(", volumeHandling=").append(n());
    localStringBuilder.append(", presentationDisplayId=").append(o());
    localStringBuilder.append(", extras=").append(p());
    localStringBuilder.append(", isValid=").append(q());
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\tn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */