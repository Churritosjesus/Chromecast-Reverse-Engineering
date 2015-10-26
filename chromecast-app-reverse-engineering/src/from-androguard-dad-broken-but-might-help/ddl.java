	public static final ddl a
	
	    static ddl()
	    {
	        byte[] v1_1 = new byte[0];
	        ddl.a = new ddy(v1_1);
	        return;
	    }
	
	
	    ddl()
	    {
	        return;
	    }
	
	
	    public static ddl a(byte[] p2, int p3, int p4)
	    {
	        byte[] v0 = new byte[p4];
	        System.arraycopy(p2, p3, v0, 0, p4);
	        return new ddy(v0);
	    }
	
	
	    public final void a(byte[] p5, int p6, int p7, int p8)
	    {
	        if (p6 >= 0) {
	            if (p7 >= 0) {
	                if (p8 >= 0) {
	                    if ((p6 + p8) <= this.b()) {
	                        if ((p7 + p8) <= p5.length) {
	                            if (p8 > 0) {
	                                this.b(p5, p6, p7, p8);
	                            }
	                            return;
	                        } else {
	                            throw new IndexOutOfBoundsException(new StringBuilder(34).append("Target end offset < 0: ").append((p7 + p8)).toString());
	                        }
	                    } else {
	                        throw new IndexOutOfBoundsException(new StringBuilder(34).append("Source end offset < 0: ").append((p6 + p8)).toString());
	                    }
	                } else {
	                    throw new IndexOutOfBoundsException(new StringBuilder(23).append("Length < 0: ").append(p8).toString());
	                }
	            } else {
	                throw new IndexOutOfBoundsException(new StringBuilder(30).append("Target offset < 0: ").append(p7).toString());
	            }
	        } else {
	            throw new IndexOutOfBoundsException(new StringBuilder(30).append("Source offset < 0: ").append(p6).toString());
	        }
	    }
	
	
	    public final byte[] c()
	    {
	        byte[] v0;
	        int v1 = this.b();
	        if (v1 != 0) {
	            v0 = new byte[v1];
	            this.b(v0, 0, 0, v1);
	        } else {
	            v0 = ddv.b;
	        }
	        return v0;
	    }
	
	
	    public synthetic java.util.Iterator iterator()
	    {
	        return this.a();
	    }
	
	
	    public String toString()
	    {
	        Object[] v1_1 = new Object[2];
	        v1_1[0] = Integer.toHexString(System.identityHashCode(this));
	        v1_1[1] = Integer.valueOf(this.b());
	        return String.format("<ByteString@%s size=%d>", v1_1);
	    }
	
