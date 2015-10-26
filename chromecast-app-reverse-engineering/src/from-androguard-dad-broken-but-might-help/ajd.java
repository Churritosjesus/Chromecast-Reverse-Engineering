	public final android.content.Context a
	public ajf b
	public  c
	  d
	public final  e
	private final android.os.Handler f
	private android.os.Messenger g
	private  h
	private final java.lang.String i
	
	    public ajd(android.content.Context p2, int p3, int p4, int p5, String p6)
	    {
	        aje v0_0 = p2.getApplicationContext();
	        if (v0_0 != null) {
	            p2 = v0_0;
	        }
	        this.a = p2;
	        this.h = 65536;
	        this.d = 65537;
	        this.i = p6;
	        this.e = 20121101;
	        this.f = new aje(this);
	        return;
	    }
	
	
	    void a(android.os.Bundle p2)
	    {
	        if (this.c) {
	            this.c = 0;
	            ajf v0_2 = this.b;
	            if (v0_2 != null) {
	                v0_2.a(p2);
	            }
	        }
	        return;
	    }
	
	
	    public void onServiceConnected(android.content.ComponentName p5, android.os.IBinder p6)
	    {
	        this.g = new android.os.Messenger(p6);
	        android.os.RemoteException v0_3 = new android.os.Bundle();
	        v0_3.putString("com.facebook.platform.extra.APPLICATION_ID", this.i);
	        android.os.Message v1_2 = android.os.Message.obtain(0, this.h);
	        v1_2.arg1 = this.e;
	        v1_2.setData(v0_3);
	        v1_2.replyTo = new android.os.Messenger(this.f);
	        try {
	            this.g.send(v1_2);
	        } catch (android.os.RemoteException v0) {
	            this.a(0);
	        }
	        return;
	    }
	
	
	    public void onServiceDisconnected(android.content.ComponentName p3)
	    {
	        this.g = 0;
	        try {
	            this.a.unbindService(this);
	        } catch (IllegalArgumentException v0) {
	        }
	        this.a(0);
	        return;
	    }
	
