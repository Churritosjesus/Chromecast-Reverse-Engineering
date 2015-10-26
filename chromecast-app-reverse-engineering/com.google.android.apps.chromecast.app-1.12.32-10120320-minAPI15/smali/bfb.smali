.class public final Lbfb;
.super Lbfp;
.source "PG"


# instance fields
.field a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lbfp;-><init>(Ljava/lang/String;)V

    .line 19
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v0, -0x1

    .line 24
    :try_start_0
    const-string v2, "NOTICE.html.gz"

    sget v3, Lbfb;->c:I

    invoke-virtual {p0, v2, v3}, Lbfb;->a(Ljava/lang/String;I)Lbfq;

    move-result-object v2

    .line 25
    invoke-interface {v2}, Lbfq;->b()I

    move-result v3

    const/16 v4, 0xc8

    if-eq v3, v4, :cond_0

    .line 36
    :goto_0
    return v0

    .line 28
    :cond_0
    invoke-interface {v2}, Lbfq;->c()Lbfc;

    move-result-object v2

    .line 29
    if-eqz v2, :cond_2

    .line 1085
    iget-object v2, v2, Lbfc;->a:[B

    .line 2041
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2042
    const/16 v4, 0x800

    new-array v4, v4, [C

    .line 2044
    new-instance v5, Ljava/io/InputStreamReader;

    new-instance v6, Ljava/util/zip/GZIPInputStream;

    new-instance v7, Ljava/io/ByteArrayInputStream;

    invoke-direct {v7, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v6, v7}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v5, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 2046
    :goto_1
    invoke-virtual {v5, v4}, Ljava/io/Reader;->read([C)I

    move-result v2

    if-ltz v2, :cond_1

    .line 2047
    const/4 v6, 0x0

    invoke-virtual {v3, v4, v6, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 34
    :catch_0
    move-exception v1

    goto :goto_0

    .line 2049
    :cond_1
    invoke-virtual {v5}, Ljava/io/Reader;->close()V

    .line 2050
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 30
    iput-object v2, p0, Lbfb;->a:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_2
    move v0, v1

    .line 32
    goto :goto_0

    .line 36
    :catch_1
    move-exception v0

    const/4 v0, -0x2

    goto :goto_0
.end method
