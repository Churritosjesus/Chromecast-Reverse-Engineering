	private synthetic  a
	private synthetic  b
	private synthetic asp c
	private synthetic dbt d
	private synthetic ash e
	
	    asj(ash p2, int p3, long p4, asp p6, dbt p7)
	    {
	        this.e = p2;
	        this.a = p3;
	        this.b = p4;
	        this.c = p6;
	        this.d = p7;
	        return;
	    }
	
	
	    public final synthetic void a(Object p6)
	    {
	        if ((((dch) p6) != null) && ((((dch) p6).a != null) && (((dch) p6).a.length != 0))) {
	            ash.b(this.e).a(this.b);
	            if (this.a != 1) {
	                int v1_1 = this.d.a;
	                java.util.Iterator v2_1 = ash.b(this.e).a.iterator();
	                while (v2_1.hasNext()) {
	                    if (android.text.TextUtils.equals(((ast) v2_1.next()).b, v1_1)) {
	                        v2_1.remove();
	                        break;
	                    }
	                }
	            } else {
	                asp v0_15 = ash.b(this.e);
	                v0_15.a.add(new ast(ash.c(this.e), ash.d(this.e)));
	                v0_15.g = android.os.SystemClock.elapsedRealtime();
	            }
	            if (this.c != null) {
	                if (this.a != 2) {
	                    this.c.i();
	                } else {
	                    this.c.k();
	                }
	            }
	            this.e.b(1);
	            ash.e(this.e);
	        } else {
	            ash.a(this.e, this.a, this.b, this.c);
	        }
	        return;
	    }
	
