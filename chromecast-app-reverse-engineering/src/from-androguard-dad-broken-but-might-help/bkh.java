	private static bkh j
	 bwj a
	 bwj b
	 ctn c
	public ctk d
	public bkk e
	 blp f
	public final bke g
	public final blv h
	public ctw i
	
	    bkh()
	    {
	        this.f = new blp("ChromecastTagManager", 0);
	        this.g = new bke();
	        this.h = new blv();
	        return;
	    }
	
	
	    public static bkh a()
	    {
	        if (bkh.j == null) {
	            bkh.j = new bkh();
	        }
	        return bkh.j;
	    }
	
	
	    public final void b()
	    {
	        if ((this.a == null) || (this.a.c())) {
	            int v0_5;
	            int v0_3 = com.google.android.apps.chromecast.app.SetupApplication.a();
	            bkj v1_0 = cuq.a(v0_3);
	            this.i = v1_0.a;
	            int v2_2 = v0_3.c().b();
	            int v0_4 = v0_3.c();
	            String v3_0 = java.util.Locale.getDefault();
	            if (!v0_4.a.containsKey(blj.c(v3_0))) {
	                if (!v0_4.a.containsKey(blj.b(v3_0))) {
	                    if (!v0_4.a.containsKey(bli.b)) {
	                        v0_5 = 0;
	                    } else {
	                        v0_5 = ((Integer) v0_4.a.get(bli.b)).intValue();
	                    }
	                } else {
	                    v0_5 = ((Integer) v0_4.a.get(blj.b(v3_0))).intValue();
	                }
	            } else {
	                v0_5 = ((Integer) v0_4.a.get(blj.c(v3_0))).intValue();
	            }
	            this.a = v1_0.a(v2_2, v0_5);
	            this.b = v1_0.a("GTM-K5SPV5", -1);
	            this.a.a(new bki(this));
	            this.b.a(new bkj(this));
	        }
	        return;
	    }
	
