.class public final Ldgx;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Ldfi;

.field final b:Ldfh;

.field final c:Ldkd;

.field final d:Ldkc;

.field e:I

.field f:I

.field private final g:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Ldfi;Ldfh;Ljava/net/Socket;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput v0, p0, Ldgx;->e:I

    .line 83
    iput v0, p0, Ldgx;->f:I

    .line 87
    iput-object p1, p0, Ldgx;->a:Ldfi;

    .line 88
    iput-object p2, p0, Ldgx;->b:Ldfh;

    .line 89
    iput-object p3, p0, Ldgx;->g:Ljava/net/Socket;

    .line 90
    invoke-static {p3}, Ldkk;->b(Ljava/net/Socket;)Ldkv;

    move-result-object v0

    invoke-static {v0}, Ldkk;->a(Ldkv;)Ldkd;

    move-result-object v0

    iput-object v0, p0, Ldgx;->c:Ldkd;

    .line 91
    invoke-static {p3}, Ldkk;->a(Ljava/net/Socket;)Ldku;

    move-result-object v0

    invoke-static {v0}, Ldkk;->a(Ldku;)Ldkc;

    move-result-object v0

    iput-object v0, p0, Ldgx;->d:Ldkc;

    .line 92
    return-void
.end method

.method static synthetic a(Ldgx;Ldkh;)V
    .locals 2

    .prologue
    .line 63
    .line 2032
    iget-object v0, p1, Ldkh;->a:Ldkw;

    .line 1276
    sget-object v1, Ldkw;->b:Ldkw;

    .line 2036
    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "delegate == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2037
    :cond_0
    iput-object v1, p1, Ldkh;->a:Ldkw;

    .line 1277
    invoke-virtual {v0}, Ldkw;->n_()Ldkw;

    .line 1278
    invoke-virtual {v0}, Ldkw;->d()Ldkw;

    .line 63
    return-void
.end method


# virtual methods
.method public final a(J)Ldkv;
    .locals 3

    .prologue
    .line 244
    iget v0, p0, Ldgx;->e:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "state: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ldgx;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 245
    :cond_0
    const/4 v0, 0x5

    iput v0, p0, Ldgx;->e:I

    .line 246
    new-instance v0, Ldhc;

    invoke-direct {v0, p0, p1, p2}, Ldhc;-><init>(Ldgx;J)V

    return-object v0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Ldgx;->d:Ldkc;

    invoke-interface {v0}, Ldkc;->flush()V

    .line 142
    return-void
.end method

.method public final a(II)V
    .locals 4

    .prologue
    .line 95
    if-eqz p1, :cond_0

    .line 96
    iget-object v0, p0, Ldgx;->c:Ldkd;

    invoke-interface {v0}, Ldkd;->a()Ldkw;

    move-result-object v0

    int-to-long v2, p1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Ldkw;->a(JLjava/util/concurrent/TimeUnit;)Ldkw;

    .line 98
    :cond_0
    if-eqz p2, :cond_1

    .line 99
    iget-object v0, p0, Ldgx;->d:Ldkc;

    invoke-interface {v0}, Ldkc;->a()Ldkw;

    move-result-object v0

    int-to-long v2, p2

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Ldkw;->a(JLjava/util/concurrent/TimeUnit;)Ldkw;

    .line 101
    :cond_1
    return-void
.end method

.method public final a(Ldfo;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 171
    iget v0, p0, Ldgx;->e:I

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "state: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ldgx;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 172
    :cond_0
    iget-object v0, p0, Ldgx;->d:Ldkc;

    invoke-interface {v0, p2}, Ldkc;->b(Ljava/lang/String;)Ldkc;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Ldkc;->b(Ljava/lang/String;)Ldkc;

    .line 173
    const/4 v0, 0x0

    .line 1076
    iget-object v1, p1, Ldfo;->a:[Ljava/lang/String;

    array-length v1, v1

    div-int/lit8 v1, v1, 0x2

    .line 173
    :goto_0
    if-ge v0, v1, :cond_1

    .line 174
    iget-object v2, p0, Ldgx;->d:Ldkc;

    invoke-virtual {p1, v0}, Ldfo;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ldkc;->b(Ljava/lang/String;)Ldkc;

    move-result-object v2

    const-string v3, ": "

    .line 175
    invoke-interface {v2, v3}, Ldkc;->b(Ljava/lang/String;)Ldkc;

    move-result-object v2

    .line 176
    invoke-virtual {p1, v0}, Ldfo;->b(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ldkc;->b(Ljava/lang/String;)Ldkc;

    move-result-object v2

    const-string v3, "\r\n"

    .line 177
    invoke-interface {v2, v3}, Ldkc;->b(Ljava/lang/String;)Ldkc;

    .line 173
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 179
    :cond_1
    iget-object v0, p0, Ldgx;->d:Ldkc;

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Ldkc;->b(Ljava/lang/String;)Ldkc;

    .line 180
    const/4 v0, 0x1

    iput v0, p0, Ldgx;->e:I

    .line 181
    return-void
.end method

.method public final a(Ldfp;)V
    .locals 2

    .prologue
    .line 220
    :goto_0
    iget-object v0, p0, Ldgx;->c:Ldkd;

    invoke-interface {v0}, Ldkd;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    .line 221
    sget-object v1, Ldgi;->b:Ldgi;

    invoke-virtual {v1, p1, v0}, Ldgi;->a(Ldfp;Ljava/lang/String;)V

    goto :goto_0

    .line 223
    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 152
    :try_start_0
    iget-object v2, p0, Ldgx;->g:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getSoTimeout()I
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    .line 154
    :try_start_1
    iget-object v2, p0, Ldgx;->g:Ljava/net/Socket;

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 155
    iget-object v2, p0, Ldgx;->c:Ldkd;

    invoke-interface {v2}, Ldkd;->e()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v2

    if-eqz v2, :cond_0

    .line 160
    :try_start_2
    iget-object v2, p0, Ldgx;->g:Ljava/net/Socket;

    invoke-virtual {v2, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 165
    :goto_0
    return v0

    .line 160
    :cond_0
    iget-object v2, p0, Ldgx;->g:Ljava/net/Socket;

    invoke-virtual {v2, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    move v0, v1

    goto :goto_0

    :catchall_0
    move-exception v2

    iget-object v4, p0, Ldgx;->g:Ljava/net/Socket;

    invoke-virtual {v4, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v2
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 163
    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0

    .line 165
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method public final c()Ldgd;
    .locals 5

    .prologue
    .line 185
    iget v0, p0, Ldgx;->e:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Ldgx;->e:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 186
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "state: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ldgx;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 191
    :cond_0
    :try_start_0
    iget-object v0, p0, Ldgx;->c:Ldkd;

    invoke-interface {v0}, Ldkd;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldhv;->a(Ljava/lang/String;)Ldhv;

    move-result-object v0

    .line 193
    new-instance v1, Ldgd;

    invoke-direct {v1}, Ldgd;-><init>()V

    iget-object v2, v0, Ldhv;->a:Ldfx;

    .line 1256
    iput-object v2, v1, Ldgd;->b:Ldfx;

    .line 194
    iget v2, v0, Ldhv;->b:I

    .line 1261
    iput v2, v1, Ldgd;->c:I

    .line 195
    iget-object v2, v0, Ldhv;->c:Ljava/lang/String;

    .line 1266
    iput-object v2, v1, Ldgd;->d:Ljava/lang/String;

    .line 198
    new-instance v2, Ldfp;

    invoke-direct {v2}, Ldfp;-><init>()V

    .line 199
    invoke-virtual {p0, v2}, Ldgx;->a(Ldfp;)V

    .line 200
    sget-object v3, Ldhl;->c:Ljava/lang/String;

    iget-object v4, v0, Ldhv;->a:Ldfx;

    invoke-virtual {v4}, Ldfx;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ldfp;->a(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    .line 201
    invoke-virtual {v2}, Ldfp;->a()Ldfo;

    move-result-object v2

    invoke-virtual {v1, v2}, Ldgd;->a(Ldfo;)Ldgd;

    .line 203
    iget v0, v0, Ldhv;->b:I

    const/16 v2, 0x64

    if-eq v0, v2, :cond_0

    .line 204
    const/4 v0, 0x4

    iput v0, p0, Ldgx;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 205
    return-object v1

    .line 208
    :catch_0
    move-exception v0

    .line 210
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unexpected end of stream on "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ldgx;->b:Ldfh;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " (recycle count="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Ldgi;->b:Ldgi;

    iget-object v4, p0, Ldgx;->b:Ldfh;

    .line 211
    invoke-virtual {v3, v4}, Ldgi;->b(Ldfh;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 212
    invoke-virtual {v1, v0}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 213
    throw v1
.end method
