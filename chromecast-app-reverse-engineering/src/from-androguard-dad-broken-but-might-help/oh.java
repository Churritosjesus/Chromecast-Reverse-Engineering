	private tx Z
	
	    public oh()
	    {
	        this.b(1);
	        return;
	    }
	
	
	    private void p()
	    {
	        if (this.Z == null) {
	            tx v0_1 = this.m;
	            if (v0_1 != null) {
	                this.Z = tx.a(v0_1.getBundle("selector"));
	            }
	            if (this.Z == null) {
	                this.Z = tx.c;
	            }
	        }
	        return;
	    }
	
	
	    public final void a(tx p4)
	    {
	        if (p4 != null) {
	            this.p();
	            if (!this.Z.equals(p4)) {
	                this.Z = p4;
	                od v0_2 = this.m;
	                if (v0_2 == null) {
	                    v0_2 = new android.os.Bundle();
	                }
	                v0_2.putBundle("selector", p4.a);
	                this.f(v0_2);
	                od v0_5 = ((od) this.d);
	                if (v0_5 != null) {
	                    v0_5.a(p4);
	                }
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException("selector must not be null");
	        }
	    }
	
	
	    public final android.app.Dialog c(android.os.Bundle p3)
	    {
	        od v1_1 = new od(this.y);
	        this.p();
	        v1_1.a(this.Z);
	        return v1_1;
	    }
	
