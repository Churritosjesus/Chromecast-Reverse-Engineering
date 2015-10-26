.class final Ldgo;
.super Ldgn;
.source "PG"


# instance fields
.field private final a:Ldgm;

.field private final b:Ldgm;

.field private final c:Ljava/lang/reflect/Method;

.field private final d:Ljava/lang/reflect/Method;

.field private final e:Ldgm;

.field private final f:Ldgm;


# direct methods
.method public constructor <init>(Ldgm;Ldgm;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ldgm;Ldgm;)V
    .locals 0

    .prologue
    .line 178
    invoke-direct {p0}, Ldgn;-><init>()V

    .line 179
    iput-object p1, p0, Ldgo;->a:Ldgm;

    .line 180
    iput-object p2, p0, Ldgo;->b:Ldgm;

    .line 181
    iput-object p3, p0, Ldgo;->c:Ljava/lang/reflect/Method;

    .line 182
    iput-object p4, p0, Ldgo;->d:Ljava/lang/reflect/Method;

    .line 183
    iput-object p5, p0, Ldgo;->e:Ldgm;

    .line 184
    iput-object p6, p0, Ldgo;->f:Ldgm;

    .line 185
    return-void
.end method


# virtual methods
.method public final a(Ljava/net/Socket;)V
    .locals 4

    .prologue
    .line 224
    iget-object v0, p0, Ldgo;->c:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    .line 232
    :goto_0
    return-void

    .line 227
    :cond_0
    :try_start_0
    iget-object v0, p0, Ldgo;->c:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 228
    :catch_0
    move-exception v0

    .line 229
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 230
    :catch_1
    move-exception v0

    .line 231
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final a(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    .locals 3

    .prologue
    .line 190
    :try_start_0
    invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    return-void

    .line 191
    :catch_0
    move-exception v0

    .line 194
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Exception in connect"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 195
    invoke-virtual {v1, v0}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 196
    throw v1
.end method

.method public final a(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 7

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 203
    if-eqz p2, :cond_0

    .line 204
    iget-object v0, p0, Ldgo;->a:Ldgm;

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, p1, v1}, Ldgm;->a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    iget-object v0, p0, Ldgo;->b:Ldgm;

    new-array v1, v4, [Ljava/lang/Object;

    aput-object p2, v1, v2

    invoke-virtual {v0, p1, v1}, Ldgm;->a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    :cond_0
    iget-object v0, p0, Ldgo;->f:Ldgm;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ldgo;->f:Ldgm;

    invoke-virtual {v0, p1}, Ldgm;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 210
    new-array v3, v4, [Ljava/lang/Object;

    .line 1362
    new-instance v4, Ldjz;

    invoke-direct {v4}, Ldjz;-><init>()V

    .line 1363
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v5

    move v1, v2

    :goto_0
    if-ge v1, v5, :cond_2

    .line 1364
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldfx;

    .line 1365
    sget-object v6, Ldfx;->a:Ldfx;

    if-eq v0, v6, :cond_1

    .line 1366
    invoke-virtual {v0}, Ldfx;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v4, v6}, Ldjz;->b(I)Ldjz;

    .line 1367
    invoke-virtual {v0}, Ldfx;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ldjz;->a(Ljava/lang/String;)Ldjz;

    .line 1363
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1369
    :cond_2
    invoke-virtual {v4}, Ldjz;->p()[B

    move-result-object v0

    .line 210
    aput-object v0, v3, v2

    .line 211
    iget-object v0, p0, Ldgo;->f:Ldgm;

    invoke-virtual {v0, p1, v3}, Ldgm;->b(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    :cond_3
    return-void
.end method

.method public final b(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 216
    iget-object v0, p0, Ldgo;->e:Ldgm;

    if-nez v0, :cond_0

    move-object v0, v1

    .line 220
    :goto_0
    return-object v0

    .line 217
    :cond_0
    iget-object v0, p0, Ldgo;->e:Ldgm;

    invoke-virtual {v0, p1}, Ldgm;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_0

    .line 219
    :cond_1
    iget-object v0, p0, Ldgo;->e:Ldgm;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Ldgm;->b(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 220
    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/String;

    sget-object v2, Ldgs;->c:Ljava/nio/charset/Charset;

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object v0, v1

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method public final b(Ljava/net/Socket;)V
    .locals 4

    .prologue
    .line 236
    iget-object v0, p0, Ldgo;->d:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    .line 244
    :goto_0
    return-void

    .line 239
    :cond_0
    :try_start_0
    iget-object v0, p0, Ldgo;->d:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 240
    :catch_0
    move-exception v0

    .line 241
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 242
    :catch_1
    move-exception v0

    .line 243
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
