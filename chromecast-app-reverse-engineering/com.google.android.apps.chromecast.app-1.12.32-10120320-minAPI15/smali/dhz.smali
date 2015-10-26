.class public final Ldhz;
.super Ldhx;
.source "PG"


# instance fields
.field private final a:Ldhy;


# direct methods
.method private constructor <init>(Ldhy;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1}, Ldhx;-><init>(Ljava/net/HttpURLConnection;)V

    .line 34
    iput-object p1, p0, Ldhz;->a:Ldhy;

    .line 35
    return-void
.end method

.method public constructor <init>(Ljava/net/URL;Ldft;)V
    .locals 1

    .prologue
    .line 29
    new-instance v0, Ldhy;

    invoke-direct {v0, p1, p2}, Ldhy;-><init>(Ljava/net/URL;Ldft;)V

    invoke-direct {p0, v0}, Ldhz;-><init>(Ldhy;)V

    .line 30
    return-void
.end method


# virtual methods
.method protected final a()Ldfn;
    .locals 2

    .prologue
    .line 38
    iget-object v0, p0, Ldhz;->a:Ldhy;

    iget-object v0, v0, Ldhy;->b:Ldhg;

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Connection has not yet been established"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_0
    iget-object v0, p0, Ldhz;->a:Ldhy;

    iget-object v0, v0, Ldhy;->b:Ldhg;

    invoke-virtual {v0}, Ldhg;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldhz;->a:Ldhy;

    iget-object v0, v0, Ldhy;->b:Ldhg;

    .line 46
    invoke-virtual {v0}, Ldhg;->f()Ldgc;

    move-result-object v0

    .line 1109
    iget-object v0, v0, Ldgc;->e:Ldfn;

    .line 46
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Ldhz;->a:Ldhy;

    iget-object v0, v0, Ldhy;->c:Ldfn;

    goto :goto_0
.end method

.method public final bridge synthetic addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0, p1, p2}, Ldhx;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic connect()V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->connect()V

    return-void
.end method

.method public final bridge synthetic disconnect()V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->disconnect()V

    return-void
.end method

.method public final bridge synthetic getAllowUserInteraction()Z
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getAllowUserInteraction()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic getCipherSuite()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getCipherSuite()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getConnectTimeout()I
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getConnectTimeout()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic getContent()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getContent()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getContent([Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getContentEncoding()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getContentEncoding()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getContentLength()I
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getContentLength()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic getContentType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getContentType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getDate()J
    .locals 2

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getDate()J

    move-result-wide v0

    return-wide v0
.end method

.method public final bridge synthetic getDefaultUseCaches()Z
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getDefaultUseCaches()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic getDoInput()Z
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getDoInput()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic getDoOutput()Z
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getDoOutput()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic getErrorStream()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getExpiration()J
    .locals 2

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getExpiration()J

    move-result-wide v0

    return-wide v0
.end method

.method public final bridge synthetic getHeaderField(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->getHeaderField(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getHeaderFieldDate(Ljava/lang/String;J)J
    .locals 2

    .prologue
    .line 25
    invoke-super {p0, p1, p2, p3}, Ldhx;->getHeaderFieldDate(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final bridge synthetic getHeaderFieldInt(Ljava/lang/String;I)I
    .locals 1

    .prologue
    .line 25
    invoke-super {p0, p1, p2}, Ldhx;->getHeaderFieldInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final bridge synthetic getHeaderFieldKey(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->getHeaderFieldKey(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getHeaderFields()Ljava/util/Map;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Ldhz;->a:Ldhy;

    iget-object v0, v0, Ldhy;->a:Ldft;

    .line 1397
    iget-object v0, v0, Ldft;->n:Ljavax/net/ssl/HostnameVerifier;

    .line 55
    return-object v0
.end method

.method public final bridge synthetic getIfModifiedSince()J
    .locals 2

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getIfModifiedSince()J

    move-result-wide v0

    return-wide v0
.end method

.method public final bridge synthetic getInputStream()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getInstanceFollowRedirects()Z
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getInstanceFollowRedirects()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic getLastModified()J
    .locals 2

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getLastModified()J

    move-result-wide v0

    return-wide v0
.end method

.method public final bridge synthetic getLocalCertificates()[Ljava/security/cert/Certificate;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getLocalCertificates()[Ljava/security/cert/Certificate;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getLocalPrincipal()Ljava/security/Principal;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getLocalPrincipal()Ljava/security/Principal;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getOutputStream()Ljava/io/OutputStream;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getPeerPrincipal()Ljava/security/Principal;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getPeerPrincipal()Ljava/security/Principal;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getPermission()Ljava/security/Permission;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getPermission()Ljava/security/Permission;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getReadTimeout()I
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getReadTimeout()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic getRequestMethod()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getRequestMethod()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getRequestProperties()Ljava/util/Map;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getRequestProperties()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getResponseCode()I
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getResponseCode()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic getResponseMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getResponseMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Ldhz;->a:Ldhy;

    iget-object v0, v0, Ldhy;->a:Ldft;

    .line 2382
    iget-object v0, v0, Ldft;->m:Ljavax/net/ssl/SSLSocketFactory;

    .line 63
    return-object v0
.end method

.method public final bridge synthetic getServerCertificates()[Ljava/security/cert/Certificate;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getServerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getURL()Ljava/net/URL;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getURL()Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getUseCaches()Z
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->getUseCaches()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic setAllowUserInteraction(Z)V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->setAllowUserInteraction(Z)V

    return-void
.end method

.method public final bridge synthetic setChunkedStreamingMode(I)V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->setChunkedStreamingMode(I)V

    return-void
.end method

.method public final bridge synthetic setConnectTimeout(I)V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->setConnectTimeout(I)V

    return-void
.end method

.method public final bridge synthetic setDefaultUseCaches(Z)V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->setDefaultUseCaches(Z)V

    return-void
.end method

.method public final bridge synthetic setDoInput(Z)V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->setDoInput(Z)V

    return-void
.end method

.method public final bridge synthetic setDoOutput(Z)V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->setDoOutput(Z)V

    return-void
.end method

.method public final bridge synthetic setFixedLengthStreamingMode(I)V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->setFixedLengthStreamingMode(I)V

    return-void
.end method

.method public final setFixedLengthStreamingMode(J)V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Ldhz;->a:Ldhy;

    invoke-virtual {v0, p1, p2}, Ldhy;->setFixedLengthStreamingMode(J)V

    .line 72
    return-void
.end method

.method public final setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Ldhz;->a:Ldhy;

    iget-object v0, v0, Ldhy;->a:Ldft;

    .line 1392
    iput-object p1, v0, Ldft;->n:Ljavax/net/ssl/HostnameVerifier;

    .line 52
    return-void
.end method

.method public final bridge synthetic setIfModifiedSince(J)V
    .locals 1

    .prologue
    .line 25
    invoke-super {p0, p1, p2}, Ldhx;->setIfModifiedSince(J)V

    return-void
.end method

.method public final bridge synthetic setInstanceFollowRedirects(Z)V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->setInstanceFollowRedirects(Z)V

    return-void
.end method

.method public final bridge synthetic setReadTimeout(I)V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->setReadTimeout(I)V

    return-void
.end method

.method public final bridge synthetic setRequestMethod(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->setRequestMethod(Ljava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0, p1, p2}, Ldhx;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Ldhz;->a:Ldhy;

    iget-object v0, v0, Ldhy;->a:Ldft;

    .line 2377
    iput-object p1, v0, Ldft;->m:Ljavax/net/ssl/SSLSocketFactory;

    .line 60
    return-void
.end method

.method public final bridge synthetic setUseCaches(Z)V
    .locals 0

    .prologue
    .line 25
    invoke-super {p0, p1}, Ldhx;->setUseCaches(Z)V

    return-void
.end method

.method public final bridge synthetic toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic usingProxy()Z
    .locals 1

    .prologue
    .line 25
    invoke-super {p0}, Ldhx;->usingProxy()Z

    move-result v0

    return v0
.end method
