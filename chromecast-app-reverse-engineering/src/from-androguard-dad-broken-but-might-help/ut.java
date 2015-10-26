	final android.os.Messenger a
	final uy b
	  c
	  d
	  e
	  f
	final android.util.SparseArray g
	final synthetic us h
	private final android.os.Messenger i
	
	    public ut(us p3, android.os.Messenger p4)
	    {
	        this.h = p3;
	        this.c = 1;
	        this.d = 1;
	        this.g = new android.util.SparseArray();
	        this.a = p4;
	        this.b = new uy(this);
	        this.i = new android.os.Messenger(this.b);
	        return;
	    }
	
	
	    static synthetic void a(ut p2)
	    {
	        android.util.SparseArray v0_0 = 0;
	        while (v0_0 < p2.g.size()) {
	            p2.g.valueAt(v0_0);
	            v0_0++;
	        }
	        p2.g.clear();
	        return;
	    }
	
	
	    public final void a(int p7)
	    {
	        int v2 = this.c;
	        this.c = (v2 + 1);
	        this.a(5, v2, p7, 0, 0);
	        return;
	    }
	
	
	    public final void a(int p7, int p8)
	    {
	        android.os.Bundle v5_1 = new android.os.Bundle();
	        v5_1.putInt("volume", p8);
	        int v2 = this.c;
	        this.c = (v2 + 1);
	        this.a(7, v2, p7, 0, v5_1);
	        return;
	    }
	
	
	    public final void a(tp p7)
	    {
	        int v4;
	        int v2 = this.c;
	        this.c = (v2 + 1);
	        if (p7 == null) {
	            v4 = 0;
	        } else {
	            v4 = p7.a;
	        }
	        this.a(10, v2, 0, v4, 0);
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        int v1 = 1;
	        android.os.RemoteException v0_0 = this.c;
	        this.c = (v0_0 + 1);
	        this.f = v0_0;
	        if (this.a(1, this.f, 1, 0, 0)) {
	            try {
	                this.a.getBinder().linkToDeath(this, 0);
	            } catch (android.os.RemoteException v0) {
	                this.binderDied();
	                v1 = 0;
	            }
	        } else {
	            v1 = 0;
	        }
	        return v1;
	    }
	
	
	    boolean a(int p4, int p5, int p6, Object p7, android.os.Bundle p8)
	    {
	        int v0_0 = android.os.Message.obtain();
	        v0_0.what = p4;
	        v0_0.arg1 = p5;
	        v0_0.arg2 = p6;
	        v0_0.obj = p7;
	        v0_0.setData(p8);
	        v0_0.replyTo = this.i;
	        try {
	            this.a.send(v0_0);
	            int v0_1 = 1;
	        } catch (int v0) {
	            v0_1 = 0;
	        } catch (int v0_2) {
	            if (p4 == 2) {
	            } else {
	                android.util.Log.e("MediaRouteProviderProxy", "Could not send message to service.", v0_2);
	            }
	        }
	        return v0_1;
	    }
	
	
	    public final void b(int p7, int p8)
	    {
	        android.os.Bundle v5_1 = new android.os.Bundle();
	        v5_1.putInt("volume", p8);
	        int v2 = this.c;
	        this.c = (v2 + 1);
	        this.a(8, v2, p7, 0, v5_1);
	        return;
	    }
	
	
	    public final void binderDied()
	    {
	        us.a(this.h).post(new uv(this));
	        return;
	    }
	
