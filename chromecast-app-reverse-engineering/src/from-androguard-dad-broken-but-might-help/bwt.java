	private final java.lang.ref.WeakReference a
	
	    bwt(bws p2)
	    {
	        this.a = new ref.WeakReference(p2);
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.ConnectionResult p4, com.google.android.gms.signin.internal.AuthAccountResult p5)
	    {
	        bws v0_2 = ((bws) this.a.get());
	        if (v0_2 != null) {
	            v0_2.a.h.post(new bwu(this, v0_2, p4));
	        }
	        return;
	    }
	
