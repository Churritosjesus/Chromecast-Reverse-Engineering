	private final android.os.Handler Z
	final android.util.SparseArray a
	private  b
	private  c
	private com.google.android.gms.common.ConnectionResult d
	
	    public bxq()
	    {
	        this.c = -1;
	        this.Z = new android.os.Handler(android.os.Looper.getMainLooper());
	        this.a = new android.util.SparseArray();
	        return;
	    }
	
	
	    public static bxq a(m p4)
	    {
	        a.g("Must be called from main thread of process");
	        IllegalStateException v1_0 = p4.b;
	        try {
	            bxq v0_3 = ((bxq) v1_0.a("GmsSupportLoaderLifecycleFragment"));
	        } catch (bxq v0_4) {
	            throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", v0_4);
	        }
	        if ((v0_3 == null) || (v0_3.r)) {
	            v0_3 = new bxq();
	            v1_0.a().a(v0_3, "GmsSupportLoaderLifecycleFragment").b();
	            v1_0.b();
	        }
	        return v0_3;
	    }
	
	
	    private void a(int p3, com.google.android.gms.common.ConnectionResult p4)
	    {
	        android.util.Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
	        bwh v0_3 = ((bxs) this.a.get(p3));
	        if (v0_3 != null) {
	            this.a.remove(p3);
	            this.h().a(p3);
	            bwh v0_4 = v0_3.b;
	            if (v0_4 != null) {
	                v0_4.a(p4);
	            }
	        }
	        this.p();
	        return;
	    }
	
	
	    static synthetic void a(bxq p0)
	    {
	        p0.p();
	        return;
	    }
	
	
	    static synthetic void a(bxq p0, int p1, com.google.android.gms.common.ConnectionResult p2)
	    {
	        p0.a(p1, p2);
	        return;
	    }
	
	
	    private void p()
	    {
	        int v0 = 0;
	        this.b = 0;
	        this.c = -1;
	        this.d = 0;
	        ap v1_1 = this.h();
	        while (v0 < this.a.size()) {
	            int v2_3 = this.a.keyAt(v0);
	            boolean v3_0 = this.b(v2_3);
	            if ((v3_0) && (v3_0.f)) {
	                v1_1.a(v2_3);
	                v1_1.a(v2_3, 0, this);
	            }
	            v0++;
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
	            this.a(this.c, this.d);
	        } else {
	            this.p();
	        }
	        return;
	    }
	
	
	    public final void a(android.app.Activity p6)
	    {
	        super.a(p6);
	        int v1 = 0;
	        while (v1 < this.a.size()) {
	            int v2 = this.a.keyAt(v1);
	            com.google.android.gms.common.api.GoogleApiClient v3_0 = this.b(v2);
	            if ((v3_0 == null) || (((bxs) this.a.valueAt(v1)).a == v3_0.e)) {
	                this.h().a(v2, 0, this);
	            } else {
	                this.h().b(v2, 0, this);
	            }
	            v1++;
	        }
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p4)
	    {
	        super.a(p4);
	        if (p4 != null) {
	            this.b = p4.getBoolean("resolving_error", 0);
	            this.c = p4.getInt("failed_client_id", -1);
	            if (this.c >= 0) {
	                this.d = new com.google.android.gms.common.ConnectionResult(p4.getInt("failed_status"), ((android.app.PendingIntent) p4.getParcelable("failed_resolution")));
	            }
	        }
	        return;
	    }
	
	
	    public final synthetic void a(bi p4, Object p5)
	    {
	        if (!((com.google.android.gms.common.ConnectionResult) p5).b()) {
	            int v0_1 = p4.a;
	            if (!this.b) {
	                this.b = 1;
	                this.c = v0_1;
	                this.d = ((com.google.android.gms.common.ConnectionResult) p5);
	                this.Z.post(new bxt(this, v0_1, ((com.google.android.gms.common.ConnectionResult) p5)));
	            }
	        }
	        return;
	    }
	
	
	    final bxr b(int p4)
	    {
	        try {
	            return ((bxr) this.h().b(p4));
	        } catch (ClassCastException v0_3) {
	            throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", v0_3);
	        }
	    }
	
	
	    public final bi c_(int p4)
	    {
	        return new bxr(this.y, ((bxs) this.a.get(p4)).a);
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        p3.putBoolean("resolving_error", this.b);
	        if (this.c >= 0) {
	            p3.putInt("failed_client_id", this.c);
	            p3.putInt("failed_status", this.d.c);
	            p3.putParcelable("failed_resolution", this.d.d);
	        }
	        return;
	    }
	
	
	    public final void g_()
	    {
	        super.g_();
	        if (!this.b) {
	            int v0_1 = 0;
	            while (v0_1 < this.a.size()) {
	                this.h().a(this.a.keyAt(v0_1), 0, this);
	                v0_1++;
	            }
	        }
	        return;
	    }
	
	
	    public final void onCancel(android.content.DialogInterface p5)
	    {
	        this.a(this.c, new com.google.android.gms.common.ConnectionResult(13, 0));
	        return;
	    }
	
