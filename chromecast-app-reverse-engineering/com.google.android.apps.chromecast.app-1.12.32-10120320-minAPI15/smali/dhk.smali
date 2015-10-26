.class public final Ldhk;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldhw;


# instance fields
.field private final a:Ldhg;

.field private final b:Ldgx;


# direct methods
.method public constructor <init>(Ldhg;Ldgx;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Ldhk;->a:Ldhg;

    .line 33
    iput-object p2, p0, Ldhk;->b:Ldgx;

    .line 34
    return-void
.end method


# virtual methods
.method public final a(Ldgc;)Ldge;
    .locals 6

    .prologue
    const/4 v5, 0x5

    const/4 v4, 0x4

    .line 110
    .line 10115
    invoke-static {p1}, Ldhg;->c(Ldgc;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 10116
    iget-object v0, p0, Ldhk;->b:Ldgx;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Ldgx;->a(J)Ldkv;

    move-result-object v0

    .line 111
    :goto_0
    new-instance v1, Ldhn;

    .line 11126
    iget-object v2, p1, Ldgc;->f:Ldfo;

    .line 111
    invoke-static {v0}, Ldkk;->a(Ldkv;)Ldkd;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ldhn;-><init>(Ldfo;Ldkd;)V

    return-object v1

    .line 10119
    :cond_0
    const-string v0, "chunked"

    const-string v1, "Transfer-Encoding"

    invoke-virtual {p1, v1}, Ldgc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 10120
    iget-object v1, p0, Ldhk;->b:Ldgx;

    iget-object v2, p0, Ldhk;->a:Ldhg;

    .line 10250
    iget v0, v1, Ldgx;->e:I

    if-eq v0, v4, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Ldgx;->e:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 10251
    :cond_1
    iput v5, v1, Ldgx;->e:I

    .line 10252
    new-instance v0, Ldha;

    invoke-direct {v0, v1, v2}, Ldha;-><init>(Ldgx;Ldhg;)V

    goto :goto_0

    .line 10123
    :cond_2
    invoke-static {p1}, Ldhl;->a(Ldgc;)J

    move-result-wide v0

    .line 10124
    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_3

    .line 10125
    iget-object v2, p0, Ldhk;->b:Ldgx;

    invoke-virtual {v2, v0, v1}, Ldgx;->a(J)Ldkv;

    move-result-object v0

    goto :goto_0

    .line 10131
    :cond_3
    iget-object v1, p0, Ldhk;->b:Ldgx;

    .line 10256
    iget v0, v1, Ldgx;->e:I

    if-eq v0, v4, :cond_4

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Ldgx;->e:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 10257
    :cond_4
    iput v5, v1, Ldgx;->e:I

    .line 10258
    new-instance v0, Ldhd;

    .line 10507
    invoke-direct {v0, v1}, Ldhd;-><init>(Ldgx;)V

    goto :goto_0
.end method

.method public final a(Ldfy;J)Ldku;
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 37
    const-string v0, "chunked"

    const-string v1, "Transfer-Encoding"

    invoke-virtual {p1, v1}, Ldfy;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 39
    iget-object v1, p0, Ldhk;->b:Ldgx;

    .line 1226
    iget v0, v1, Ldgx;->e:I

    if-eq v0, v2, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Ldgx;->e:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1227
    :cond_0
    iput v3, v1, Ldgx;->e:I

    .line 1228
    new-instance v0, Ldgz;

    .line 1325
    invoke-direct {v0, v1}, Ldgz;-><init>(Ldgx;)V

    .line 44
    :goto_0
    return-object v0

    .line 42
    :cond_1
    const-wide/16 v0, -0x1

    cmp-long v0, p2, v0

    if-eqz v0, :cond_3

    .line 44
    iget-object v1, p0, Ldhk;->b:Ldgx;

    .line 2232
    iget v0, v1, Ldgx;->e:I

    if-eq v0, v2, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Ldgx;->e:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2233
    :cond_2
    iput v3, v1, Ldgx;->e:I

    .line 2234
    new-instance v0, Ldhb;

    .line 2282
    invoke-direct {v0, v1, p2, p3}, Ldhb;-><init>(Ldgx;J)V

    goto :goto_0

    .line 47
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Ldhk;->b:Ldgx;

    invoke-virtual {v0}, Ldgx;->a()V

    .line 53
    return-void
.end method

.method public final a(Ldfy;)V
    .locals 5

    .prologue
    const/16 v4, 0x20

    .line 72
    iget-object v0, p0, Ldhk;->a:Ldhg;

    invoke-virtual {v0}, Ldhg;->b()V

    .line 73
    iget-object v0, p0, Ldhk;->a:Ldhg;

    .line 3408
    iget-object v0, v0, Ldhg;->c:Ldfh;

    .line 4203
    iget-object v0, v0, Ldfh;->b:Ldgf;

    .line 5066
    iget-object v0, v0, Ldgf;->b:Ljava/net/Proxy;

    .line 74
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    iget-object v1, p0, Ldhk;->a:Ldhg;

    .line 5408
    iget-object v1, v1, Ldhg;->c:Ldfh;

    .line 6281
    iget-object v1, v1, Ldfh;->g:Ldfx;

    .line 7019
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 7070
    iget-object v3, p1, Ldfy;->b:Ljava/lang/String;

    .line 7020
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7021
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 8040
    invoke-virtual {p1}, Ldfy;->e()Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    .line 7023
    :goto_0
    if-eqz v0, :cond_1

    .line 7024
    invoke-virtual {p1}, Ldfy;->a()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7029
    :goto_1
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 7030
    invoke-static {v1}, La;->a(Ldfx;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7031
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 76
    iget-object v1, p0, Ldhk;->b:Ldgx;

    .line 8074
    iget-object v2, p1, Ldfy;->c:Ldfo;

    .line 76
    invoke-virtual {v1, v2, v0}, Ldgx;->a(Ldfo;Ljava/lang/String;)V

    .line 77
    return-void

    .line 8040
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 7026
    :cond_1
    invoke-virtual {p1}, Ldfy;->a()Ljava/net/URL;

    move-result-object v0

    invoke-static {v0}, La;->a(Ljava/net/URL;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1
.end method

.method public final a(Ldhg;)V
    .locals 2

    .prologue
    .line 135
    iget-object v0, p0, Ldhk;->b:Ldgx;

    .line 11137
    sget-object v1, Ldgi;->b:Ldgi;

    iget-object v0, v0, Ldgx;->b:Ldfh;

    invoke-virtual {v1, v0, p1}, Ldgi;->a(Ldfh;Ljava/lang/Object;)V

    .line 136
    return-void
.end method

.method public final a(Ldhp;)V
    .locals 4

    .prologue
    .line 56
    iget-object v0, p0, Ldhk;->b:Ldgx;

    .line 3238
    iget v1, v0, Ldgx;->e:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v0, Ldgx;->e:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 3239
    :cond_0
    const/4 v1, 0x3

    iput v1, v0, Ldgx;->e:I

    .line 3240
    iget-object v0, v0, Ldgx;->d:Ldkc;

    invoke-virtual {p1, v0}, Ldhp;->a(Ldku;)V

    .line 57
    return-void
.end method

.method public final b()Ldgd;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Ldhk;->b:Ldgx;

    invoke-virtual {v0}, Ldgx;->c()Ldgd;

    move-result-object v0

    return-object v0
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 84
    invoke-virtual {p0}, Ldhk;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 85
    iget-object v0, p0, Ldhk;->b:Ldgx;

    .line 8108
    const/4 v1, 0x1

    iput v1, v0, Ldgx;->f:I

    .line 8111
    iget v1, v0, Ldgx;->e:I

    if-nez v1, :cond_0

    .line 8112
    const/4 v1, 0x0

    iput v1, v0, Ldgx;->f:I

    .line 8113
    sget-object v1, Ldgi;->b:Ldgi;

    iget-object v2, v0, Ldgx;->a:Ldfi;

    iget-object v0, v0, Ldgx;->b:Ldfh;

    invoke-virtual {v1, v2, v0}, Ldgi;->a(Ldfi;Ldfh;)V

    .line 89
    :cond_0
    :goto_0
    return-void

    .line 87
    :cond_1
    iget-object v0, p0, Ldhk;->b:Ldgx;

    .line 8122
    const/4 v1, 0x2

    iput v1, v0, Ldgx;->f:I

    .line 8125
    iget v1, v0, Ldgx;->e:I

    if-nez v1, :cond_0

    .line 8126
    const/4 v1, 0x6

    iput v1, v0, Ldgx;->e:I

    .line 8127
    iget-object v0, v0, Ldgx;->b:Ldfh;

    .line 8211
    iget-object v0, v0, Ldfh;->c:Ljava/net/Socket;

    .line 8127
    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    goto :goto_0
.end method

.method public final d()Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 93
    const-string v2, "close"

    iget-object v3, p0, Ldhk;->a:Ldhg;

    .line 8397
    iget-object v3, v3, Ldhg;->l:Ldfy;

    .line 93
    const-string v4, "Connection"

    invoke-virtual {v3, v4}, Ldfy;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 106
    :cond_0
    :goto_0
    return v0

    .line 98
    :cond_1
    const-string v2, "close"

    iget-object v3, p0, Ldhk;->a:Ldhg;

    invoke-virtual {v3}, Ldhg;->f()Ldgc;

    move-result-object v3

    const-string v4, "Connection"

    invoke-virtual {v3, v4}, Ldgc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 102
    iget-object v2, p0, Ldhk;->b:Ldgx;

    .line 9133
    iget v2, v2, Ldgx;->e:I

    const/4 v3, 0x6

    if-ne v2, v3, :cond_2

    move v2, v1

    .line 102
    :goto_1
    if-nez v2, :cond_0

    move v0, v1

    .line 106
    goto :goto_0

    :cond_2
    move v2, v0

    .line 9133
    goto :goto_1
.end method
