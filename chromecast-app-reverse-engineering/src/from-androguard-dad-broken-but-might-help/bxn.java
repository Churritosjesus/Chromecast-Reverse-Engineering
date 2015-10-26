	private com.google.android.gms.common.ConnectionResult Z
	  a
	private final android.os.Handler aa
	  b
	final android.util.SparseArray c
	private  d
	
	    public bxn()
	    {
	        this.d = -1;
	        this.aa = new android.os.Handler(android.os.Looper.getMainLooper());
	        this.c = new android.util.SparseArray();
	        return;
	    }
	
	
	    static synthetic int a(bxn p0, int p1)
	    {
	        p0.d = p1;
	        return p1;
	    }
	
	
	    public static bxn a(m p4)
	    {
	        a.g("Must be called from main thread of process");
	        IllegalStateException v1_0 = p4.b;
	        try {
	            bxn v0_3 = ((bxn) v1_0.a("GmsSupportLifecycleFragment"));
	        } catch (bxn v0_4) {
	            throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", v0_4);
	        }
	        if ((v0_3 == null) || (v0_3.r)) {
	            v0_3 = new bxn();
	            v1_0.a().a(v0_3, "GmsSupportLifecycleFragment").b();
	            v1_0.b();
	        }
	        return v0_3;
	    }
	
	
	    static synthetic com.google.android.gms.common.ConnectionResult a(bxn p0, com.google.android.gms.common.ConnectionResult p1)
	    {
	        p0.Z = p1;
	        return p1;
	    }
	
	
	    private void a(int p4, com.google.android.gms.common.ConnectionResult p5)
	    {
	        android.util.Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
	        bwh v0_3 = ((bxo) this.c.get(p4));
	        if (v0_3 != null) {
	            com.google.android.gms.common.api.GoogleApiClient v1_3 = ((bxo) this.c.get(p4));
	            this.c.remove(p4);
	            if (v1_3 != null) {
	                v1_3.b.b(v1_3);
	                v1_3.b.c();
	            }
	            bwh v0_4 = v0_3.c;
	            if (v0_4 != null) {
	                v0_4.a(p5);
	            }
	        }
	        this.p();
	        return;
	    }
	
	
	    static synthetic void a(bxn p0, int p1, com.google.android.gms.common.ConnectionResult p2)
	    {
	        p0.a(p1, p2);
	        return;
	    }
	
	
	    static synthetic boolean a(bxn p1)
	    {
	        return p1.a;
	    }
	
	
	    static synthetic boolean a(bxn p1, boolean p2)
	    {
	        p1.b = 1;
	        return 1;
	    }
	
	
	    static synthetic boolean b(bxn p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic void c(bxn p0)
	    {
	        p0.p();
	        return;
	    }
	
	
	    static synthetic android.os.Handler d(bxn p1)
	    {
	        return p1.aa;
	    }
	
	
	    private void p()
	    {
	        this.b = 0;
	        this.d = -1;
	        this.Z = 0;
	        int v1_2 = 0;
	        while (v1_2 < this.c.size()) {
	            ((bxo) this.c.valueAt(v1_2)).b.b();
	            v1_2++;
	        }
	        return;
	    }
	
	
	    public final void a(int p4, int p5, android.content.Intent p6)
	    {
	        int v0_0 = 1;
	        switch (p4) {
	            case 1:
	                if (p5 != -1) {
	                    v0_0 = 0;
	                } else {
	                }
	                break;
	            case 2:
	                if (bvt.a(this.y) != 0) {
	                } else {
	                }
	                break;
	            default:
	        }
	        if (v0_0 == 0) {
	            this.a(this.d, this.Z);
	        } else {
	            this.p();
	        }
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p4)
	    {
	        super.a(p4);
	        if (p4 != null) {
	            this.b = p4.getBoolean("resolving_error", 0);
	            this.d = p4.getInt("failed_client_id", -1);
	            if (this.d >= 0) {
	                this.Z = new com.google.android.gms.common.ConnectionResult(p4.getInt("failed_status"), ((android.app.PendingIntent) p4.getParcelable("failed_resolution")));
	            }
	        }
	        return;
	    }
	
	
	    public final void a(String p5, java.io.FileDescriptor p6, java.io.PrintWriter p7, String[] p8)
	    {
	        super.a(p5, p6, p7, p8);
	        int v1 = 0;
	        while (v1 < this.c.size()) {
	            int v0_5 = ((bxo) this.c.valueAt(v1));
	            p7.append("#").print(v0_5.a);
	            p7.append(" ");
	            v0_5.b.a(p5, p6, p7, p8);
	            v1++;
	        }
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        p3.putBoolean("resolving_error", this.b);
	        if (this.d >= 0) {
	            p3.putInt("failed_client_id", this.d);
	            p3.putInt("failed_status", this.Z.c);
	            p3.putParcelable("failed_resolution", this.Z.d);
	        }
	        return;
	    }
	
	
	    public final void g_()
	    {
	        super.g_();
	        this.a = 1;
	        if (!this.b) {
	            int v1 = 0;
	            while (v1 < this.c.size()) {
	                ((bxo) this.c.valueAt(v1)).b.b();
	                v1++;
	            }
	        }
	        return;
	    }
	
	
	    public final void h_()
	    {
	        super.h_();
	        this.a = 0;
	        int v1 = 0;
	        while (v1 < this.c.size()) {
	            ((bxo) this.c.valueAt(v1)).b.c();
	            v1++;
	        }
	        return;
	    }
	
	
	    public final void onCancel(android.content.DialogInterface p5)
	    {
	        this.a(this.d, new com.google.android.gms.common.ConnectionResult(13, 0));
	        return;
	    }
	
