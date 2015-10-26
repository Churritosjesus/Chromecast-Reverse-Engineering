	private final dkd a
	private final java.util.zip.Inflater b
	private  c
	private  d
	
	    dkj(dkd p3, java.util.zip.Inflater p4)
	    {
	        if (p3 != null) {
	            if (p4 != null) {
	                this.a = p3;
	                this.b = p4;
	                return;
	            } else {
	                throw new IllegalArgumentException("inflater == null");
	            }
	        } else {
	            throw new IllegalArgumentException("source == null");
	        }
	    }
	
	
	    public dkj(dkv p2, java.util.zip.Inflater p3)
	    {
	        this(dkk.a(p2), p3);
	        return;
	    }
	
	
	    private void c()
	    {
	        if (this.c != 0) {
	            int v0_2 = (this.c - this.b.getRemaining());
	            this.c = (this.c - v0_2);
	            this.a.f(((long) v0_2));
	        }
	        return;
	    }
	
	
	    public final long a(djz p7, long p8)
	    {
	        java.io.EOFException v0_0 = 0;
	        if (p8 >= 0) {
	            if (!this.d) {
	                if (p8 != 0) {
	                    do {
	                        java.io.EOFException v0_1 = this.b();
	                        String v1_1 = p7.e(1);
	                        int v2_4 = this.b.inflate(v1_1.a, v1_1.c, (2048 - v1_1.c));
	                        if (v2_4 <= 0) {
	                            if ((!this.b.finished()) && (!this.b.needsDictionary())) {
	                            } else {
	                                this.c();
	                                if (v1_1.b == v1_1.c) {
	                                    p7.a = v1_1.a();
	                                    dkt.a(v1_1);
	                                }
	                                v0_0 = -1;
	                            }
	                        } else {
	                            v1_1.c = (v1_1.c + v2_4);
	                            p7.b = (p7.b + ((long) v2_4));
	                            v0_0 = ((long) v2_4);
	                        }
	                    } while(v0_1 == null);
	                    throw new java.io.EOFException("source exhausted prematurely");
	                }
	                return v0_0;
	            } else {
	                throw new IllegalStateException("closed");
	            }
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("byteCount < 0: ").append(p8).toString());
	        }
	    }
	
	
	    public final dkw a()
	    {
	        return this.a.a();
	    }
	
	
	    public final boolean b()
	    {
	        int v0_0 = 0;
	        if (this.b.needsInput()) {
	            this.c();
	            if (this.b.getRemaining() == 0) {
	                if (!this.a.e()) {
	                    int v1_8 = this.a.b().a;
	                    this.c = (v1_8.c - v1_8.b);
	                    this.b.setInput(v1_8.a, v1_8.b, this.c);
	                } else {
	                    v0_0 = 1;
	                }
	            } else {
	                throw new IllegalStateException("?");
	            }
	        }
	        return v0_0;
	    }
	
	
	    public final void close()
	    {
	        if (!this.d) {
	            this.b.end();
	            this.d = 1;
	            this.a.close();
	        }
	        return;
	    }
	
