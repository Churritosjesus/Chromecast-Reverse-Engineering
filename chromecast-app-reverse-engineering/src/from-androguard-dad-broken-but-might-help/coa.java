	final coh a
	  b
	 java.util.Map c
	 java.util.Map d
	private final android.content.Context e
	
	    public coa(android.content.Context p2, coh p3)
	    {
	        this.b = 0;
	        this.c = new java.util.HashMap();
	        this.d = new java.util.HashMap();
	        this.e = p2;
	        this.a = p3;
	        return;
	    }
	
	
	    public final android.location.Location a()
	    {
	        this.a.a();
	        try {
	            return ((cnu) this.a.b()).b(this.e.getPackageName());
	        } catch (android.os.RemoteException v0_5) {
	            throw new IllegalStateException(v0_5);
	        }
	    }
	
