	private bridge java.lang.String a
	private java.util.concurrent.Future b
	
	    protected brt(brb p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    private String a(android.content.Context p7)
	    {
	        java.io.IOException v0_0 = 0;
	        a.h("ClientId should be loaded from worker thread");
	        try {
	            String v2_0 = p7.openFileInput("gaClientId");
	        } catch (java.io.IOException v1_5) {
	            v2_0 = 0;
	            java.io.IOException v0_1 = v1_5;
	            if (v2_0 != null) {
	                try {
	                    v2_0.close();
	                } catch (java.io.IOException v1_16) {
	                    this.e("Failed to close client id reading stream", v1_16);
	                }
	            }
	            throw v0_1;
	        } catch (java.io.IOException v1) {
	            java.io.IOException v1_4 = 0;
	            if (v1_4 == null) {
	                return v0_0;
	            } else {
	                try {
	                    v1_4.close();
	                } catch (java.io.IOException v1_15) {
	                    this.e("Failed to close client id reading stream", v1_15);
	                }
	                return v0_0;
	            }
	        } catch (java.io.IOException v0_1) {
	        } catch (java.io.IOException v1_3) {
	            v2_0 = 0;
	            this.e("Error reading client id file, deleting it", v1_3);
	            p7.deleteFile("gaClientId");
	            if (v2_0 == null) {
	                return v0_0;
	            } else {
	                try {
	                    v2_0.close();
	                } catch (java.io.IOException v1_14) {
	                    this.e("Failed to close client id reading stream", v1_14);
	                }
	                return v0_0;
	            }
	        }
	        try {
	            String v3_0 = new byte[36];
	            int v4_1 = v2_0.read(v3_0, 0, 36);
	        } catch (java.io.IOException v1) {
	            v1_4 = v2_0;
	        } catch (java.io.IOException v1_3) {
	        }
	        if (v2_0.available() <= 0) {
	            if (v4_1 >= 14) {
	                v2_0.close();
	                java.io.IOException v1_10 = new String(v3_0, 0, v4_1);
	                this.a("Read client id from disk", v1_10);
	                if (v2_0 != null) {
	                    try {
	                        v2_0.close();
	                    } catch (java.io.IOException v0_2) {
	                        this.e("Failed to close client id reading stream", v0_2);
	                    }
	                }
	                v0_0 = v1_10;
	                return v0_0;
	            } else {
	                this.e("clientId file is empty, deleting it.");
	                v2_0.close();
	                p7.deleteFile("gaClientId");
	                if (v2_0 == null) {
	                    return v0_0;
	                } else {
	                    try {
	                        v2_0.close();
	                    } catch (java.io.IOException v1_17) {
	                        this.e("Failed to close client id reading stream", v1_17);
	                    }
	                    return v0_0;
	                }
	            }
	        } else {
	            this.e("clientId file seems corrupted, deleting it.");
	            v2_0.close();
	            p7.deleteFile("gaClientId");
	            if (v2_0 == null) {
	                return v0_0;
	            } else {
	                try {
	                    v2_0.close();
	                } catch (java.io.IOException v1_20) {
	                    this.e("Failed to close client id reading stream", v1_20);
	                }
	                return v0_0;
	            }
	        }
	    }
	
	
	    private boolean a(android.content.Context p5, String p6)
	    {
	        java.io.IOException v0_0 = 0;
	        a.f(p6);
	        a.h("ClientId should be saved from worker thread");
	        try {
	            this.a("Storing clientId", p6);
	            String v2_0 = p5.openFileOutput("gaClientId", 0);
	            v2_0.write(p6.getBytes());
	        } catch (java.io.IOException v1_6) {
	            this.e("Error creating clientId file", v1_6);
	            if (v2_0 == null) {
	                return v0_0;
	            } else {
	                try {
	                    v2_0.close();
	                } catch (java.io.IOException v1_7) {
	                    this.e("Failed to close clientId writing stream", v1_7);
	                }
	                return v0_0;
	            }
	        } catch (java.io.IOException v1_4) {
	            this.e("Error writing to clientId file", v1_4);
	            if (v2_0 == null) {
	                return v0_0;
	            } else {
	                try {
	                    v2_0.close();
	                } catch (java.io.IOException v1_5) {
	                    this.e("Failed to close clientId writing stream", v1_5);
	                }
	                return v0_0;
	            }
	        } catch (java.io.IOException v0_1) {
	            if (v2_0 != null) {
	                try {
	                    v2_0.close();
	                } catch (java.io.IOException v1_8) {
	                    this.e("Failed to close clientId writing stream", v1_8);
	                }
	            }
	            throw v0_1;
	        }
	        if (v2_0 != null) {
	            try {
	                v2_0.close();
	            } catch (java.io.IOException v0_2) {
	                this.e("Failed to close clientId writing stream", v0_2);
	            }
	        }
	        v0_0 = 1;
	        return v0_0;
	    }
	
	
	    protected final void a()
	    {
	        return;
	    }
	
	
	    public final String b()
	    {
	        this.r();
	        try {
	            if (this.a == null) {
	                this.b = this.d.b().a(new bru(this));
	            }
	        } catch (int v0_17) {
	            throw v0_17;
	        }
	        if (this.b != null) {
	            try {
	                this.a = ((String) this.b.get());
	            } catch (int v0_8) {
	                this.e("Failed to load or generate client id", v0_8);
	                this.a = "0";
	            }
	            if (this.a == null) {
	                this.a = "0";
	            }
	            this.a("Loaded clientId", this.a);
	            this.b = 0;
	        }
	        return this.a;
	    }
	
	
	    final String c()
	    {
	        this.a = 0;
	        this.b = this.d.b().a(new brv(this));
	        return this.b();
	    }
	
	
	    final String d()
	    {
	        String v0_3 = this.a(this.d.b().a);
	        if (v0_3 == null) {
	            v0_3 = this.e();
	        }
	        return v0_3;
	    }
	
	
	    String e()
	    {
	        String v0_2 = java.util.UUID.randomUUID().toString().toLowerCase();
	        try {
	            if (!this.a(this.d.b().a, v0_2)) {
	                v0_2 = "0";
	            }
	        } catch (String v0_3) {
	            this.e("Error saving clientId file", v0_3);
	            v0_2 = "0";
	        }
	        return v0_2;
	    }
	
