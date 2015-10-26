import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;

public final class aus
{
  final Handler a;
  private final blp b;
  private ArrayList c;
  private bdf d;
  private int e;
  private String f;
  private String g;
  private String h;
  
  public aus(int paramInt, Handler paramHandler)
  {
    this.a = paramHandler;
    this.b = new blp("AttributeReadQueue");
    paramHandler = new ArrayList();
    paramHandler.add(avp.c);
    if ((paramInt & 0x2) != 0) {
      paramHandler.add(avp.d);
    }
    if ((paramInt & 0x8) != 0)
    {
      paramHandler.add(avp.f);
      paramHandler.add(avp.o);
      paramHandler.add(avp.r);
      paramHandler.add(avp.s);
    }
    if ((paramInt & 0x20) != 0) {
      paramHandler.add(avp.t);
    }
    if ((paramInt & 0x80) != 0)
    {
      paramHandler.add(avp.e);
      paramHandler.add(avp.p);
    }
    if ((paramInt & 0x1000) != 0)
    {
      paramHandler.add(avp.i);
      paramHandler.add(avp.q);
      paramHandler.add(avp.g);
      paramHandler.add(avp.h);
    }
    this.e = paramHandler.size();
    this.c = paramHandler;
    this.d = new bdf();
  }
  
  private static String a(byte[] paramArrayOfByte)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      localArrayList.add(String.format("%02X", new Object[] { Byte.valueOf(paramArrayOfByte[i]) }));
    }
    return TextUtils.join(":", localArrayList);
  }
  
  private void a()
  {
    if ((this.f != null) && (this.g != null) && (this.h != null))
    {
      byte[] arrayOfByte = Base64.decode(this.h.getBytes(blj.a), 0);
      this.d.U = new bcv(this.f, this.g, arrayOfByte);
    }
  }
  
  public final void a(auv paramauv)
  {
    this.d.P = Boolean.valueOf(false);
    this.d.O = true;
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      UUID localUUID = (UUID)localIterator.next();
      if (avp.a(localUUID)) {
        new avm(avp.b(localUUID), localUUID, new aut(this, Looper.getMainLooper(), localUUID)).a(paramauv);
      } else {
        paramauv.a(new awb(localUUID, new auu(this, localUUID)));
      }
    }
  }
  
  public final void a(byte[] paramArrayOfByte, UUID paramUUID)
  {
    int i;
    if (paramUUID.equals(avp.c))
    {
      this.d.a = paramArrayOfByte[0];
      i = paramArrayOfByte[0];
    }
    for (;;)
    {
      this.e -= 1;
      paramArrayOfByte = this.c;
      if (this.e == 0) {
        this.a.obtainMessage(0, this.d).sendToTarget();
      }
      return;
      if (paramUUID.equals(avp.t))
      {
        paramUUID = new ArrayList();
        for (i = 0; i < paramArrayOfByte.length; i++) {
          paramUUID.add(Integer.toString(paramArrayOfByte[i] & 0xFF));
        }
        paramArrayOfByte = TextUtils.join(".", paramUUID);
        this.d.u = paramArrayOfByte;
      }
      else if (paramUUID.equals(avp.r))
      {
        paramArrayOfByte = a(paramArrayOfByte);
        this.d.p = paramArrayOfByte.toString();
      }
      else
      {
        if (paramUUID.equals(avp.e))
        {
          paramUUID = this.d;
          if (paramArrayOfByte[0] == 1) {}
          for (boolean bool = true;; bool = false)
          {
            paramUUID.E = bool;
            break;
          }
        }
        if (paramUUID.equals(avp.o))
        {
          paramArrayOfByte = a(paramArrayOfByte);
          this.d.a(paramArrayOfByte.toString());
        }
        else if (paramUUID.equals(avp.p))
        {
          this.d.G = bdj.a(paramArrayOfByte[0]);
        }
        else if (paramUUID.equals(avp.f))
        {
          this.d.r = new String(paramArrayOfByte, blj.a);
        }
        else if (paramUUID.equals(avp.q))
        {
          try
          {
            paramUUID = new org/json/JSONArray;
            String str = new java/lang/String;
            str.<init>(paramArrayOfByte, blj.a);
            paramUUID.<init>(str);
            paramArrayOfByte = paramUUID;
          }
          catch (JSONException paramArrayOfByte)
          {
            for (;;)
            {
              this.a.obtainMessage(1).sendToTarget();
              paramArrayOfByte = null;
            }
            this.d.V = paramUUID;
          }
          if ((paramArrayOfByte != null) && (paramArrayOfByte.length() > 0))
          {
            paramUUID = new String[paramArrayOfByte.length()];
            for (i = 0; i < paramArrayOfByte.length(); i++) {
              paramUUID[i] = paramArrayOfByte.optString(i, null);
            }
          }
        }
        else if (paramUUID.equals(avp.i))
        {
          this.f = new String(paramArrayOfByte, blj.a);
          a();
        }
        else if (paramUUID.equals(avp.g))
        {
          this.g = new String(paramArrayOfByte, blj.a);
          a();
        }
        else if (paramUUID.equals(avp.h))
        {
          this.h = new String(paramArrayOfByte, blj.a);
          a();
        }
        else if (paramUUID.equals(avp.d))
        {
          this.d.b = new String(paramArrayOfByte, blj.a);
        }
        else if (paramUUID.equals(avp.s))
        {
          this.d.n = new String(paramArrayOfByte, blj.a);
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */