.class public abstract Lddg;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldea;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    return-void
.end method


# virtual methods
.method public final e()[B
    .locals 3

    .prologue
    .line 36
    :try_start_0
    invoke-virtual {p0}, Lddg;->a()I

    move-result v0

    new-array v0, v0, [B

    .line 37
    invoke-static {v0}, Lddo;->a([B)Lddo;

    move-result-object v1

    .line 38
    invoke-virtual {p0, v1}, Lddg;->a(Lddo;)V

    .line 39
    invoke-virtual {v1}, Lddo;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    return-object v0

    .line 41
    :catch_0
    move-exception v0

    .line 42
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Serializing to a byte array threw an IOException (should never happen)."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
