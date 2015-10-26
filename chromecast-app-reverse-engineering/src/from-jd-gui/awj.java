import android.os.Handler;
import java.util.UUID;

public final class awj
{
  final Handler a;
  final long b;
  private final awi c;
  
  public awj(Handler paramHandler, UUID paramUUID, byte[] paramArrayOfByte, long paramLong)
  {
    this.a = paramHandler;
    this.b = paramLong;
    this.c = new awi(paramUUID, new awk(this), paramArrayOfByte);
  }
  
  public final void a(auv paramauv)
  {
    paramauv.a(this.c);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\awj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */