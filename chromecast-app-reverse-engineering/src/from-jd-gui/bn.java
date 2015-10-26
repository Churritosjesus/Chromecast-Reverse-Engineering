import android.content.BroadcastReceiver;
import android.content.IntentFilter;

public final class bn
{
  final IntentFilter a;
  public final BroadcastReceiver b;
  boolean c;
  
  bn(IntentFilter paramIntentFilter, BroadcastReceiver paramBroadcastReceiver)
  {
    this.a = paramIntentFilter;
    this.b = paramBroadcastReceiver;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("Receiver{");
    localStringBuilder.append(this.b);
    localStringBuilder.append(" filter=");
    localStringBuilder.append(this.a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */