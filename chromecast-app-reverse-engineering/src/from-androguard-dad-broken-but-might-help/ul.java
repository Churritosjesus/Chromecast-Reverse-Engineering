	 java.lang.reflect.Method a
	
	    public ul()
	    {
	        if ((android.os.Build$VERSION.SDK_INT >= 16) && (android.os.Build$VERSION.SDK_INT <= 17)) {
	            try {
	                Class[] v2_1 = new Class[2];
	                v2_1[0] = Integer.TYPE;
	                v2_1[1] = android.media.MediaRouter$RouteInfo;
	                this.a = android.media.MediaRouter.getMethod("selectRouteInt", v2_1);
	            } catch (NoSuchMethodException v0) {
	            }
	            return;
	        } else {
	            throw new UnsupportedOperationException();
	        }
	    }
	
