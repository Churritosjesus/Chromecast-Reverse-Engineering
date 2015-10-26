.class public final Ldfk;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final a:Ldfk;

.field public static final b:Ldfk;

.field public static final c:Ldfk;

.field private static final h:[Ldfg;


# instance fields
.field final d:Z

.field final e:[Ljava/lang/String;

.field final f:[Ljava/lang/String;

.field public final g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v1, 0x0

    const/4 v6, 0x1

    .line 33
    const/16 v0, 0xe

    new-array v0, v0, [Ldfg;

    sget-object v2, Ldfg;->m:Ldfg;

    aput-object v2, v0, v1

    sget-object v2, Ldfg;->n:Ldfg;

    aput-object v2, v0, v6

    sget-object v2, Ldfg;->h:Ldfg;

    aput-object v2, v0, v7

    sget-object v2, Ldfg;->j:Ldfg;

    aput-object v2, v0, v8

    const/4 v2, 0x4

    sget-object v3, Ldfg;->i:Ldfg;

    aput-object v3, v0, v2

    const/4 v2, 0x5

    sget-object v3, Ldfg;->k:Ldfg;

    aput-object v3, v0, v2

    const/4 v2, 0x6

    sget-object v3, Ldfg;->l:Ldfg;

    aput-object v3, v0, v2

    const/4 v2, 0x7

    sget-object v3, Ldfg;->d:Ldfg;

    aput-object v3, v0, v2

    const/16 v2, 0x8

    sget-object v3, Ldfg;->c:Ldfg;

    aput-object v3, v0, v2

    const/16 v2, 0x9

    sget-object v3, Ldfg;->f:Ldfg;

    aput-object v3, v0, v2

    const/16 v2, 0xa

    sget-object v3, Ldfg;->g:Ldfg;

    aput-object v3, v0, v2

    const/16 v2, 0xb

    sget-object v3, Ldfg;->b:Ldfg;

    aput-object v3, v0, v2

    const/16 v2, 0xc

    sget-object v3, Ldfg;->e:Ldfg;

    aput-object v3, v0, v2

    const/16 v2, 0xd

    sget-object v3, Ldfg;->a:Ldfg;

    aput-object v3, v0, v2

    sput-object v0, Ldfk;->h:[Ldfg;

    .line 55
    new-instance v2, Ldfl;

    invoke-direct {v2, v6}, Ldfl;-><init>(Z)V

    sget-object v3, Ldfk;->h:[Ldfg;

    .line 6289
    iget-boolean v0, v2, Ldfl;->a:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no cipher suites for cleartext connections"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6292
    :cond_0
    array-length v0, v3

    new-array v4, v0, [Ljava/lang/String;

    move v0, v1

    .line 6293
    :goto_0
    array-length v5, v3

    if-ge v0, v5, :cond_1

    .line 6294
    aget-object v5, v3, v0

    iget-object v5, v5, Ldfg;->o:Ljava/lang/String;

    aput-object v5, v4, v0

    .line 6293
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6296
    :cond_1
    iput-object v4, v2, Ldfl;->b:[Ljava/lang/String;

    .line 56
    new-array v0, v8, [Ldgg;

    sget-object v3, Ldgg;->a:Ldgg;

    aput-object v3, v0, v1

    sget-object v3, Ldgg;->b:Ldgg;

    aput-object v3, v0, v6

    sget-object v3, Ldgg;->c:Ldgg;

    aput-object v3, v0, v7

    .line 57
    invoke-virtual {v2, v0}, Ldfl;->a([Ldgg;)Ldfl;

    move-result-object v0

    .line 58
    invoke-virtual {v0, v6}, Ldfl;->a(Z)Ldfl;

    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ldfl;->a()Ldfk;

    move-result-object v0

    sput-object v0, Ldfk;->a:Ldfk;

    .line 62
    new-instance v0, Ldfl;

    sget-object v2, Ldfk;->a:Ldfk;

    invoke-direct {v0, v2}, Ldfl;-><init>(Ldfk;)V

    new-array v2, v6, [Ldgg;

    sget-object v3, Ldgg;->c:Ldgg;

    aput-object v3, v2, v1

    .line 63
    invoke-virtual {v0, v2}, Ldfl;->a([Ldgg;)Ldfl;

    move-result-object v0

    .line 64
    invoke-virtual {v0, v6}, Ldfl;->a(Z)Ldfl;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ldfl;->a()Ldfk;

    move-result-object v0

    sput-object v0, Ldfk;->b:Ldfk;

    .line 68
    new-instance v0, Ldfl;

    invoke-direct {v0, v1}, Ldfl;-><init>(Z)V

    invoke-virtual {v0}, Ldfl;->a()Ldfk;

    move-result-object v0

    sput-object v0, Ldfk;->c:Ldfk;

    return-void
.end method

.method constructor <init>(Ldfl;)V
    .locals 1

    .prologue
    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1271
    iget-boolean v0, p1, Ldfl;->a:Z

    .line 84
    iput-boolean v0, p0, Ldfk;->d:Z

    .line 2271
    iget-object v0, p1, Ldfl;->b:[Ljava/lang/String;

    .line 85
    iput-object v0, p0, Ldfk;->e:[Ljava/lang/String;

    .line 3271
    iget-object v0, p1, Ldfl;->c:[Ljava/lang/String;

    .line 86
    iput-object v0, p0, Ldfk;->f:[Ljava/lang/String;

    .line 4271
    iget-boolean v0, p1, Ldfl;->d:Z

    .line 87
    iput-boolean v0, p0, Ldfk;->g:Z

    .line 88
    return-void
.end method

.method private a()Ljava/util/List;
    .locals 3

    .prologue
    .line 110
    iget-object v0, p0, Ldfk;->f:[Ljava/lang/String;

    array-length v0, v0

    new-array v1, v0, [Ldgg;

    .line 111
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Ldfk;->f:[Ljava/lang/String;

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 112
    iget-object v2, p0, Ldfk;->f:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-static {v2}, Ldgg;->a(Ljava/lang/String;)Ldgg;

    move-result-object v2

    aput-object v2, v1, v0

    .line 111
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 114
    :cond_0
    invoke-static {v1}, Ldgs;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static a([Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 212
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    array-length v2, p0

    if-eqz v2, :cond_0

    array-length v2, p1

    if-nez v2, :cond_2

    :cond_0
    move v0, v1

    .line 220
    :cond_1
    :goto_0
    return v0

    .line 215
    :cond_2
    array-length v4, p0

    move v3, v1

    :goto_1
    if-ge v3, v4, :cond_5

    aget-object v5, p0, v3

    .line 5224
    array-length v6, p1

    move v2, v1

    :goto_2
    if-ge v2, v6, :cond_4

    aget-object v7, p1, v2

    .line 5225
    invoke-static {v5, v7}, Ldgs;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move v2, v0

    .line 216
    :goto_3
    if-nez v2, :cond_1

    .line 215
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_1

    .line 5224
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    move v2, v1

    .line 5229
    goto :goto_3

    :cond_5
    move v0, v1

    .line 220
    goto :goto_0
.end method

.method static synthetic a(Ldfk;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Ldfk;->e:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Ldfk;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Ldfk;->f:[Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a(Ljavax/net/ssl/SSLSocket;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 186
    iget-boolean v1, p0, Ldfk;->d:Z

    if-nez v1, :cond_1

    .line 203
    :cond_0
    :goto_0
    return v0

    .line 190
    :cond_1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v1

    .line 191
    iget-object v2, p0, Ldfk;->f:[Ljava/lang/String;

    invoke-static {v2, v1}, Ldfk;->a([Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    .line 192
    if-eqz v1, :cond_0

    .line 197
    iget-object v1, p0, Ldfk;->e:[Ljava/lang/String;

    if-nez v1, :cond_2

    .line 198
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v1

    array-length v1, v1

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 200
    :cond_2
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    .line 201
    iget-object v1, p0, Ldfk;->e:[Ljava/lang/String;

    invoke-static {v1, v0}, Ldfk;->a([Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 233
    instance-of v2, p1, Ldfk;

    if-nez v2, :cond_1

    .line 245
    :cond_0
    :goto_0
    return v0

    .line 234
    :cond_1
    if-ne p1, p0, :cond_2

    move v0, v1

    goto :goto_0

    .line 236
    :cond_2
    check-cast p1, Ldfk;

    .line 237
    iget-boolean v2, p0, Ldfk;->d:Z

    iget-boolean v3, p1, Ldfk;->d:Z

    if-ne v2, v3, :cond_0

    .line 239
    iget-boolean v2, p0, Ldfk;->d:Z

    if-eqz v2, :cond_3

    .line 240
    iget-object v2, p0, Ldfk;->e:[Ljava/lang/String;

    iget-object v3, p1, Ldfk;->e:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 241
    iget-object v2, p0, Ldfk;->f:[Ljava/lang/String;

    iget-object v3, p1, Ldfk;->f:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 242
    iget-boolean v2, p0, Ldfk;->g:Z

    iget-boolean v3, p1, Ldfk;->g:Z

    if-ne v2, v3, :cond_0

    :cond_3
    move v0, v1

    .line 245
    goto :goto_0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 249
    const/16 v0, 0x11

    .line 250
    iget-boolean v1, p0, Ldfk;->d:Z

    if-eqz v1, :cond_0

    .line 251
    iget-object v0, p0, Ldfk;->e:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    .line 252
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ldfk;->f:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 253
    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v0, p0, Ldfk;->g:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    .line 255
    :cond_0
    return v0

    .line 253
    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 259
    iget-boolean v0, p0, Ldfk;->d:Z

    if-eqz v0, :cond_3

    .line 6099
    iget-object v0, p0, Ldfk;->e:[Ljava/lang/String;

    if-nez v0, :cond_0

    .line 6100
    const/4 v0, 0x0

    .line 261
    :goto_0
    if-nez v0, :cond_2

    const-string v0, "[use default]"

    .line 262
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ConnectionSpec(cipherSuites="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tlsVersions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 263
    invoke-direct {p0}, Ldfk;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", supportsTlsExtensions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ldfk;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 267
    :goto_2
    return-object v0

    .line 6102
    :cond_0
    iget-object v0, p0, Ldfk;->e:[Ljava/lang/String;

    array-length v0, v0

    new-array v1, v0, [Ldfg;

    .line 6103
    const/4 v0, 0x0

    :goto_3
    iget-object v2, p0, Ldfk;->e:[Ljava/lang/String;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 6104
    iget-object v2, p0, Ldfk;->e:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-static {v2}, Ldfg;->a(Ljava/lang/String;)Ldfg;

    move-result-object v2

    aput-object v2, v1, v0

    .line 6103
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 6106
    :cond_1
    invoke-static {v1}, Ldgs;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 261
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 267
    :cond_3
    const-string v0, "ConnectionSpec()"

    goto :goto_2
.end method
