	private synthetic android.net.Uri a
	private synthetic acx b
	private synthetic abs c
	private synthetic abg d
	
	    abh(abg p1, android.net.Uri p2, acx p3, abs p4)
	    {
	        this.d = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    private varargs byte[] a()
	    {
	        byte[] v3 = 0;
	        java.io.InputStream v1_1 = this.d.a.query(this.a, abi.a, 0, 0, 0);
	        if (v1_1 == null) {
	            java.io.InputStream v1_3 = this.d.a.openInputStream(this.a);
	            if (v1_3 != null) {
	                Throwable v0_5 = new byte[16384];
	                java.io.ByteArrayOutputStream v2_2 = new java.io.ByteArrayOutputStream();
	                try {
	                    while(true) {
	                        int v4_1 = v1_3.read(v0_5);
	                        v2_2.write(v0_5, 0, v4_1);
	                    }
	                    v1_3.close();
	                    v3 = v2_2.toByteArray();
	                } catch (Throwable v0_6) {
	                    v1_3.close();
	                    throw v0_6;
	                }
	                if (v4_1 == -1) {
	                }
	            }
	        } else {
	            try {
	                if (!v1_1.moveToFirst()) {
	                    v1_1.close();
	                } else {
	                    v3 = v1_1.getBlob(0);
	                    v1_1.close();
	                }
	            } catch (Throwable v0_8) {
	                v1_1.close();
	                throw v0_8;
	            }
	        }
	        return v3;
	    }
	
	
	    protected final synthetic Object doInBackground(Object[] p2)
	    {
	        return this.a();
	    }
	
	
	    protected final synthetic void onPostExecute(Object p3)
	    {
	        this.b.a(((byte[]) p3));
	        if (((byte[]) p3) == null) {
	            if (this.c != null) {
	                this.c.d();
	            }
	        } else {
	            this.d.b.a(this.a, ((byte[]) p3));
	            if (this.c != null) {
	                this.c.c();
	            }
	        }
	        return;
	    }
	
