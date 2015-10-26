.class public final Lbfm;
.super Lbfp;
.source "PG"


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
    .locals 4

    .prologue
    const/4 v0, -0x1

    .line 24
    :try_start_0
    const-string v1, "scan_wifi"

    const/4 v2, 0x0

    sget v3, Lbfm;->c:I

    invoke-virtual {p0, v1, v2, v3}, Lbfm;->a(Ljava/lang/String;Lbfc;I)Lbfq;

    move-result-object v1

    .line 25
    invoke-interface {v1}, Lbfq;->b()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    .line 26
    const/4 v0, 0x0

    .line 30
    :cond_0
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, -0x2

    goto :goto_0

    .line 28
    :catch_1
    move-exception v1

    goto :goto_0
.end method
