.class public final Ldfh;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Ldfi;

.field public final b:Ldgf;

.field public c:Ljava/net/Socket;

.field d:Z

.field e:Ldgx;

.field f:Ldjb;

.field public g:Ldfx;

.field h:J

.field public i:Ldfn;

.field j:I

.field k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldfi;Ldgf;)V
    .locals 1

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Ldfh;->d:Z

    .line 68
    sget-object v0, Ldfx;->b:Ldfx;

    iput-object v0, p0, Ldfh;->g:Ldfx;

    .line 81
    iput-object p1, p0, Ldfh;->a:Ldfi;

    .line 82
    iput-object p2, p0, Ldfh;->b:Ldgf;

    .line 83
    return-void
.end method


# virtual methods
.method final a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 92
    invoke-virtual {p0}, Ldfh;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    :goto_0
    return-void

    .line 93
    :cond_0
    iget-object v1, p0, Ldfh;->a:Ldfi;

    monitor-enter v1

    .line 94
    :try_start_0
    iget-object v0, p0, Ldfh;->k:Ljava/lang/Object;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Connection already has an owner!"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 96
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 95
    :cond_1
    :try_start_1
    iput-object p1, p0, Ldfh;->k:Ljava/lang/Object;

    .line 96
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method final a()Z
    .locals 2

    .prologue
    .line 106
    iget-object v1, p0, Ldfh;->a:Ldfi;

    monitor-enter v1

    .line 107
    :try_start_0
    iget-object v0, p0, Ldfh;->k:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 109
    const/4 v0, 0x0

    monitor-exit v1

    .line 113
    :goto_0
    return v0

    .line 112
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Ldfh;->k:Ljava/lang/Object;

    .line 113
    const/4 v0, 0x1

    monitor-exit v1

    goto :goto_0

    .line 114
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method final b()Z
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Ldfh;->c:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldfh;->c:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldfh;->c:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final c()Z
    .locals 1

    .prologue
    .line 246
    iget-object v0, p0, Ldfh;->f:Ldjb;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldfh;->f:Ldjb;

    invoke-virtual {v0}, Ldjb;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final d()J
    .locals 2

    .prologue
    .line 254
    iget-object v0, p0, Ldfh;->f:Ldjb;

    if-nez v0, :cond_0

    iget-wide v0, p0, Ldfh;->h:J

    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Ldfh;->f:Ldjb;

    invoke-virtual {v0}, Ldjb;->b()J

    move-result-wide v0

    goto :goto_0
.end method

.method final e()Z
    .locals 1

    .prologue
    .line 273
    iget-object v0, p0, Ldfh;->f:Ldjb;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 321
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Connection{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ldfh;->b:Ldgf;

    iget-object v1, v1, Ldgf;->a:Ldez;

    iget-object v1, v1, Ldez;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldfh;->b:Ldgf;

    iget-object v1, v1, Ldgf;->a:Ldez;

    iget v1, v1, Ldez;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldfh;->b:Ldgf;

    iget-object v1, v1, Ldgf;->b:Ljava/net/Proxy;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldfh;->b:Ldgf;

    iget-object v1, v1, Ldgf;->c:Ljava/net/InetSocketAddress;

    .line 326
    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Ldfh;->i:Ldfn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldfh;->i:Ldfn;

    .line 1078
    iget-object v0, v0, Ldfn;->a:Ljava/lang/String;

    .line 328
    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldfh;->g:Ldfx;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "none"

    goto :goto_0
.end method
