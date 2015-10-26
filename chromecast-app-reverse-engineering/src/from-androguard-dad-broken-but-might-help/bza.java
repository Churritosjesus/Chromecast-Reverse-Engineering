	private final java.util.HashMap a
	private final android.content.Context b
	private final android.os.Handler c
	private final bzw d
	private final  e
	
	    bza(android.content.Context p3)
	    {
	        this.a = new java.util.HashMap();
	        this.b = p3.getApplicationContext();
	        this.c = new android.os.Handler(p3.getMainLooper(), this);
	        this.d = bzw.a();
	        this.e = 5000;
	        return;
	    }
	
	
	    static synthetic java.util.HashMap a(bza p1)
	    {
	        return p1.a;
	    }
	
	
	    private boolean a(bzb p5, android.content.ServiceConnection p6, String p7)
	    {
	        a.f(p6, "ServiceConnection must not be null");
	        try {
	            IllegalStateException v0_3 = ((bzc) this.a.get(p5));
	        } catch (IllegalStateException v0_8) {
	            throw v0_8;
	        }
	        if (v0_3 != null) {
	            this.c.removeMessages(0, v0_3);
	            if (!v0_3.a(p6)) {
	                v0_3.a(p6, p7);
	                switch (v0_3.c) {
	                    case 1:
	                        p6.onServiceConnected(v0_3.g, v0_3.e);
	                        break;
	                    case 2:
	                        v0_3.a(p7);
	                        break;
	                    default:
	                }
	            } else {
	                throw new IllegalStateException(new StringBuilder("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(p5).toString());
	            }
	        } else {
	            v0_3 = new bzc(this, p5);
	            v0_3.a(p6, p7);
	            v0_3.a(p7);
	            this.a.put(p5, v0_3);
	        }
	        return v0_3.d;
	    }
	
	
	    static synthetic android.content.Context b(bza p1)
	    {
	        return p1.b;
	    }
	
	
	    private void b(bzb p11, android.content.ServiceConnection p12, String p13)
	    {
	        a.f(p12, "ServiceConnection must not be null");
	        try {
	            bzc v8 = ((bzc) this.a.get(p11));
	        } catch (android.os.Message v2_14) {
	            throw v2_14;
	        }
	        if (v8 != null) {
	            if (v8.a(p12)) {
	                v8.h.d.a(v8.h.b, p12, 0, 0, "DISCONNECT");
	                v8.b.remove(p12);
	                if (v8.a()) {
	                    this.c.sendMessageDelayed(this.c.obtainMessage(0, v8), this.e);
	                }
	                return;
	            } else {
	                throw new IllegalStateException(new StringBuilder("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(p11).toString());
	            }
	        } else {
	            throw new IllegalStateException(new StringBuilder("Nonexistent connection status for service config: ").append(p11).toString());
	        }
	    }
	
	
	    static synthetic bzw c(bza p1)
	    {
	        return p1.d;
	    }
	
	
	    public final boolean a(android.content.ComponentName p2, android.content.ServiceConnection p3, String p4)
	    {
	        return this.a(new bzb(p2), p3, p4);
	    }
	
	
	    public final boolean a(String p2, android.content.ServiceConnection p3, String p4)
	    {
	        return this.a(new bzb(p2), p3, p4);
	    }
	
	
	    public final void b(android.content.ComponentName p2, android.content.ServiceConnection p3, String p4)
	    {
	        this.b(new bzb(p2), p3, p4);
	        return;
	    }
	
	
	    public final void b(String p2, android.content.ServiceConnection p3, String p4)
	    {
	        this.b(new bzb(p2), p3, p4);
	        return;
	    }
	
	
	    public final boolean handleMessage(android.os.Message p6)
	    {
	        bzb v0_0 = 0;
	        switch (p6.what) {
	            case 0:
	                bzb v0_2 = ((bzc) p6.obj);
	                try {
	                    if (v0_2.a()) {
	                        if (v0_2.d) {
	                            v0_2.h.d.a(v0_2.h.b, v0_2.a);
	                            v0_2.d = 0;
	                            v0_2.c = 2;
	                        }
	                        this.a.remove(v0_2.f);
	                    }
	                } catch (bzb v0_4) {
	                    throw v0_4;
	                }
	                v0_0 = 1;
	                break;
	        }
	        return v0_0;
	    }
	
