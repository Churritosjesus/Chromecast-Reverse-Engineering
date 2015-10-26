	private  a
	
	    public static android.accounts.Account a(bzf p5)
	    {
	        Throwable v0_0 = 0;
	        if (p5 != null) {
	            long v2 = android.os.Binder.clearCallingIdentity();
	            try {
	                v0_0 = p5.a();
	                android.os.Binder.restoreCallingIdentity(v2);
	            } catch (String v1) {
	                android.util.Log.w("AccountAccessor", "Remote account accessor probably died");
	                android.os.Binder.restoreCallingIdentity(v2);
	            } catch (Throwable v0_1) {
	                android.os.Binder.restoreCallingIdentity(v2);
	                throw v0_1;
	            }
	        }
	        return v0_0;
	    }
	
	
	    public final android.accounts.Account a()
	    {
	        SecurityException v0_0 = android.os.Binder.getCallingUid();
	        if (v0_0 != this.a) {
	            if (!bvt.a(0, v0_0)) {
	                throw new SecurityException("Caller is not GooglePlayServices");
	            } else {
	                this.a = v0_0;
	            }
	        }
	        return 0;
	    }
	
	
	    public final boolean equals(Object p3)
	    {
	        boolean v0_1;
	        if (this != p3) {
	            if ((p3 instanceof byh)) {
	                v0_1 = 0.equals(0);
	            } else {
	                v0_1 = 0;
	            }
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
