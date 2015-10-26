	  a
	 java.io.ByteArrayOutputStream b
	private synthetic bqn c
	
	    public bqo(bqn p2)
	    {
	        this.c = p2;
	        this.b = new java.io.ByteArrayOutputStream();
	        return;
	    }
	
	
	    public final boolean a(bsi p6)
	    {
	        int v0_13;
	        a.c(p6);
	        if ((this.a + 1) <= brz.g()) {
	            int v0_3 = this.c.a(p6, 0);
	            if (v0_3 != 0) {
	                String v3_1 = v0_3.getBytes();
	                int v0_4 = v3_1.length;
	                if (v0_4 <= brz.c()) {
	                    if (this.b.size() > 0) {
	                        v0_4++;
	                    }
	                    if ((this.b.size() + v0_4) <= ((Integer) bqd.t.a()).intValue()) {
	                        try {
	                            if (this.b.size() > 0) {
	                                this.b.write(bqn.c());
	                            }
	                        } catch (int v0_12) {
	                            this.c.e("Failed to write payload when batching hits", v0_12);
	                            v0_13 = 1;
	                        }
	                        this.b.write(v3_1);
	                        this.a = (this.a + 1);
	                        v0_13 = 1;
	                    } else {
	                        v0_13 = 0;
	                    }
	                } else {
	                    this.c.d.a().a(p6, "Hit size exceeds the maximum size limit");
	                    v0_13 = 1;
	                }
	            } else {
	                this.c.d.a().a(p6, "Error formatting hit");
	                v0_13 = 1;
	            }
	        } else {
	            v0_13 = 0;
	        }
	        return v0_13;
	    }
	
