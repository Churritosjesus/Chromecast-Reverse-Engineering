.class final Ldfw;
.super Ljava/net/URLStreamHandler;
.source "PG"


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Ldfv;


# direct methods
.method constructor <init>(Ldfv;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Ldfw;->b:Ldfv;

    iput-object p2, p0, Ldfw;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/net/URLStreamHandler;-><init>()V

    return-void
.end method


# virtual methods
.method protected final getDefaultPort()I
    .locals 2

    .prologue
    .line 84
    iget-object v0, p0, Ldfw;->a:Ljava/lang/String;

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x50

    .line 85
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Ldfw;->a:Ljava/lang/String;

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x1bb

    goto :goto_0

    .line 86
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method protected final openConnection(Ljava/net/URL;)Ljava/net/URLConnection;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Ldfw;->b:Ldfv;

    invoke-virtual {v0, p1}, Ldfv;->a(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method

.method protected final openConnection(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/URLConnection;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Ldfw;->b:Ldfv;

    invoke-virtual {v0, p1, p2}, Ldfv;->a(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method
