	private static final android.os.ParcelUuid e
	public ayk a
	private android.bluetooth.BluetoothAdapter b
	private android.bluetooth.BluetoothAdapter$LeScanCallback c
	private android.bluetooth.le.ScanCallback d
	private java.util.ArrayList f
	private  g
	private final android.os.Handler h
	private final blp i
	
	    static ayf()
	    {
	        ayf.e = android.os.ParcelUuid.fromString("0000FEA0-0000-1000-8000-00805F9B34FB");
	        return;
	    }
	
	
	    static synthetic blp a(ayf p1)
	    {
	        return p1.i;
	    }
	
	
	    static synthetic void a(ayf p5, String p6)
	    {
	        if (!p5.f.contains(p6)) {
	            p5.f.add(p6);
	            p5.g = (p5.g + 1);
	        } else {
	            p5.g = (p5.g - 1);
	            if (((float) p5.g) <= (((float) p5.f.size()) * 1061158912)) {
	                Object[] v0_10 = new Object[1];
	                v0_10[0] = Integer.valueOf(p5.f.size());
	                p5.a.a();
	            }
	        }
	        Object[] v0_13 = new Object[2];
	        v0_13[0] = Integer.valueOf(p5.f.size());
	        v0_13[1] = Integer.valueOf(p5.g);
	        Object[] v0_14 = new Object[1];
	        v0_14[0] = Float.valueOf((((float) p5.f.size()) * 1061158912));
	        return;
	    }
	
	
	    static synthetic ayk b(ayf p1)
	    {
	        return p1.a;
	    }
	
	
	    public final boolean a()
	    {
	        if ((this.b == null) || (!this.b.isEnabled())) {
	            boolean v0_3 = 0;
	        } else {
	            if (android.os.Build$VERSION.SDK_INT < 21) {
	                if (this.a != null) {
	                    this.c = new ayg(this);
	                }
	                this.h.postDelayed(new ayh(this), 10000);
	                v0_3 = this.b.startLeScan(this.c);
	            } else {
	                if (this.a != null) {
	                    this.d = new ayi(this);
	                    this.h.postDelayed(new ayj(this), 10000);
	                    boolean v0_15 = this.b.getBluetoothLeScanner();
	                    android.bluetooth.BluetoothAdapter$LeScanCallback v1_9 = new android.bluetooth.le.ScanSettings$Builder().setScanMode(2).build();
	                    java.util.ArrayList v2_3 = new java.util.ArrayList();
	                    v2_3.add(new android.bluetooth.le.ScanFilter$Builder().setServiceUuid(ayf.e).build());
	                    v0_15.startScan(v2_3, v1_9, this.d);
	                }
	                v0_3 = 1;
	            }
	        }
	        return v0_3;
	    }
	
