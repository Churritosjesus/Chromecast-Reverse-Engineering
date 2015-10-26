	private android.view.View Z
	private bos aa
	private android.app.AlertDialog ab
	private com.google.android.apps.chromecast.app.DeviceSettingsActivity ac
	private  ad
	private bfs ae
	private java.lang.String af
	
	    public bmi()
	    {
	        return;
	    }
	
	
	    public static bmi a(boolean p3, bfs p4)
	    {
	        bmi v0_1 = new bmi();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putBoolean("hasScannedNetworks", p3);
	        v1_1.putParcelable("wifiNetwork", p4);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    static synthetic void a(bmi p1, int p2)
	    {
	        p1.b(8);
	        return;
	    }
	
	
	    static synthetic void a(bmi p1, boolean p2)
	    {
	        p1.g(0);
	        return;
	    }
	
	
	    static synthetic boolean a(bmi p1)
	    {
	        return p1.ad;
	    }
	
	
	    static synthetic android.app.AlertDialog b(bmi p1)
	    {
	        return p1.ab;
	    }
	
	
	    private void b(int p3)
	    {
	        this.ab.getButton(-2).setVisibility(p3);
	        this.ab.getButton(-1).setVisibility(p3);
	        return;
	    }
	
	
	    static synthetic bos c(bmi p1)
	    {
	        return p1.aa;
	    }
	
	
	    static synthetic com.google.android.apps.chromecast.app.DeviceSettingsActivity d(bmi p1)
	    {
	        return p1.ac;
	    }
	
	
	    private void g(boolean p6)
	    {
	        android.view.View v0_1 = this.Z.findViewById(f.bH);
	        android.view.View v1_2 = this.Z.findViewById(f.ba);
	        if (!p6) {
	            v0_1.setVisibility(0);
	            v1_2.setVisibility(8);
	        } else {
	            v0_1.setVisibility(8);
	            v1_2.setVisibility(0);
	        }
	        return;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.ac = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p1)
	    {
	        super.a(p1);
	        this.ac = ((com.google.android.apps.chromecast.app.DeviceSettingsActivity) p1);
	        return;
	    }
	
	
	    public final android.app.Dialog c(android.os.Bundle p5)
	    {
	        this.ad = this.m.getBoolean("hasScannedNetworks");
	        this.ae = ((bfs) this.m.getParcelable("wifiNetwork"));
	        this.af = this.ae.a;
	        if (p5 != null) {
	            if (p5.containsKey("hasScannedNetworks")) {
	                this.ad = p5.getBoolean("hasScannedNetworks");
	            }
	            if (p5.containsKey("selectedNetwork")) {
	                this.af = p5.getString("selectedNetwork");
	            }
	        }
	        this.Z = this.y.getLayoutInflater().inflate(a.gj, 0);
	        this.ab = new android.app.AlertDialog$Builder(this.ac).setInverseBackgroundForced(1).setTitle(b.cX).setView(this.Z).setNegativeButton(b.H, 0).setPositiveButton(b.I, 0).setCancelable(1).create();
	        this.ab.setOnShowListener(new bmj(this));
	        return this.ab;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        p3.putBoolean("hasScannedNetworks", this.ad);
	        p3.putString("selectedNetwork", this.aa.a().a);
	        return;
	    }
	
	
	    public final void p()
	    {
	        if (this.ac != null) {
	            this.ad = 1;
	            this.aa = new bos(((android.view.ViewGroup) this.Z.findViewById(f.ba)));
	            if (this.aa != null) {
	                bfu v0_7;
	                if (this.ae != null) {
	                    v0_7 = this.ae.b;
	                } else {
	                    v0_7 = bfu.a;
	                }
	                if ((this.ae == null) || (!this.ae.g)) {
	                    int v1_6 = 0;
	                } else {
	                    v1_6 = 1;
	                }
	                this.aa.a(this.ac.r, this.af, v0_7, v1_6);
	            }
	            this.aa.a(this.a(b.el));
	            this.g(1);
	            this.b(0);
	        }
	        return;
	    }
	
