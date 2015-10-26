	private synthetic mx a
	
	    my(mx p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p4)
	    {
	        if ((p4 != this.a.n) || (this.a.p == null)) {
	            if ((p4 != this.a.q) || (this.a.s == null)) {
	                if ((p4 != this.a.t) || (this.a.v == null)) {
	                    android.os.Message v0_12 = 0;
	                } else {
	                    v0_12 = android.os.Message.obtain(this.a.v);
	                }
	            } else {
	                v0_12 = android.os.Message.obtain(this.a.s);
	            }
	        } else {
	            v0_12 = android.os.Message.obtain(this.a.p);
	        }
	        if (v0_12 != null) {
	            v0_12.sendToTarget();
	        }
	        this.a.K.obtainMessage(1, this.a.b).sendToTarget();
	        return;
	    }
	
