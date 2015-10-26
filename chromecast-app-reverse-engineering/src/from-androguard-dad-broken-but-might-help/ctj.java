	private synthetic java.lang.String a
	private synthetic java.lang.String b
	private synthetic ctd c
	private synthetic cth d
	
	    ctj(cth p1, String p2, String p3, ctd p4)
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
	            this.c.a(cth.a(this.d).d());
	        } catch (android.os.RemoteException v0_3) {
	            android.util.Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", v0_3);
	        }
	        return;
	    }
	
