	private cqq a
	private android.os.ParcelFileDescriptor b
	private  c
	private  d
	private  e
	private synthetic cqp f
	
	    cqr(cqp p1, cqq p2, android.os.ParcelFileDescriptor p3, int p4, int p5, int p6)
	    {
	        this.f = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        this.d = p5;
	        this.e = p6;
	        return;
	    }
	
	
	    private varargs android.graphics.Bitmap a()
	    {
	        try {
	            java.io.IOException v1_4;
	            if (!cqp.a(this.f)) {
	                java.io.IOException v1_3 = cqp.a(this.b, this.c, this.d, this.e, ((int) ((((float) this.c) * cqp.b(this.f)) / cqp.c(this.f))));
	                if (v1_3 != null) {
	                    v1_4 = cqp.a(v1_3, this.c, (cqp.b(this.f) / cqp.c(this.f)));
	                } else {
	                    v1_4 = 0;
	                }
	            } else {
	                java.io.IOException v1_6 = a.a(this.b);
	                if (v1_6 != null) {
	                    v1_4 = a.a(v1_6);
	                } else {
	                    v1_4 = 0;
	                }
	            }
	        } catch (java.io.IOException v0_6) {
	            if (this.b != null) {
	                try {
	                    this.b.close();
	                } catch (java.io.IOException v1_9) {
	                    v1_9.getMessage();
	                }
	            }
	            throw v0_6;
	        }
	        if (v1_4 != null) {
	            cqp.d(this.f).put(this.a.f, v1_4);
	        }
	        if (this.b != null) {
	            try {
	                this.b.close();
	            } catch (java.io.IOException v0_9) {
	                v0_9.getMessage();
	            }
	        }
	        return v1_4;
	    }
	
	
	    protected final synthetic Object doInBackground(Object[] p2)
	    {
	        return this.a();
	    }
	
	
	    protected final synthetic void onPostExecute(Object p3)
	    {
	        if (this.a.e.getTag() == this.a) {
	            this.f.a(this.a, ((android.graphics.Bitmap) p3));
	        }
	        return;
	    }
	
