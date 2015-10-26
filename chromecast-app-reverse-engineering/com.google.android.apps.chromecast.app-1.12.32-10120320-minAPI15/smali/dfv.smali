.class public final Ldfv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/net/URLStreamHandlerFactory;


# instance fields
.field private final a:Ldft;


# direct methods
.method public constructor <init>(Ldft;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Ldfv;->a:Ldft;

    .line 33
    return-void
.end method


# virtual methods
.method public final a(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Ldfv;->a:Ldft;

    .line 1296
    iget-object v0, v0, Ldft;->d:Ljava/net/Proxy;

    .line 48
    invoke-virtual {p0, p1, v0}, Ldfv;->a(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method

.method final a(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/HttpURLConnection;
    .locals 4

    .prologue
    .line 52
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    .line 53
    iget-object v1, p0, Ldfv;->a:Ldft;

    .line 1612
    new-instance v2, Ldft;

    invoke-direct {v2, v1}, Ldft;-><init>(Ldft;)V

    .line 1613
    iget-object v3, v2, Ldft;->h:Ljava/net/ProxySelector;

    if-nez v3, :cond_0

    .line 1614
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v3

    iput-object v3, v2, Ldft;->h:Ljava/net/ProxySelector;

    .line 1616
    :cond_0
    iget-object v3, v2, Ldft;->i:Ljava/net/CookieHandler;

    if-nez v3, :cond_1

    .line 1617
    invoke-static {}, Ljava/net/CookieHandler;->getDefault()Ljava/net/CookieHandler;

    move-result-object v3

    iput-object v3, v2, Ldft;->i:Ljava/net/CookieHandler;

    .line 1619
    :cond_1
    iget-object v3, v2, Ldft;->l:Ljavax/net/SocketFactory;

    if-nez v3, :cond_2

    .line 1620
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v3

    iput-object v3, v2, Ldft;->l:Ljavax/net/SocketFactory;

    .line 1622
    :cond_2
    iget-object v3, v2, Ldft;->m:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v3, :cond_3

    .line 1623
    invoke-virtual {v1}, Ldft;->a()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    iput-object v1, v2, Ldft;->m:Ljavax/net/ssl/SSLSocketFactory;

    .line 1625
    :cond_3
    iget-object v1, v2, Ldft;->n:Ljavax/net/ssl/HostnameVerifier;

    if-nez v1, :cond_4

    .line 1626
    sget-object v1, Ldjt;->a:Ldjt;

    iput-object v1, v2, Ldft;->n:Ljavax/net/ssl/HostnameVerifier;

    .line 1628
    :cond_4
    iget-object v1, v2, Ldft;->o:Ldfd;

    if-nez v1, :cond_5

    .line 1629
    sget-object v1, Ldfd;->a:Ldfd;

    iput-object v1, v2, Ldft;->o:Ldfd;

    .line 1631
    :cond_5
    iget-object v1, v2, Ldft;->p:Ldfa;

    if-nez v1, :cond_6

    .line 1632
    sget-object v1, Ldgu;->a:Ldfa;

    iput-object v1, v2, Ldft;->p:Ldfa;

    .line 1634
    :cond_6
    iget-object v1, v2, Ldft;->q:Ldfi;

    if-nez v1, :cond_7

    .line 1635
    invoke-static {}, Ldfi;->a()Ldfi;

    move-result-object v1

    iput-object v1, v2, Ldft;->q:Ldfi;

    .line 1637
    :cond_7
    iget-object v1, v2, Ldft;->e:Ljava/util/List;

    if-nez v1, :cond_8

    .line 1638
    sget-object v1, Ldft;->a:Ljava/util/List;

    iput-object v1, v2, Ldft;->e:Ljava/util/List;

    .line 1640
    :cond_8
    iget-object v1, v2, Ldft;->f:Ljava/util/List;

    if-nez v1, :cond_9

    .line 1641
    sget-object v1, Ldft;->b:Ljava/util/List;

    iput-object v1, v2, Ldft;->f:Ljava/util/List;

    .line 1643
    :cond_9
    iget-object v1, v2, Ldft;->r:Ldgk;

    if-nez v1, :cond_a

    .line 1644
    sget-object v1, Ldgk;->a:Ldgk;

    iput-object v1, v2, Ldft;->r:Ldgk;

    .line 2291
    :cond_a
    iput-object p2, v2, Ldft;->d:Ljava/net/Proxy;

    .line 56
    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    new-instance v0, Ldhy;

    invoke-direct {v0, p1, v2}, Ldhy;-><init>(Ljava/net/URL;Ldft;)V

    .line 57
    :goto_0
    return-object v0

    :cond_b
    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v0, Ldhz;

    invoke-direct {v0, p1, v2}, Ldhz;-><init>(Ljava/net/URL;Ldft;)V

    goto :goto_0

    .line 58
    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected protocol: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final synthetic clone()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 28
    .line 3044
    new-instance v0, Ldfv;

    iget-object v1, p0, Ldfv;->a:Ldft;

    invoke-virtual {v1}, Ldft;->b()Ldft;

    move-result-object v1

    invoke-direct {v0, v1}, Ldfv;-><init>(Ldft;)V

    .line 28
    return-object v0
.end method

.method public final createURLStreamHandler(Ljava/lang/String;)Ljava/net/URLStreamHandler;
    .locals 1

    .prologue
    .line 72
    const-string v0, "http"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "https"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 74
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ldfw;

    invoke-direct {v0, p0, p1}, Ldfw;-><init>(Ldfv;Ljava/lang/String;)V

    goto :goto_0
.end method
