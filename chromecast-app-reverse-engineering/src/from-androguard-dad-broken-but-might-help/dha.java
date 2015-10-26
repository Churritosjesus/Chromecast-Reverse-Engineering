	private  b
	private  c
	private final dhg d
	private synthetic dgx e
	
	    dha(dgx p3, dhg p4)
	    {
	        this.e = p3;
	        this(p3, 0);
	        this.b = -1;
	        this.c = 1;
	        this.d = p4;
	        return;
	    }
	
	
	    public final long a(djz p9, long p10)
	    {
	        java.net.ProtocolException v0_0 = -1;
	        if (p10 >= 0) {
	            if (!this.a) {
	                if (this.c) {
	                    if ((this.b == 0) || (this.b == -1)) {
	                        if (this.b != -1) {
	                            this.e.c.o();
	                        }
	                        try {
	                            this.b = this.e.c.l();
	                            boolean v2_17 = this.e.c.o().trim();
	                        } catch (java.net.ProtocolException v0_8) {
	                            throw new java.net.ProtocolException(v0_8.getMessage());
	                        }
	                        if ((this.b >= 0) && ((v2_17.isEmpty()) || (v2_17.startsWith(";")))) {
	                            if (this.b == 0) {
	                                this.c = 0;
	                                boolean v2_22 = new dfp();
	                                this.e.a(v2_22);
	                                this.d.a(v2_22.a());
	                                this.a(1);
	                            }
	                            if (!this.c) {
	                                return v0_0;
	                            }
	                        } else {
	                            throw new java.net.ProtocolException(new StringBuilder("expected chunk size and optional extensions but was \"").append(this.b).append(v2_17).append("\"").toString());
	                        }
	                    }
	                    boolean v2_28 = this.e.c.a(p9, Math.min(p10, this.b));
	                    if (v2_28 != -1) {
	                        this.b = (this.b - v2_28);
	                        v0_0 = v2_28;
	                    } else {
	                        this.b();
	                        throw new java.io.IOException("unexpected end of stream");
	                    }
	                }
	                return v0_0;
	            } else {
	                throw new IllegalStateException("closed");
	            }
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("byteCount < 0: ").append(p10).toString());
	        }
	    }
	
	
	    public final void close()
	    {
	        if (!this.a) {
	            if ((this.c) && (!dgs.a(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS))) {
	                this.b();
	            }
	            this.a = 1;
	        }
	        return;
	    }
	
