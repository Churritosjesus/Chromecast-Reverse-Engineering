	final android.content.ComponentName a
	
	    tt(android.content.ComponentName p3)
	    {
	        if (p3 != null) {
	            this.a = p3;
	            return;
	        } else {
	            throw new IllegalArgumentException("componentName must not be null");
	        }
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("ProviderMetadata{ componentName=").append(this.a.flattenToShortString()).append(" }").toString();
	    }
	
