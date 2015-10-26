.class public abstract Lddh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldeb;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    return-void
.end method

.method private a([BII)Lddh;
    .locals 3

    .prologue
    .line 161
    const/4 v0, 0x0

    .line 162
    :try_start_0
    invoke-static {p1, v0, p3}, Lddn;->a([BII)Lddn;

    move-result-object v0

    .line 1109
    invoke-static {}, Lddp;->a()Lddp;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lddh;->a(Lddn;Lddp;)Lddh;

    .line 164
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lddn;->a(I)V
    :try_end_0
    .catch Lddx; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 165
    return-object p0

    .line 166
    :catch_0
    move-exception v0

    .line 167
    throw v0

    .line 168
    :catch_1
    move-exception v0

    .line 169
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Reading from a byte array threw an IOException (should never happen)."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public abstract a()Lddh;
.end method

.method public abstract a(Lddn;Lddp;)Lddh;
.end method

.method public final synthetic a([B)Ldeb;
    .locals 2

    .prologue
    .line 100
    .line 1154
    const/4 v0, 0x0

    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, Lddh;->a([BII)Lddh;

    move-result-object v0

    .line 100
    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 100
    invoke-virtual {p0}, Lddh;->a()Lddh;

    move-result-object v0

    return-object v0
.end method
