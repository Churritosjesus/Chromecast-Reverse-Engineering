import android.os.Handler;
import android.os.Message;
import java.util.UUID;

public final class avm
{
  auv a;
  final Handler b;
  final UUID c;
  private final blp d = new blp("BlobReader");
  private final UUID e;
  private StringBuilder f;
  private byte g;
  
  public avm(UUID paramUUID1, UUID paramUUID2, Handler paramHandler)
  {
    this.e = paramUUID1;
    this.c = paramUUID2;
    this.b = paramHandler;
  }
  
  public final void a(auv paramauv)
  {
    this.g = 0;
    this.f = new StringBuilder();
    this.a = paramauv;
    a(null);
  }
  
  void a(byte[] paramArrayOfByte)
  {
    Object localObject = null;
    int j;
    if (paramArrayOfByte != null)
    {
      j = paramArrayOfByte.length;
      localObject = new String(paramArrayOfByte, blj.a);
      this.f.append((String)localObject);
      ((String)localObject).length();
    }
    if ((paramArrayOfByte == null) || ((localObject != null) && (paramArrayOfByte.length == 512)))
    {
      int i = this.g;
      localObject = new awi(this.e, new avn(this), new byte[] { i });
      if (this.g == Byte.MAX_VALUE) {
        this.b.obtainMessage(1).sendToTarget();
      }
    }
    else
    {
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length >= 512)) {
        break label168;
      }
      this.b.obtainMessage(0, this.f.toString()).sendToTarget();
    }
    for (;;)
    {
      j = this.g;
      paramArrayOfByte = this.f;
      return;
      this.g = ((byte)(this.g + 1));
      this.a.a((avr)localObject);
      break;
      label168:
      if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 512)) {
        this.b.obtainMessage(1).sendToTarget();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\avm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */