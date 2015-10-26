	final android.content.Context a
	final java.lang.String b
	final java.util.concurrent.ExecutorService c
	 cwb d
	
	    ctv(android.content.Context p2, String p3)
	    {
	        this.a = p2;
	        this.b = p3;
	        this.c = java.util.concurrent.Executors.newSingleThreadExecutor();
	        return;
	    }
	
	
	    static clz a(java.io.ByteArrayOutputStream p7)
	    {
	        clz v0 = 0;
	        try {
	            cje v2_2 = cyh.a(a.d(new org.json.JSONObject(p7.toString("UTF-8"))));
	            cma v3 = clz.a();
	            int v1_3 = 0;
	        } catch (int v1) {
	            cuh.d("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
	            return v0;
	        } catch (int v1) {
	            cuh.b("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn\'t contain a JSON container");
	            return v0;
	        }
	        while (v1_3 < v2_2.d.length) {
	            v3.a(clx.a().a(cit.u.toString(), v2_2.d[v1_3]).a(cit.p.toString(), cyh.a(cyx.d())).a(cyx.e(), v2_2.e[v1_3]).a());
	            v1_3++;
	        }
	        v0 = v3.a();
	        return v0;
	    }
	
	
	    static clz a(byte[] p3)
	    {
	        try {
	            int v0_4 = a.a(((ciz) cms.a(new ciz(), p3)));
	        } catch (int v0) {
	            cuh.a("The resource file is corrupted. The container cannot be extracted from the binary file");
	            v0_4 = 0;
	            return v0_4;
	        } catch (int v0) {
	            cuh.b("The resource file is invalid. The container from the binary file is invalid");
	            v0_4 = 0;
	            return v0_4;
	        }
	        if (v0_4 == 0) {
	            return v0_4;
	        } else {
	            cuh.e("The container was successfully loaded from the resource (using binary file)");
	            return v0_4;
	        }
	    }
	
	
	    public clz a(int p5)
	    {
	        try {
	            clz v0_2 = this.a.getResources().openRawResource(p5);
	            cuh.e(new StringBuilder("Attempting to load a container from the resource ID ").append(p5).append(" (").append(this.a.getResources().getResourceName(p5)).append(")").toString());
	        } catch (clz v0) {
	            cuh.b(new StringBuilder("Failed to load the container. No default container resource found with the resource ID ").append(p5).toString());
	            clz v0_7 = 0;
	            return v0_7;
	        }
	        try {
	            String v2_9 = new java.io.ByteArrayOutputStream();
	            a.a(v0_2, v2_9);
	            v0_7 = ctv.a(v2_9);
	        } catch (clz v0) {
	            cuh.b(new StringBuilder("Error reading the default container with resource ID ").append(p5).append(" (").append(this.a.getResources().getResourceName(p5)).append(")").toString());
	            v0_7 = 0;
	            return v0_7;
	        }
	        if (v0_7 == null) {
	            v0_7 = ctv.a(v2_9.toByteArray());
	            return v0_7;
	        } else {
	            cuh.e("The container was successfully loaded from the resource (using JSON file format)");
	            return v0_7;
	        }
	    }
	
	
	    public declared_synchronized void a()
	    {
	        try {
	            this.c.shutdown();
	            return;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    public void a(clv p3)
	    {
	        this.c.execute(new cxg(this, p3));
	        return;
	    }
	
	
	    public void a(cwb p1)
	    {
	        this.d = p1;
	        return;
	    }
	
	
	    public void b()
	    {
	        this.c.execute(new cxf(this));
	        return;
	    }
	
	
	    boolean b(clv p5)
	    {
	        int v0_0 = 0;
	        String v1_0 = this.d();
	        try {
	            java.io.FileOutputStream v2_1 = new java.io.FileOutputStream(v1_0);
	        } catch (String v1) {
	            cuh.a("Error opening resource file for writing");
	            return v0_0;
	        }
	        try {
	            v2_1.write(cms.a(p5));
	            try {
	                v2_1.close();
	            } catch (int v0) {
	                cuh.b("error closing stream for writing resource to disk");
	            }
	            v0_0 = 1;
	            return v0_0;
	        } catch (int v0_1) {
	            try {
	                v2_1.close();
	            } catch (String v1) {
	                cuh.b("error closing stream for writing resource to disk");
	            }
	            throw v0_1;
	        } catch (String v3) {
	            cuh.b("Error writing resource to disk. Removing resource from disk.");
	            v1_0.delete();
	            try {
	                v2_1.close();
	            } catch (String v1) {
	                cuh.b("error closing stream for writing resource to disk");
	            }
	            return v0_0;
	        }
	    }
	
	
	    void c()
	    {
	        if (this.d != null) {
	            cuh.e("Attempting to load resource from disk");
	            if (((cuk.a().a != cul.b) && (cuk.a().a != cul.c)) || (!this.b.equals(cuk.a().b))) {
	                try {
	                    String v1_5 = new java.io.FileInputStream(this.d());
	                    try {
	                        String v0_12 = new java.io.ByteArrayOutputStream();
	                        a.a(v1_5, v0_12);
	                        String v0_15 = ((clv) cms.a(new clv(), v0_12.toByteArray()));
	                    } catch (String v0_26) {
	                        try {
	                            v1_5.close();
	                        } catch (String v1) {
	                            cuh.b("Error closing stream for reading resource from disk");
	                        }
	                        throw v0_26;
	                    } catch (String v0) {
	                        this.d.a();
	                        cuh.b("Failed to read the resource from disk");
	                        try {
	                            v1_5.close();
	                        } catch (String v0) {
	                            cuh.b("Error closing stream for reading resource from disk");
	                        }
	                        cuh.e("The Disk resource was successfully read.");
	                    } catch (String v0) {
	                        this.d.a();
	                        cuh.b("Failed to read the resource from disk. The resource is inconsistent");
	                        try {
	                            v1_5.close();
	                        } catch (String v0) {
	                            cuh.b("Error closing stream for reading resource from disk");
	                        }
	                    }
	                    if ((v0_15.b != null) || (v0_15.c != null)) {
	                        this.d.a(v0_15);
	                        try {
	                            v1_5.close();
	                        } catch (String v0) {
	                            cuh.b("Error closing stream for reading resource from disk");
	                        }
	                    } else {
	                        throw new IllegalArgumentException("Resource and SupplementedResource are NULL.");
	                    }
	                } catch (String v0) {
	                    cuh.d("Failed to find the resource in the disk");
	                    this.d.a();
	                }
	            } else {
	                this.d.a();
	            }
	            return;
	        } else {
	            throw new IllegalStateException("Callback must be set before execute");
	        }
	    }
	
	
	    java.io.File d()
	    {
	        return new java.io.File(this.a.getDir("google_tagmanager", 0), new StringBuilder("resource_").append(this.b).toString());
	    }
	
