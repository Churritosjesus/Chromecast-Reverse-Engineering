	private synthetic java.util.List a
	private synthetic java.lang.String b
	private synthetic ctd c
	private synthetic cth d
	
	    cti(cth p1, java.util.List p2, String p3, ctd p4)
	    {
	        this.d = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public final void run()
	    {
	        try {
	            android.os.RemoteException v0_1 = cth.a(this.d);
	            java.util.Collections.unmodifiableSet(new java.util.HashSet(this.a));
	            android.os.RemoteException v0_2 = v0_1.c();
	            this.c.a(new com.google.android.gms.signin.internal.CheckServerAuthResult(v0_2.d(), v0_2.e()));
	        } catch (android.os.RemoteException v0_5) {
	            android.util.Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", v0_5);
	        }
	        return;
	    }
	
