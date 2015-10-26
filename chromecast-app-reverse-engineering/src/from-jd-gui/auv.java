import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

public final class auv
{
  int a = 0;
  BluetoothGatt b;
  public boolean c = false;
  public BluetoothGattService d;
  final Handler e;
  public final LinkedList f = new LinkedList();
  public final LinkedList g = new LinkedList();
  private final BluetoothDevice h;
  private final blp i;
  private Context j;
  private boolean k = false;
  private final BluetoothGattCallback l = new aux(this);
  
  public auv(BluetoothDevice paramBluetoothDevice, Context paramContext)
  {
    this.h = paramBluetoothDevice;
    this.j = paramContext;
    this.i = new blp("BleConnectionManager");
    this.k = false;
    this.e = new Handler(Looper.getMainLooper());
  }
  
  private void c()
  {
    this.c = false;
    this.e.removeCallbacksAndMessages(null);
    if (this.a == 0) {
      a();
    }
    for (;;)
    {
      return;
      for (;;)
      {
        if (!this.f.isEmpty())
        {
          avr localavr = (avr)this.f.poll();
          int m = localavr.a;
          if ((m == 1) || (m == 0))
          {
            this.d = null;
            c(localavr);
            this.f.clear();
            this.b.disconnect();
            break;
          }
        }
      }
    }
  }
  
  private void c(avr paramavr)
  {
    this.k = true;
    switch (paramavr.a)
    {
    }
    for (;;)
    {
      return;
      Object localObject;
      if (this.d != null)
      {
        localObject = (awi)paramavr;
        paramavr = this.d.getCharacteristic(((awi)localObject).d);
        if (paramavr != null)
        {
          paramavr.setValue(((awi)localObject).b);
          if (!this.b.writeCharacteristic(paramavr)) {
            ((awi)localObject).a();
          }
        }
        else
        {
          ((awi)localObject).a();
        }
      }
      else
      {
        ((awi)paramavr).a();
        continue;
        if (this.d != null)
        {
          paramavr = (awb)paramavr;
          localObject = this.d.getCharacteristic(paramavr.c);
          if (localObject != null)
          {
            if (!this.b.readCharacteristic((BluetoothGattCharacteristic)localObject))
            {
              localObject = paramavr.c;
              paramavr.a();
            }
          }
          else
          {
            localObject = paramavr.c;
            paramavr.a();
          }
        }
        else
        {
          ((awb)paramavr).a();
          continue;
          paramavr = (avw)paramavr;
          this.b.requestMtu(paramavr.c);
          continue;
          paramavr = (avu)paramavr;
          if (!this.b.discoverServices()) {
            paramavr.a();
          }
        }
      }
    }
  }
  
  public final void a(avr paramavr)
  {
    this.f.add(paramavr);
    if (!this.k) {
      b();
    }
  }
  
  public final boolean a()
  {
    boolean bool = true;
    this.e.removeCallbacksAndMessages(null);
    this.e.postDelayed(new auw(this), 5000L);
    this.k = true;
    this.b = this.h.connectGatt(this.j, false, this.l);
    if (this.b != null) {}
    for (;;)
    {
      return bool;
      c();
      bool = false;
    }
  }
  
  protected final void b()
  {
    Object localObject = this.f;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((LinkedList)localObject).iterator();
    int m;
    while (localIterator.hasNext())
    {
      localObject = (avr)localIterator.next();
      switch (((avr)localObject).a)
      {
      default: 
        break;
      case 0: 
        localObject = String.valueOf(((awb)localObject).c.toString());
        if (((String)localObject).length() == 0) {}
      case 1: 
      case 3: 
      case 2: 
        for (localObject = "Read on ".concat((String)localObject);; localObject = new String("Read on "))
        {
          localArrayList.add(localObject);
          break;
          localObject = String.valueOf(((awi)localObject).d.toString());
          if (((String)localObject).length() != 0) {}
          for (localObject = "Write on ".concat((String)localObject);; localObject = new String("Write on "))
          {
            localArrayList.add(localObject);
            break;
          }
          localArrayList.add("DiscoverServices");
          break;
          m = ((avw)localObject).c;
          localArrayList.add(25 + "Change MTU to " + m);
          break;
        }
      }
    }
    TextUtils.join(", ", localArrayList);
    if ((((BluetoothManager)this.j.getSystemService("bluetooth")).getConnectionState(this.h, 7) == 2) && (this.b != null))
    {
      m = 1;
      if (m != 0) {
        break label289;
      }
      if (!a()) {
        c();
      }
    }
    for (;;)
    {
      return;
      m = 0;
      break;
      label289:
      if (!this.g.isEmpty())
      {
        c((avr)this.g.peek());
      }
      else if (!this.c)
      {
        if (Build.VERSION.SDK_INT >= 21) {
          new avy(this, 512, new auy(this)).a();
        }
        b(new avu(new auz(this)));
      }
      else if (!this.f.isEmpty())
      {
        c((avr)this.f.peek());
      }
      else
      {
        this.k = false;
      }
    }
  }
  
  public final void b(avr paramavr)
  {
    this.g.add(paramavr);
    if (!this.k) {
      b();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\auv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */