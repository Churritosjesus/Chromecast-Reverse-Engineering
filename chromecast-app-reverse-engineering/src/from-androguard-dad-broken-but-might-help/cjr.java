	 bve a
	final cjz b
	
	    public cjr(android.content.Context p7, android.os.Looper p8, bwg p9, bwh p10)
	    {
	        this(p7, p8, 27, p9, p10);
	        this.b = new cjs(this);
	        return;
	    }
	
	
	    static synthetic bve a(cjr p1)
	    {
	        return p1.a;
	    }
	
	
	    public final synthetic android.os.IInterface a(android.os.IBinder p2)
	    {
	        return cjx.a(p2);
	    }
	
	
	    public final void a()
	    {
	        try {
	            ((cjw) this.o()).b();
	            super.a();
	        } catch (android.os.RemoteException v0) {
	            super.a();
	        } catch (android.os.RemoteException v0_2) {
	            super.a();
	            throw v0_2;
	        }
	        return;
	    }
	
	
	    public final void binderDied()
	    {
	        return;
	    }
	
	
	    protected final String c()
	    {
	        return "com.google.android.gms.cast_mirroring.service.START";
	    }
	
	
	    protected final String d()
	    {
	        return "com.google.android.gms.cast_mirroring.internal.ICastMirroringService";
	    }
	
