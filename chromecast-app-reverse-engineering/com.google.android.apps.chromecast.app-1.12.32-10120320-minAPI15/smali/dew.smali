.class public abstract Ldew;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public volatile t:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, -0x1

    iput v0, p0, Ldew;->t:I

    return-void
.end method

.method public static final a(Ldew;[B)Ldew;
    .locals 2

    .prologue
    .line 131
    const/4 v0, 0x0

    array-length v1, p1

    invoke-static {p0, p1, v0, v1}, Ldew;->a(Ldew;[BII)Ldew;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ldew;[BII)Ldew;
    .locals 2

    .prologue
    .line 141
    const/4 v0, 0x0

    .line 3060
    :try_start_0
    new-instance v1, Ldeo;

    invoke-direct {v1, p1, v0, p3}, Ldeo;-><init>([BII)V

    .line 143
    invoke-virtual {p0, v1}, Ldew;->a(Ldeo;)Ldew;

    .line 144
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ldeo;->a(I)V
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 145
    return-object p0

    .line 146
    :catch_0
    move-exception v0

    .line 147
    throw v0

    .line 149
    :catch_1
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Reading from a byte array threw an IOException (should never happen)."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final a(Ldew;)[B
    .locals 3

    .prologue
    .line 100
    invoke-virtual {p0}, Ldew;->d()I

    move-result v0

    new-array v0, v0, [B

    .line 101
    array-length v1, v0

    .line 1115
    const/4 v2, 0x0

    .line 1116
    :try_start_0
    invoke-static {v0, v2, v1}, Ldep;->a([BII)Ldep;

    move-result-object v1

    .line 1117
    invoke-virtual {p0, v1}, Ldew;->a(Ldep;)V

    .line 2894
    iget-object v1, v1, Ldep;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    .line 1905
    if-eqz v1, :cond_0

    .line 1906
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1119
    :catch_0
    move-exception v0

    .line 1120
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Serializing to a byte array threw an IOException (should never happen)."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 102
    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 76
    const/4 v0, 0x0

    return v0
.end method

.method public abstract a(Ldeo;)Ldew;
.end method

.method public a(Ldep;)V
    .locals 0

    .prologue
    .line 87
    return-void
.end method

.method public c()Ldew;
    .locals 1

    .prologue
    .line 196
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldew;

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 41
    invoke-virtual {p0}, Ldew;->c()Ldew;

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 65
    invoke-virtual {p0}, Ldew;->a()I

    move-result v0

    .line 66
    iput v0, p0, Ldew;->t:I

    .line 67
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 188
    invoke-static {p0}, La;->a(Ldew;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
