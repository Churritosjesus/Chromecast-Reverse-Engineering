import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter.Builder;
import android.bluetooth.le.ScanSettings;
import android.bluetooth.le.ScanSettings.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.ParcelUuid;
import java.util.ArrayList;
import java.util.List;

public final class ayf
{
  private static final ParcelUuid e = ParcelUuid.fromString("0000FEA0-0000-1000-8000-00805F9B34FB");
  public ayk a;
  private BluetoothAdapter b;
  private BluetoothAdapter.LeScanCallback c;
  private ScanCallback d;
  private ArrayList f;
  private int g;
  private final Handler h;
  private final blp i;
  
  public final boolean a()
  {
    boolean bool;
    if ((this.b != null) && (this.b.isEnabled())) {
      if (Build.VERSION.SDK_INT >= 21)
      {
        if (this.a != null)
        {
          this.d = new ayi(this);
          this.h.postDelayed(new ayj(this), 10000L);
          BluetoothLeScanner localBluetoothLeScanner = this.b.getBluetoothLeScanner();
          ScanSettings localScanSettings = new ScanSettings.Builder().setScanMode(2).build();
          ArrayList localArrayList = new ArrayList();
          localArrayList.add(new ScanFilter.Builder().setServiceUuid(e).build());
          localBluetoothLeScanner.startScan(localArrayList, localScanSettings, this.d);
        }
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      if (this.a != null) {
        this.c = new ayg(this);
      }
      this.h.postDelayed(new ayh(this), 10000L);
      bool = this.b.startLeScan(this.c);
      continue;
      bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ayf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */