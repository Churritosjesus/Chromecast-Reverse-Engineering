	  a
	final dkd b
	private final dkj c
	
	    public dis(dkd p4)
	    {
	        this.c = new dkj(new dit(this, p4), new diu(this));
	        this.b = dkk.a(this.c);
	        return;
	    }
	
	
	    private dke a()
	    {
	        return this.b.c(((long) this.b.i()));
	    }
	
	
	    public final java.util.List a(int p7)
	    {
	        this.a = (this.a + p7);
	        String v1_0 = this.b.i();
	        if (v1_0 >= null) {
	            if (v1_0 <= 1024) {
	                int v2_1 = new java.util.ArrayList(v1_0);
	                java.io.IOException v0_4 = 0;
	                while (v0_4 < v1_0) {
	                    dke v3_1 = this.a().c();
	                    dke v4 = this.a();
	                    if (v3_1.b.length != 0) {
	                        v2_1.add(new die(v3_1, v4));
	                        v0_4++;
	                    } else {
	                        throw new java.io.IOException("name.size == 0");
	                    }
	                }
	                if (this.a > 0) {
	                    this.c.b();
	                    if (this.a != 0) {
	                        throw new java.io.IOException(new StringBuilder("compressedLimit > 0: ").append(this.a).toString());
	                    }
	                }
	                return v2_1;
	            } else {
	                throw new java.io.IOException(new StringBuilder("numberOfPairs > 1024: ").append(v1_0).toString());
	            }
	        } else {
	            throw new java.io.IOException(new StringBuilder("numberOfPairs < 0: ").append(v1_0).toString());
	        }
	    }
	
