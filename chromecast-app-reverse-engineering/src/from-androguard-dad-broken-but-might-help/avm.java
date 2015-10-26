	 auv a
	final android.os.Handler b
	final java.util.UUID c
	private final blp d
	private final java.util.UUID e
	private java.lang.StringBuilder f
	private  g
	
	    public avm(java.util.UUID p3, java.util.UUID p4, android.os.Handler p5)
	    {
	        this.d = new blp("BlobReader");
	        this.e = p3;
	        this.c = p4;
	        this.b = p5;
	        return;
	    }
	
	
	    public final void a(auv p2)
	    {
	        this.g = 0;
	        this.f = new StringBuilder();
	        this.a = p2;
	        this.a(0);
	        return;
	    }
	
	
	    void a(byte[] p9)
	    {
	        android.os.Message v0_0 = 0;
	        if (p9 != null) {
	            android.os.Message v0_1 = new Object[1];
	            v0_1[0] = Integer.valueOf(p9.length);
	            v0_0 = new String(p9, blj.a);
	            this.f.append(v0_0);
	            StringBuilder v1_4 = new Object[2];
	            v1_4[0] = Integer.valueOf(v0_0.length());
	            v1_4[1] = v0_0;
	        }
	        if ((p9 == null) || ((v0_0 != null) && (p9.length == 512))) {
	            android.os.Message v0_4 = new byte[1];
	            v0_4[0] = this.g;
	            StringBuilder v1_7 = new awi(this.e, new avn(this), v0_4);
	            if (this.g != 127) {
	                this.g = ((byte) (this.g + 1));
	                this.a.a(v1_7);
	            } else {
	                this.b.obtainMessage(1).sendToTarget();
	            }
	        }
	        if ((p9 == null) || (p9.length >= 512)) {
	            if ((p9 != null) && (p9.length > 512)) {
	                this.b.obtainMessage(1).sendToTarget();
	            }
	        } else {
	            this.b.obtainMessage(0, this.f.toString()).sendToTarget();
	        }
	        android.os.Message v0_18 = new Object[2];
	        v0_18[0] = Byte.valueOf(this.g);
	        v0_18[1] = this.f;
	        return;
	    }
	
