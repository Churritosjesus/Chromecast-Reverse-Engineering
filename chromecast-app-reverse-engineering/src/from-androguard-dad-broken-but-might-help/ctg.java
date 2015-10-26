	private final byl a
	private final clt b
	private java.lang.Integer c
	private final java.util.concurrent.ExecutorService d
	
	    public ctg(android.content.Context p8, android.os.Looper p9, byl p10, clt p11, bwg p12, bwh p13, java.util.concurrent.ExecutorService p14)
	    {
	        this(p8, p9, 44, p12, p13, p10);
	        this.a = p10;
	        this.b = p11;
	        this.c = p10.h;
	        this.d = p14;
	        return;
	    }
	
	
	    protected final synthetic android.os.IInterface a(android.os.IBinder p2)
	    {
	        return cte.a(p2);
	    }
	
	
	    public final void a(bzf p4, java.util.Set p5, cta p6)
	    {
	        a.f(p6, "Expecting a valid ISignInCallbacks");
	        try {
	            ((ctd) this.o()).a(new com.google.android.gms.common.internal.AuthAccountRequest(p4, p5), p6);
	        } catch (String v0) {
	            android.util.Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
	            try {
	                p6.a(new com.google.android.gms.common.ConnectionResult(8, 0), new com.google.android.gms.signin.internal.AuthAccountResult());
	            } catch (String v0) {
	                android.util.Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
	            }
	        }
	        return;
	    }
	
	
	    public final void a(bzf p3, boolean p4)
	    {
	        try {
	            ((ctd) this.o()).a(p3, this.c.intValue(), p4);
	        } catch (String v0) {
	            android.util.Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
	        }
	        return;
	    }
	
	
	    public final void a(bzo p5)
	    {
	        a.f(p5, "Expecting a valid IResolveAccountCallbacks");
	        try {
	            String v1_2;
	            String v0_1 = this.a;
	        } catch (String v0) {
	            android.util.Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
	            try {
	                p5.a(new com.google.android.gms.common.internal.ResolveAccountResponse(8));
	            } catch (String v0) {
	                android.util.Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
	            }
	            return;
	        }
	        if (v0_1.a == null) {
	            v1_2 = new android.accounts.Account("<<default account>>", "com.google");
	        } else {
	            v1_2 = v0_1.a;
	        }
	        ((ctd) this.o()).a(new com.google.android.gms.common.internal.ResolveAccountRequest(v1_2, this.c.intValue()), p5);
	        return;
	    }
	
	
	    protected final String c()
	    {
	        return "com.google.android.gms.signin.service.START";
	    }
	
	
	    protected final String d()
	    {
	        return "com.google.android.gms.signin.internal.ISignInService";
	    }
	
	
	    protected final android.os.Bundle e()
	    {
	        String v0_0 = this.b;
	        String v1_1 = this.a.h;
	        String v2_0 = this.d;
	        android.os.Bundle v3_1 = new android.os.Bundle();
	        v3_1.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", v0_0.b);
	        v3_1.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", v0_0.c);
	        v3_1.putString("com.google.android.gms.signin.internal.serverClientId", v0_0.d);
	        if (v0_0.e != null) {
	            v3_1.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new com.google.android.gms.common.internal.BinderWrapper(new cth(v0_0, v2_0).asBinder()));
	        }
	        if (v1_1 != null) {
	            v3_1.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", v1_1.intValue());
	        }
	        if (!this.g.getPackageName().equals(this.a.e)) {
	            v3_1.putString("com.google.android.gms.signin.internal.realClientPackageName", this.a.e);
	        }
	        return v3_1;
	    }
	
	
	    public final void i_()
	    {
	        try {
	            ((ctd) this.o()).a(this.c.intValue());
	        } catch (String v0) {
	            android.util.Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
	        }
	        return;
	    }
	
